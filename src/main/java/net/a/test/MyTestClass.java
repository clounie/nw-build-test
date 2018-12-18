package net.a.test;

import net.a.separatepackage.AnUnusedImport;

public class MyTestClass {
  public static void main(String[] args) {
    System.out.println("Testing things");

//    AnUnusedImport.doThings();
  }

  public static String getAString () {
    return "a";
  }
}
