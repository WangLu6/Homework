package org.westos.设计模式.单例设计模式.享元模式;


//FlyWeight 在享元池中共享一段数据Integet（-128到127） 逻辑上不同 物理上共分享内存

//byte short Character long
public class Demo1 {
    public static void main(String[] args) {
        Integer num1 = -128;
        Integer num2=-128;
        Integer num3 = 128;
        Integer num4=128;
        System.out.println(num1==num2);
        System.out.println(num3==num4);
    }
}
