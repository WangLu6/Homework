package org.westos.设计模式.单例设计模式.建造器模式;

public class Person {
    private int age;
    private  String name;
    private String sex;
   private Person(int age,String name,String sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }
    public static class PersonBuilder{
        private int age;
        private  String name;
        private String sex;
        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }
        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }
        public PersonBuilder sex(String sex) {
            this.sex = sex;
            return this;
        }
        public Person build(){
            return new Person( this.age,this.name,this.sex );
        }
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public String getSex() {
        return sex;
    }
}
