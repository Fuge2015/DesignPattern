package com.fuge.FactoryMethod;

/**
 * 静态工厂模式：将多个工厂中的方法设置为静态的，不需要创建，直接应用即可。
 * Created by dongfu on 17-4-14.
 */
public class StaticSendFactory {
    public static Sender produceSms() {
        return new SmsSender();
    }

    public static Sender produceMail() {
        return new MailSender();
    }
}
