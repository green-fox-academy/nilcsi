package com.restapp.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Log {

  @CreationTimestamp
  private Date createdAt;
  @Id
  @GeneratedValue
  long id;
  private String endpoint;
  private String data;

  public Log() {

  }

  public Log(String endpoint, String data) {
    this.endpoint = endpoint;
    this.data = data;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }
}
