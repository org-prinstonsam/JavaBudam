package com.javabegin.unit13.tkatch.annotation01;

import java.lang.annotation.*;

/**
 * Created by user01 on 21.10.14.
 */
@Documented
@Inherited
@Target({
    ElementType.TYPE
})

@Retention(RetentionPolicy.RUNTIME)

public @interface Service {
  String name();

  boolean lazyLoad() default false;


}


