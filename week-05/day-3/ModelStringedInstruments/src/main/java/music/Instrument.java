package main.java.music;

abstract public class Instrument {

  String name;

  Instrument() {}

  Instrument(int strings) {}

  Instrument(String name) {
    this.name = name;
  }

  public void play() {}
}
