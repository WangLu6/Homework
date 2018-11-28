package org.westos.设计模式.单例设计模式.工厂类模式;

public class Test {
    public static void main(String[] args) {
        FactorySms sms = new FactorySms();
        Sender sender = sms.provid();
        sender.send();
        FactoryMail mail = new FactoryMail();
        Sender sender1 = mail.provid();
        sender1.send();
    }
}
