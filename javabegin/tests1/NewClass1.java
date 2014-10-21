package com.javabegin.tests1;

/**
 * Created by user01 on 25.09.14.
 */
public class NewClass1 implements interf1 {

    static String s;
    public static void main(String[] args) {
        NewClass1 a = new NewClass1();

        if (a instanceof interf1) {
            System.out.println("interf true");

        } else {
            System.out.println("interf false");
        }

        if (s instanceof String) {
            System.out.println("class true");
        } else {
            System.out.println("class false");
        }
    }
}
