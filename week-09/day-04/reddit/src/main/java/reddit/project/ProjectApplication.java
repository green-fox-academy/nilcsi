package reddit.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reddit.project.Model.Post;
import reddit.project.repository.RedditRepository;

import java.sql.Date;

@SpringBootApplication
public class ProjectApplication implements CommandLineRunner{

  @Autowired
  private RedditRepository redditRepository;

  public static void main(String[] args) {
    SpringApplication.run(ProjectApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    redditRepository.save(new Post("It works as we intended it to in Internet Explorer", "url"));
    redditRepository.save(new Post("Polish history in on picture", "url"));
    redditRepository.save(new Post("Motion sensors were not installed the right way", "url"));
    redditRepository.save(new Post("This sign at my gym", "url"));
  }
}

