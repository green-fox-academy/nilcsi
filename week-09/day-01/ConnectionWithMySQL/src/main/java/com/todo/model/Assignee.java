package com.todo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "assignees")
public class Assignee {

  @Id
  @GeneratedValue
  Long id;

  private String name;
  private String email;

  @OneToMany(mappedBy = "assignee")
  private List<Todo> todoList;

  public Assignee(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public Assignee() {

  }

  public Assignee(String name) {
    this.name = name;
    this.email = getEmail();
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public List<Todo> getTodoList() {
    return todoList;
  }

  public void setTodoList(List<Todo> todoList) {
    this.todoList = todoList;
  }
}
