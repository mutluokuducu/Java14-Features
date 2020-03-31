package com.java14features.records;

public class Example1 {

  public static void main(String[] args) {
    Transaction transaction = new Transaction(1, 34, "test");
    Transaction transaction2 = new Transaction(1, 34, "test");

    System.out.println(transaction);

    System.out.println("Equal?-> " + transaction.equals(transaction2));
    System.out.println("Hash code?-> " + transaction.hashCode());

    int x = transaction.id();
    double y = transaction.amount();
    String z = transaction.description();

    System.out.format("id: %d, amount: %f,description: %s", x, y, z);

  }
}
