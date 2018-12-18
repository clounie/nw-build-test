package net.a.test;

import org.junit.Assert;
import org.junit.Test;

public class TestMyTestClass {

  @Test
  public void shouldReturnString () {
    System.out.println("\ntest ran\n");
    Assert.assertEquals("a", MyTestClass.getAString());
  }

  @Test
  public void shouldFail () {
    Assert.assertFalse(true);
  }
}
