package com.java14features.instanceofs;

public class Example2 {

  public static void main(String[] args) {

    /*
    * Legal use
     */
    Object obj = "Hello Java14";

    if (obj instanceof String t && t.length() > 4) {
      System.out.println("String: " + t);
    }

    /*
    Cannot resolve symbol 't'

    if(obj instanceof String t || t.length()>4){
      System.out.println("String: "+t);
    }
     */
  }
}
