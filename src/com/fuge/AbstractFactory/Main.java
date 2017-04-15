package com.fuge.AbstractFactory;

/**
 * Created by dongfu on 17-4-14.
 */
public class Main {
    public static void main(String[] args) {
        SendMailFactory smf = new SendMailFactory();
        SendSmsFactory ssf = new SendSmsFactory();
        smf.produce().send();
        ssf.produce().send();
    }
}
