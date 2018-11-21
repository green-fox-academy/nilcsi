package com.cloneable;

public class Student extends Person implements Cloneable {

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

  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  public void introduce() {
    super.introduce();
    System.out.println(" from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
  }

  public void skipDays(int numberOfDays) {

    skippedDays += numberOfDays;
  }


  public Student clone() {
    return new Student(this.name, this.age, this.gender, this.previousOrganization);
  }
}
