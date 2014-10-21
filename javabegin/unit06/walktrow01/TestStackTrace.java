package com.javabegin.unit06.walktrow01;

/**
 * Created by user01 on 23.09.14.
 */
public class TestStackTrace {
    public TestStackTrace() {
        divideByZero();
    }

    private int divideByZero() {
        return 25/0;
    }

    public static void main(String[] args) {
        new TestStackTrace();
    }
}
