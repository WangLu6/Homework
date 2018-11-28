package org.westos.设计模式.单例设计模式.原型模式;

import java.util.Date;

public class MyClone implements Cloneable {
    int age;
    String name;
    Date Brithday;
    public Date getBrithday() {
        return Brithday;
    }
    public void setBrithday(Date brithday) {
        Brithday = brithday;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
}
