package net.a.test;

import net.a.separatepackage.AnUnusedImport;

import java.util.ArrayList;
import java.util.List;

public class MyTestClass {
  public static void main(String[] args) {
    System.out.println("Testing things");

//    AnUnusedImport.doThings();
    List<String> myList = new ArrayList<>();
            String b = "hi";
    for (String a: myList) {
      b += a;
    }
  }

  public static String getAString () {
    return "a";
  }
}
