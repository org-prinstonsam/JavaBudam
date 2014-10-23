package com.javabegin.unit13.tkatch.annotation01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by user01 on 21.10.14.
 */
public class OperationAnnProcesses02 {
  private static HashMap<String, Object> myMap;
  public static void main(String[] args)  {
    myMap=new HashMap<>();
    loadInstances("com.javabegin.unit13.tkatch.annotation01.LazyService");
    loadInstances("com.javabegin.unit13.tkatch.annotation01.SimpleService");

    PrintMap();
    
  }

  private static void PrintMap() {

    for (Map.Entry<String, Object> item : myMap.entrySet()) {
      String name = item.getKey();
      System.out.println(name);
    }
  }

  private static int loadInstances(String className)/* throws ClassNotFoundException, InstantiationException, IllegalAccessException*/{
    Class<?> c = null;
    try {
      c = Class.forName(className);
    } catch (ClassNotFoundException e) {
      System.out.println("Class not found");
      return 1;
     // e.printStackTrace();
    }

    if (c.isAnnotationPresent(Service.class)) {
      Object obj = null;
      try {
        obj = c.newInstance();
      } catch (InstantiationException | IllegalAccessException e) {
        e.printStackTrace();
      }
      myMap.put(c.getAnnotation(Service.class).name(), obj);

    }
    return 0;

  }
}
