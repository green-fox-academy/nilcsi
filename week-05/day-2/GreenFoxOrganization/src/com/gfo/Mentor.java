package com.gfo;

public class Mentor extends Person {
  String level;

  Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
    this.level = level;
  }

  Mentor() {
    super();
    Person janeDoe = new Person();
    level = "intermediate";
  }

  public String getGoal() {
    return "Educate brilliant junior software developers.";
  }

  public String introduce() {
    return (super.introduce() + ", " + level + " mentor.");
  }
}
