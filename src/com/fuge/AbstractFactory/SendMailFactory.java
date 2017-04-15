package com.fuge.AbstractFactory;

/**
 * Created by dongfu on 17-4-14.
 */
public class SendMailFactory implements Provider {
    public Sender produce() {
        return new MailSender();
    }
}
