package org.westos.设计模式.单例设计模式.抽象工厂模式;

public interface Provider {
    public Sender providSend();
    public Rewarder provideReward();
}
