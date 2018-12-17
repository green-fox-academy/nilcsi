package todos.listing.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import todos.listing.model.Todo;

import java.util.Optional;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

}
