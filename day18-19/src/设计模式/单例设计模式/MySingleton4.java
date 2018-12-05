package org.westos.设计模式.单例设计模式.单例设计模式;


//最佳懒汉式
public class MySingleton4 {
    private MySingleton4(){
    }
    private static class Holder{
       static MySingleton4 ME = new MySingleton4();
    }
    public static MySingleton4 getInstance(){
        return Holder.ME;
    }
    public void show(){
        System.out.println("MySingleton4");
    }
}
