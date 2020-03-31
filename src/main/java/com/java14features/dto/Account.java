package com.java14features.dto;

public class Account {
  private String accountName;
  private String accountSortCode;
  private String accountNumber;
  private String subscriptionKey;
  private  Amount amount;

  public Amount getAmount() {
    return amount;
  }

  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public String getAccountSortCode() {
    return accountSortCode;
  }

  public void setAccountSortCode(String accountSortCode) {
    this.accountSortCode = accountSortCode;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public String getSubscriptionKey() {
    return subscriptionKey;
  }

  public void setSubscriptionKey(String subscriptionKey) {
    this.subscriptionKey = subscriptionKey;
  }
}
