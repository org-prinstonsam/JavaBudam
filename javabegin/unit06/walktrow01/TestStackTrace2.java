package com.javabegin.unit06.walktrow01;

/**
 * Created by user01 on 23.09.14.
 */
class TestStackTrace2 {
    TestStackTrace2() {

        try {
            divideByZero();
        } catch (ArithmeticException e) {
            System.out.println("Dear friend, don't divide by zero!");
        }
    }

    int divideByZero() {
        return 25 / 0;
    }

    public static void main(String[] args) {
        new TestStackTrace2();


    }
}
