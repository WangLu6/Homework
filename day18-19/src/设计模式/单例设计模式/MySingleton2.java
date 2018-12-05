package org.westos.设计模式.单例设计模式.单例设计模式;


//懒汉式
public class MySingleton2 {
    private MySingleton2(){
    }
    private static MySingleton2 Me;
    public static MySingleton2 getInstance(){
        if(Me==null){
            Me =new MySingleton2();
        }
        return Me;
    }
    public void show(){
        System.out.println("MySingleton2");
    }
}
