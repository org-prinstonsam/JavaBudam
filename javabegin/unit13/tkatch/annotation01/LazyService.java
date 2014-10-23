package com.javabegin.unit13.tkatch.annotation01;

/**
 * Created by user01 on 21.10.14.
 */
@Service(name = "VeryLazyService")
public class LazyService {
  @Init
  public void lazyInit() throws Exception{
    System.out.println("lazyInit");
  }
}
