package foxclub.foxclub.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "foxclub")
public class Fox {
  private String name;
  private List<String> tricks;
  private String food;
  private String drink;

  @Id
  @GeneratedValue
  private long id;

  @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
  @JoinColumn(name = "user_id")
  private User user;

  public Fox(String name, List<String> tricks, String food, String drink) {
    this.name = name;
    this.tricks = tricks;
    this.food = food;
    this.drink = drink;
  }

  public Fox(String name) {

    this.name = name;
    this.food = "salad";
    this.drink = "water";
  }

  public Fox() {

  }

  public String getName() {

    return name;
  }

  public void setName(String name) {

    this.name = name;
  }

  public List<String> getTricks() {

    return tricks;
  }

  public void setTricks(List<String> tricks) {

    this.tricks = tricks;
  }

  public String getFood() {

    return food;
  }

  public void setFood(String food) {

    this.food = food;
  }

  public String getDrink() {

    return drink;
  }

  public void setDrink(String drink) {

    this.drink = drink;
  }

  public void addTrick(String trick) {
    if(!tricks.contains(trick)) {
      tricks.add(trick);
    }
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }
}
