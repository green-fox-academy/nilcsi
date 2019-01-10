package com.restapp.model;

public class AppendA {
  private String appended;

  public AppendA() {}

  public AppendA(String appendable) {
    this.appended = appendable.concat("a");
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
