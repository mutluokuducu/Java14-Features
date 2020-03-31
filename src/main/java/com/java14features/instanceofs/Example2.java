package com.java14features.instanceofs;

public class Example2 {

  public static void main(String[] args) {

    /*
    * Legal use
     */
    Object obj = "Hello Java14";

    if (obj instanceof String s && s.length() > 4) {
      System.out.println("String: " + s);
    }

    /*
    Cannot resolve symbol 's'

    if(obj instanceof String s || s.length()>4){
      System.out.println("String: "+s);
    }
     */
  }
}
