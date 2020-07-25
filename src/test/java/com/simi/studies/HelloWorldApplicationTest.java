package com.simi.studies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloWorldApplicationTest {

  @Test
  public void applicationStartup() {
    final var runtimeException = Assertions.assertThrows(RuntimeException.class,
        () -> HelloWorldApplication.main(null));
    final var expectedErrorMessage =
        "Method void com.simi.studies.HelloWorldApplication.main(String[]) with @ExceptionTest";
    Assertions.assertEquals(expectedErrorMessage, runtimeException.getMessage());
  }

}
