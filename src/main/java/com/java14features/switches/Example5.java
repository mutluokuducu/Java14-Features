package com.java14features.switches;

import com.java14features.enums.VehicleType;

public class Example5 {

  public static void main(String[] args) {

    System.out.println( grade(9));
  }

  public static String grade(int mark) {
    return switch (mark) {
      case 9 -> "A";
      case 8 -> "B";
      case 7 -> "C";
      case 6 -> "D";
      default -> "F";
    };
  }
}
