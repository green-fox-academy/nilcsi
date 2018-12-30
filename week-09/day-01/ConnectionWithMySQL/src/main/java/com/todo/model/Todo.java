package com.todo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Todo {

  @Id
  @GeneratedValue
  long id;

  private String name;
  private boolean urgent;
  private boolean done;

  public Todo(String name, boolean isUrgent, boolean isDone) {
    this.name = name;
    this.urgent = isUrgent;
    this.done = isDone;
  }

  public Todo(String name) {
    this.name = name;
    this.urgent = false;
    this.done = false;
  }

  public Todo() {

  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isUrgent() {
    return urgent;
  }

  public void setUrgent(boolean urgent) {
    this.urgent = urgent;
  }

  public boolean isDone() {
    return done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }
}
