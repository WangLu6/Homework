package org.westos.设计模式.单例设计模式.迭代器模式;

import java.util.ArrayList;

public class Iterator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(6);
        list.add(9);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
