package com.webapi.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Weather {

  @Id
  @GeneratedValue
  private long id;

  private String location;
  private double temperature;
  private double airPressure;
  private int humidity;

  @CreationTimestamp
  private Date date;

  public Weather() {

  }

  public Weather(String location, double temperature, double airPressure, int humidity, Date date) {
    this.location = location;
    this.temperature = temperature;
    this.airPressure = airPressure;
    this.humidity = humidity;
    this.date = date;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public double getTemperature() {
    return temperature;
  }

  public void setTemperature(double temperature) {
    this.temperature = temperature;
  }

  public double getAirPressure() {
    return airPressure;
  }

  public void setAirPressure(double airPressure) {
    this.airPressure = airPressure;
  }

  public int getHumidity() {
    return humidity;
  }

  public void setHumidity(int humidity) {
    this.humidity = humidity;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }
}
