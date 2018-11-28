package org.westos.设计模式.单例设计模式.策略模式;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Strategy {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(6);
        list.add(9);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int num = o1-o2;
                return -num;
            }
        });
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
