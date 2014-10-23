package com.javabegin.unit13.tkatch.annotation01;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by user01 on 21.10.14.
 */
@Service(name = "SuperSimpleService")
public class SimpleService {
  @Init
  public void initService() {

    System.out.println("initService");
  }
}
