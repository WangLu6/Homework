package org.westos.设计模式.单例设计模式.抽象工厂模式;

public class Test {
    public static void main(String[] args) {
        FactoryMail factoryMail = new FactoryMail();
        Rewarder rewarder = factoryMail.provideReward();
        Sender sender = factoryMail.providSend();
        rewarder.reward();
        sender.send();
    }
}
