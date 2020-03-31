package com.java14features.dto;

import java.math.BigDecimal;

public class Amount {
  private Integer value;
  private String currency;

  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }
}
