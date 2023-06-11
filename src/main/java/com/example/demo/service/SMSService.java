package com.example.demo.service;

public class SMSService implements MessageService {
    @Override
    public void sendMessage(String msg, String recipient) {
        System.out.println("SMS send to "+recipient+" and message is: "+msg);
    }
}
