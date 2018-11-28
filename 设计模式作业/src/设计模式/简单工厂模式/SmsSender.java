package org.westos.设计模式.单例设计模式.简单工厂模式;

public class SmsSender implements Sender{
    @Override
    public void send() {
        System.out.println("SmsSender");
    }
}
