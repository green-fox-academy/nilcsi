package connectionwithmysql.connection.service;

import connectionwithmysql.connection.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoService extends CrudRepository<Todo, Long> {

  Todo findByName(String name);


}
