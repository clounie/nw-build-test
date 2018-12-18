package net.a.test;

import org.junit.Assert;
import org.junit.Test;

public class TestMyTestClass {

  @Test
  public void shouldReturnString () {
    Assert.assertEquals("a", MyTestClass.getAString());
  }

  @Test
  public void shouldFail () {
    Assert.assertFalse(false); //
  }
}
