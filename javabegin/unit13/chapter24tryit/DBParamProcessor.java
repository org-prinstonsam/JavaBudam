package com.javabegin.unit13.chapter24tryit;

import com.javabegin.unit13.tkatch.annotation01.Service;

/**
 * Created by user01 on 21.10.14.
 */
public class DBParamProcessor {
  public static void main(String[] args) {
    Class<?> service = DBParams.class;
    DBParams ann = MyDBWorker.class.getAnnotation(DBParams.class);
    StringBuilder s = new StringBuilder();
    s.append(ann.dbName());
    s.append(" ");
    s.append(ann.uid());
    s.append(" ");
    s.append(ann.password());

    System.out.println(s);

//    DBParams ann = service.getAnnotation(DBParams.class);;

  }
}
