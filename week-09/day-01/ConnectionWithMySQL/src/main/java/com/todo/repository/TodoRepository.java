package com.todo.repository;

import com.todo.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

  List<Todo> findAll();
  List<Todo> findAllByDoneIsFalse();
  List<Todo> findAllByName(String text);
  List<Todo> findAllByDueDate(Date date);
}
