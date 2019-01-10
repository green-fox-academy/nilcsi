package foxclub.foxclub.model;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

  @Id
  @GeneratedValue
  private long id;

  private String username;
  private String password;

  @OneToMany(mappedBy = "user")
  private Fox fox;

  public User(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public User() {}

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }
}
