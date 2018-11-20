package com.gfo;

public class Person {

    String name;
    int age;
    String gender;

    Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    Person() {
        name ="Jane Doe";
        age = 30;
        gender = "female";
    }

    public String introduce() {
        return "Hi, I'm " + name + ", " + age + " year old " + gender + " .";
    }

    public String getGoal() {
        return "My goal is: Live for the moment!";
    }
}
