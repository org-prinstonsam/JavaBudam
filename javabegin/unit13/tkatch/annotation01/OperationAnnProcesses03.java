package com.javabegin.unit13.tkatch.annotation01;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by user01 on 21.10.14.
 */
public class OperationAnnProcesses03 {
  public static void main(String[] args) {
    runMethodWithInitAnn(SimpleService.class);

  }


  private static int runMethodWithInitAnn(Class<?> service) {
    Method[] methods = service.getDeclaredMethods();
    Object obj = null;
    try {
      obj = service.newInstance();
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    }
    for (Method method : methods) {
      if (method.isAnnotationPresent(Init.class)) {
        try {
          method.invoke(obj);
        } catch (Exception e) {
          Init ann = method.getAnnotation(Init.class);
          if (ann.suppressException()) {
            System.err.println(e.getMessage());
          } else {
            throw new RuntimeException(e);
          }
        }
      }
    }
    return 0;


  }


}
