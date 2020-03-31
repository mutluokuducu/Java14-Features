package com.java14features.instanceofs;

public class Example1 {

  public static void main(String[] args) {
    Object obj="Hello Java14";

    //Before Java14
    if(obj instanceof String){
      String s=(String)obj;
      System.out.println("String: "+s);
    }

    //Java 14
    if(obj instanceof String s){
      System.out.println("String: "+s);
    }
  }
}
