package connectionwithmysql.connection.service;

import connectionwithmysql.connection.model.Todo;
import connectionwithmysql.connection.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoServiceImpl {

  private TodoRepository repository;

  @Autowired
  public TodoServiceImpl(TodoRepository repository) {

    this.repository = repository;
  }

  public void addTodo(Todo todo) {
    if (todo != null) {
      this.repository.save(todo);
    }
  }

  public List<Todo> getTodoList() {
    List<Todo> todos = new ArrayList<>();
    //repository.findAll().forEach(todo -> todos.add(todo));
    repository.findAll().forEach(todos::add);
    return todos;
  }

  public List<Todo> getActiveTodos() {
    List<Todo> list = new ArrayList<>();
    list = getTodoList()
        .stream()
        .filter(todo -> !todo.isDone())
        .collect(Collectors.toList());
    return list;
  }

  public void deleteTodo(long id) {
    repository.deleteById(id);
  }

  public Todo getTodo(long id) {
    return this.repository.findById(id).get();
  }

  public void save(Todo todo) {
    this.repository.save(todo);
  }

  public List<Todo> search(String input) {
    List<Todo> content = new ArrayList<>();
    for(int i = 0; i < getTodoList().size(); i++) {
      if(getTodoList().get(i).getTitle().toLowerCase().contains(input)) {
        content.add(getTodoList().get(i));
      }
    }
    return content;
  }


}
