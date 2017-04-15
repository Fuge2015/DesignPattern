package com.fuge.FactoryMethod;

public class Main {

    public static void main(String[] args) {
	    Sender smsSender = new SendFactory().produce("sms");
        Sender mailSender = new SendFactory().produce("mail");
        smsSender.send();
        mailSender.send();

        Sender smsSender2 = new MultiSendFactory().produceSms();
        Sender mailSender2 = new MultiSendFactory().produceMail();
        smsSender2.send();
        mailSender2.send();
    }
}
