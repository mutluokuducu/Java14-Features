package com.java14features.nullpointerexception;

import com.java14features.dto.Account;

public class Example1 {

  /**
   * Enable flag to see helpful null pointer exception message
   * -XX:+ShowCodeDetailsInExceptionMessages
   */

  public static void main(String[] args) {

    Account account =new Account();
    String  accountNumber=account.getAmount().getCurrency();
    System.out.println(accountNumber.length());

  }
}
