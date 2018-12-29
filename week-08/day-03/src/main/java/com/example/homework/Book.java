package com.example.homework;

public class Book {
  private static int nextId = 0;

  private int id;
  private String title;
  private String author;
  private Integer releaseYear;

  public Book(String title, String author, Integer releaseYear) {
    this.id = nextId++;
    this.title = title;
    this.author = author;
    this.releaseYear = releaseYear;
  }

  public static int getId() {
    return nextId;
  }

  public String getAuthor() {
    return author;
  }
}