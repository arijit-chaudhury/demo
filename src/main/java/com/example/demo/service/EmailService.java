package com.example.demo.service;

public class EmailService implements MessageService {
    @Override
    public void sendMessage(String msg, String recipient) {
        System.out.println("Email send to "+recipient+" and message is: "+msg);
    }
}
