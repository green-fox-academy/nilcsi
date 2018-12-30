package com.todo.service;

import com.todo.model.Todo;

import java.util.List;

public interface TodoService {

  void addTodo(Todo todo);
  List<Todo> listTodos();
  void deleteTodo(long id);
  Todo getTodoById(long id);
  List<Todo> getActiveTodos();
}
