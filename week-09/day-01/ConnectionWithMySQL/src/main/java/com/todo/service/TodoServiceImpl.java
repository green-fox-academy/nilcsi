package com.todo.service;

import com.todo.model.Todo;
import com.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

  private TodoRepository todoRepository;

  @Autowired
  public TodoServiceImpl(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @Override
  public void addTodo(Todo todo) {
      this.todoRepository.save(todo);
  }

  @Override
  public List<Todo> listTodos() {
    List<Todo> list = new ArrayList<>();
    todoRepository.findAll().forEach(list :: add);
    return list;
  }

  @Override
  public void deleteTodo(long id) {
    todoRepository.deleteById(id);
  }

  @Override
  public Todo getTodoById(long id) {
    return this.todoRepository.findById(id).orElse(null);
  }

  @Override
  public List<Todo> getActiveTodos() {
    return this.todoRepository.findAllByDoneIsFalse();
  }

  @Override
  public List<Todo> searchForString(String text) {
    return todoRepository.findAllByName(text);
  }

  @Override
  public List<Todo> searchForDueDate(Date date) {
    return todoRepository.findAllByDueDate(date);
  }


}
