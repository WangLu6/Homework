package org.westos.设计模式.单例设计模式.简单工厂模式;

public class Test {
    public static void main(String[] args) {
        FactorySend factorySend = new FactorySend();
        Sender mail = factorySend.provide("mail");
        Sender sms = factorySend.provide("sms");
        mail.send();
        sms.send();
    }
}
