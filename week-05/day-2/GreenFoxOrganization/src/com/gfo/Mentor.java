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

  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }

  public void introduce() {
    super.introduce();
    System.out.println(", " + level + " mentor.");
  }
}
