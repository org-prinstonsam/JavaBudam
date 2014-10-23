package com.javabegin.unit13.chapter24tryit;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by user01 on 21.10.14.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface DBParams {
  String dbName();
  int uid();
  String password();
}
