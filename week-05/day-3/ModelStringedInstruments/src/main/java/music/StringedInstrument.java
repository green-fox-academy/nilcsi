package main.java.music;

public abstract class StringedInstrument extends Instrument {

  int numberOfStrings;

  StringedInstrument() {}

  abstract public String sound();
}
