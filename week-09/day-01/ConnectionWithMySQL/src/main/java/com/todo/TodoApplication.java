package com.todo;

import com.todo.model.Todo;
import com.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {

  private TodoRepository todoRepository;

  @Autowired
  public TodoApplication(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(TodoApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    /*todoRepository.save(new Todo("do the washing up", false, false));
    todoRepository.save(new Todo("tidy up", false, true));
    todoRepository.save(new Todo("dust the furniture", true, false));
    todoRepository.save(new Todo("throw away the rubbish", true, true));
    todoRepository.save(new Todo("mop", false, true));*/
  }
}

