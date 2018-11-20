package com.gfo;

public class Student extends Person {

  String previousOrganization;
  int skippedDays;

  Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  Student() {
    super();
    previousOrganization = "The School of Life";
    skippedDays = 0;
  }

  public String getGoal() {
    return "Be a junior software developer.";
  }

  public String introduce() {
    return (super.introduce() + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
  }

  public void skipDays(int numberOfDays) {

    skippedDays += numberOfDays;
  }
}
