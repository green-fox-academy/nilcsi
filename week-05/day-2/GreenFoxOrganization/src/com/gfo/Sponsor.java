package com.gfo;

public class Sponsor extends Person {
  String company;
  int hiredStudents;

  Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.hiredStudents = 0;
  }

  Sponsor() {
    super();
    company = "Google";
    hiredStudents = 0;
  }

  public String introduce() {
    return (super.introduce() + " who represents " + company + " and hired " + hiredStudents + " students so far.");
  }

  public void hire() {
    hiredStudents++;
  }

  public String getGoal() {
    return "Hire brilliant junior software developers.";
  }
}
