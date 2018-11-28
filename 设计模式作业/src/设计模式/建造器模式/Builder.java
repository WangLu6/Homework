package org.westos.设计模式.单例设计模式.建造器模式;

public class Builder {
    public static void main(String[] args) {
        Person p1 = new Person.PersonBuilder().age(14).name("wanglu").build();
        Person p2 = new Person.PersonBuilder().sex("man").build();
        System.out.println(p1.getAge()+""+p1.getName()+""+p1.getSex());
    }
}
