package com.fuge.FactoryMethod;

/**
 * 普通工厂模式：对实现了同一个接口的实现类进行实例的创建。
 * Created by dongfu on 17-4-14.
 */
class SendFactory {
    Sender produce(String type) {
        if (type.equals("mail")) {
            return new MailSender();
        }
        if (type.equals("sms")) {
            return new SmsSender();
        }
        System.out.println("enter correct type.");
        return null;
    }
}
