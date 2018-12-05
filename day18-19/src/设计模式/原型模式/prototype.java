package org.westos.设计模式.单例设计模式.原型模式;

import java.util.Date;
//分为浅拷贝和深拷贝
//是浅拷贝 复制的是地址
//深拷贝 渎职的是全新的
public class prototype {
    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        MyClone myClone = new MyClone();
        myClone.setAge(21);
        myClone.setName("wanglu");
        myClone.setBrithday(new Date());
        System.out.println(myClone.age+" "+myClone.name+" "+myClone.Brithday);
        System.out.println("------------------");
        MyClone clone = (MyClone)myClone.clone();
        System.out.println(clone.age+" "+clone.name+" "+clone.Brithday);
        System.out.println("------------------");
        clone.getBrithday().setDate(24);
        System.out.println(myClone.getBrithday()+"----"+clone.getBrithday());
    }
}
