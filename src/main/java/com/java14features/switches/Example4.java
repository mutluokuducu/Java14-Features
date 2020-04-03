package com.java14features.switches;

import static com.java14features.enums.Days.FRIDAY;

import com.java14features.enums.Days;

public class Example4 {


  public static void main(String[] args) {

    Days day = FRIDAY;

    int j = switch (day) {
      case MONDAY -> 0;
      case TUESDAY -> 1;
      default -> {
        int result = day.toString().length();
        yield result;
      }
    };
    System.out.println(j);
  }
}
