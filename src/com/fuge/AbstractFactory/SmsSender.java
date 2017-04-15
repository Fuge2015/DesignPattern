package com.fuge.AbstractFactory;

/**
 * Created by dongfu on 17-4-14.
 */
public class SmsSender implements Sender {
    public void send() {
        System.out.println("send sms.");
    }
}
