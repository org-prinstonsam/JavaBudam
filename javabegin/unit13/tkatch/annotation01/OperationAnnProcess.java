package com.javabegin.unit13.tkatch.annotation01;

import oracle.jdbc.proxy.annotation.Methods;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by user01 on 21.10.14.
 */
public class OperationAnnProcess {
  public static void main(String[] args) {
    inspectService(SimpleService.class);
    inspectService(LazyService.class);
//    inspectService(String.class);


  }

  private static void inspectService(Class<?> service) {

    if (service.isAnnotationPresent(Service.class)) {
      Service ann = service.getAnnotation(Service.class);
      System.out.println(ann.name());
    } else {
      System.out.println(service.toString() + " not ann");
    }
    Method[] methods = service.getDeclaredMethods();

    for (Method method : methods) {
      if (method.isAnnotationPresent(Init.class)) {
        System.out.println("method "+method.toString()+ " has Init");

      } else {
        System.out.println("method "+method.toString()+ " hasn't Init");
      }
    }
  }
}
