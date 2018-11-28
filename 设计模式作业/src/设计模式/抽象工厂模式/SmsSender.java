package org.westos.设计模式.单例设计模式.抽象工厂模式;

public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("SmsSender");
    }
}
