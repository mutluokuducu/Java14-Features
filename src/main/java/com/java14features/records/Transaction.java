package com.java14features.records;

import java.util.Objects;

public record Transaction(int id, double amount, String description) {

  public Transaction(int id, double amount, String description) {
    this.id = id;
    this.amount = amount;
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction that = (Transaction) o;
    return id == that.id &&
           Double.compare(that.amount, amount) == 0 &&
           Objects.equals(description, that.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, amount, description);
  }

  @Override
  public String toString() {
    return "Transaction{" +
           "Transaction id=" + id +
           ", amount=" + amount +
           ", description='" + description + '\'' +
           '}';
  }
}






/*
Before java 14
public class Transaction {

  private Date date;
  private double amount;
  private String description;

  ///getter & setters
  ///toString
  ///equals && hashCode
  ///constructor
}
*/
