package com.fuge.FactoryMethod;

/**
 * 多个工厂方法模式：对普通工厂模式进行改进，在普通工厂模式中，如果传递的参数不正确，就不能正确的创建对象，
 * 而多个工厂方法模式提供多个工厂方法，分别创建对象。
 * Created by dongfu on 17-4-14.
 */
class MultiSendFactory {
    Sender produceSms() {
        return new SmsSender();
    }

    Sender produceMail() {
        return new MailSender();
    }
}
