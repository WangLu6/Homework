package org.westos.设计模式.单例设计模式.抽象工厂模式;

public class FactorySms implements Provider {
    @Override
    public Sender providSend() { return new SmsSender();  }
    @Override
    public Rewarder provideReward() {  return new SmsRewarder(); }
}
