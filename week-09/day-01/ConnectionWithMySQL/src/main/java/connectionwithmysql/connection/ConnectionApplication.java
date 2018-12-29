package connectionwithmysql.connection;

import connectionwithmysql.connection.model.Todo;
import connectionwithmysql.connection.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionApplication implements CommandLineRunner {

  @Autowired
  private TodoRepository repository;

  public static void main(String[] args) {
    SpringApplication.run(ConnectionApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    repository.save(new Todo("Start the day"));
    repository.save(new Todo("Finish H2 workshop1"));
    repository.save(new Todo("Finish H2 workshop2"));
    repository.save(new Todo("Create a CRUD project"));
  }
}

