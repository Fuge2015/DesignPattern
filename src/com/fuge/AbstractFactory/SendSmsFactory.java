package com.fuge.AbstractFactory;

/**
 * Created by dongfu on 17-4-14.
 */
public class SendSmsFactory implements Provider {
    public Sender produce() {
        return new SmsSender();
    }
}
