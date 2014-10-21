package com.javabegin.tests1;



/**
 * Created by user01 on 25.09.14.
 */
public class NewClass {
    NewClass m1;
    public NewClass() {
    }

    public NewClass(NewClass m) {
        this.m1 = m;
    }

    public void go() {
        System.out.println("hi");
    }

    public static void main(String[] args) {
        NewClass m2 = new NewClass();
        NewClass m3 = new NewClass(m2);
        m3.go();
        NewClass m4 = m3;
        m4.go();
        NewClass m5 = m2;
        m2.m1.go();
    }
}
