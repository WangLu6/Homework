package org.westos.设计模式.单例设计模式.抽象工厂模式;

public class SmsRewarder implements Rewarder {
    @Override
    public void reward() {
        System.out.println("SmsRewarder");
    }
}
