package com.reddit.model;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Post {

  private String title;
  private int vote;
  private String url;
  private String description;

  @CreationTimestamp
  private Date postDate;

  @Id
  @GeneratedValue
  private long id;

  public Post(String title, int vote, String url, String description) {
    this.title = title;
    this.vote = vote;
    this.url = url;
    this.description = description;
  }

  public Post(String title, String url) {
    this.title = title;
    this.url = url;
  }

  public Post(String title) {
    this.title = title;
  }

  public Post() {

  }

  public Date getPostDate() {
    return postDate;
  }

  public void setPostDate(Date postDate) {
    this.postDate = postDate;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getVote() {
    return vote;
  }

  public void setVote(int vote) {
    this.vote = vote;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }
}
