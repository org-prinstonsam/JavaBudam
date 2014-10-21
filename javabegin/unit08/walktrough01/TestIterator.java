package com.javabegin.unit08.walktrough01;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.Random;

/**
 * Created by user01 on 24.09.14.
 */
public class TestIterator {
    public static void main(String[] args) {
        ArrayList<Integer> arrNum= new ArrayList<>(10);
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            arrNum.add(rand.nextInt(10));
        }

//        Integer curNum = null;
        for (Integer curNum : arrNum) {
            System.out.println(curNum);
        }

        Iterator iNum = arrNum.iterator();

        while (iNum.hasNext()) {
            Integer n = (Integer) iNum.next();
            if (n == 7) {
                iNum.remove();
            }
        }
        System.out.println("");
        for (Integer curNum : arrNum) {
            System.out.println(curNum);
        }


        for (Integer curNum : arrNum) {
            if (curNum == 0) {
                arrNum.remove(curNum);
            }
        }

        System.out.println("");
        for (Integer curNum : arrNum) {
            System.out.println(curNum);
        }

    }
}
