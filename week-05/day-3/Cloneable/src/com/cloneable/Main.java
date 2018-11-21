package com.cloneable;

public class Main {
  public static void main(String[] args) {
    Student student = new Student("John", 20, "male", "BME");

    Student student2 = student.clone();

    System.out.println(student2.name + ", " + student2.age + ", " + student2.previousOrganization);
  }
}
