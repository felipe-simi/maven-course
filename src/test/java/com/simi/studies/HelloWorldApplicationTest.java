package com.simi.studies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloWorldApplicationTest {

  @Test
  public void applicationStartup() {
    Assertions.assertDoesNotThrow(() -> HelloWorldApplication.main(null));
  }

}
