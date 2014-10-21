package com.javabegin.unit13.reflection01;

import java.lang.reflect.Method;

/**
 * Created by user01 on 01.10.14.
 */
public class MyClass {
  public static void main(String[] args) throws ClassNotFoundException {
    Class c = Class.forName("com.javabegin.unit13.reflection01.Tax");
    Method methods[] = c.getMethods();
    for (Method item : methods) {
      System.out.println(item.toString());

    }

  }
}
