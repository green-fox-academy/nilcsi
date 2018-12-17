package todos.listing.model;

import javax.persistence.*;

@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String title;
  private boolean isUrgent;
  private boolean isDone;

  public Todo(String title) {
    this.title = title;
    this.isUrgent = false;
    this.isDone = false;
  }

  public Todo() {

  }

  public long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public boolean isUrgent() {
    return isUrgent;
  }

  public boolean isDone() {
    return isDone;
  }
}
