package todos.listing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import todos.listing.Service.TodoService;
import todos.listing.model.Todo;
import todos.listing.repository.TodoRepository;

@SpringBootApplication
public class ListingApplication implements CommandLineRunner{

  @Autowired
  private TodoRepository repository;

  public static void main(String[] args) {
    SpringApplication.run(ListingApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    repository.save(new Todo("Start the day"));
    repository.save(new Todo("Finish H2 workshop1"));
    repository.save(new Todo("Finish H2 workshop2"));
    repository.save(new Todo("Create a CRUD project"));
  }
}
