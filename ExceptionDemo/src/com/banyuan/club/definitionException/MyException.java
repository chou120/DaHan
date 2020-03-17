package com.banyuan.club.definitionException;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/17 4:02 下午
 */
public class MyException  extends   Exception {

  public MyException() {
    super();
  }

  public MyException(String message) {
    super(message);
  }

  @Override
  public String getMessage() {
    return super.getMessage();
  }

  @Override
  public synchronized Throwable getCause() {
    return super.getCause();
  }

  @Override
  public String toString() {
    return super.toString();
  }

  @Override
  public void printStackTrace() {
    super.printStackTrace();
  }

  @Override
  public StackTraceElement[] getStackTrace() {
    return super.getStackTrace();
  }
}
