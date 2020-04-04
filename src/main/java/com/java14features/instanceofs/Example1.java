package com.java14features.instanceofs;

public class Example1 {

  public static void main(String[] args) {
    Object obj = "Hello Java14";

    //Before Java14
    if (obj instanceof String) {            // if true instanceof then
      String t = (String) obj;               // cast
      System.out.println("String: " + t);
    }

    //Java 14
    if (obj instanceof String t) {          // instanceof, cast and bind variable in one line.
      System.out.println("String: " + t);
    }
  }
}
