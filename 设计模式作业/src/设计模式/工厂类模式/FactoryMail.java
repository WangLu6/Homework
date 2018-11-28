package org.westos.设计模式.单例设计模式.工厂类模式;

public class FactoryMail implements Provider {
    @Override
    public Sender provid() {  return new MailSender();}
}
