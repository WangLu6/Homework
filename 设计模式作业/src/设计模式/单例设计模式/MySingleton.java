package org.westos.设计模式.单例设计模式.单例设计模式;


//饿汉式
public class MySingleton {
    private MySingleton(){
    }
    private static final MySingleton ME =new MySingleton();
    public static MySingleton getInstance(){
        return ME;
    }
    public void show(){
        System.out.println("MySingleton");
    }
}
