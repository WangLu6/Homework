package org.westos.设计模式.单例设计模式.抽象工厂模式;

public class FactoryMail implements Provider {
    @Override
    public Sender providSend() { return new MailSender(); }
    @Override
    public Rewarder provideReward() { return new MailRewarder(); }
}
