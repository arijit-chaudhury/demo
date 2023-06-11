package com.example.demo.controller;

import com.example.demo.annotation.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

@RestController
public class FileController {

    private final static Logger LOGGER = LoggerFactory.getLogger(FileController.class);

    @Log
    @PostMapping(value="/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<String> receiveFileForProcessing(
            @RequestParam(value="files") final MultipartFile[] files){
        List<File> convertedFiles = convertMultipartFileToFile(files);
        LOGGER.info(convertedFiles.toString());
        convertedFiles.stream().forEach(a->LOGGER.info(a.getAbsolutePath()));
        return new ResponseEntity<>("Ok", HttpStatus.OK);
    }

    @GetMapping(value="/upload")
    public void getUploadData(){
        LOGGER.info("Upload Data");
    }

    @GetMapping(value="/test")
    public void getTestData(){
        LOGGER.info("Test Data");
    }

    private List<File> convertMultipartFileToFile(MultipartFile[] multipartFiles) {
        List<File> files = new ArrayList<>(multipartFiles.length);
        List<CompletableFuture> futureFiles =
                Arrays.stream(multipartFiles)
                .map(multipartFile ->
                        CompletableFuture.supplyAsync(
                                () ->
                                      files.add(convertFile(multipartFile)), Executors.newFixedThreadPool(10)))
                .collect(Collectors.toList());
        CompletableFuture.allOf(futureFiles.toArray(new CompletableFuture[0])).join();
        return files;
    }

    private File convertFile(MultipartFile multipartFile) {
        var convertedFile = new File(multipartFile.getOriginalFilename());
        try{
            var fos = new FileOutputStream(convertedFile);
            fos.write(multipartFile.getBytes());
        } catch(IOException e) {
            e.printStackTrace();
        }
        return convertedFile;
    }
}
