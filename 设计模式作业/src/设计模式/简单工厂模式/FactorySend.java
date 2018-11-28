package org.westos.设计模式.单例设计模式.简单工厂模式;

public class FactorySend {
    public Sender provide(String type){
        if("mail".equals(type)){
            return new MailSender();
        }else if("sms".equals(type)){
            return new SmsSender();
        }else{
            return null;
        }
    }
}
