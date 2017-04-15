package com.fuge.AbstractFactory;

/**
 * Created by dongfu on 17-4-14.
 */
public class MailSender implements Sender {
    public void send() {
        System.out.println("send mail.");
    }
}
