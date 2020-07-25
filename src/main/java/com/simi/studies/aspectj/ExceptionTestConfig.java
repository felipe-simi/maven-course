package com.simi.studies.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import static java.lang.String.format;

@Aspect
public class ExceptionTestConfig {

  @Before("execution(* *.*(..)) && @annotation(ExceptionTest)")
  public void methodsWithValidationArgs(final JoinPoint joinPoint) {
    throw new RuntimeException(format("Method %s with @ExceptionTest", joinPoint.getSignature()));
  }

}
