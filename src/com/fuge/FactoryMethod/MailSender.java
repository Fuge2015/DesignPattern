package com.fuge.FactoryMethod;

/**
 * Created by dongfu on 17-4-14.
 */
class MailSender implements Sender {
    public void send() {
        System.out.println("MailSender.");
    }
}
