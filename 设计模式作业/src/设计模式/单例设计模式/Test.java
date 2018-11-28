package org.westos.设计模式.单例设计模式.单例设计模式;

public class Test {
    public static void main(String[] args) {
       MySingleton.getInstance().show();
       MySingleton2.getInstance().show();
       MySingleton3.singleton.show();
       MySingleton4.getInstance().show();
    }
}
