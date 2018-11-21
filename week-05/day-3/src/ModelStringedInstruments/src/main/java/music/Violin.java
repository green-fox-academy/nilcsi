package main.java.music;

public class Violin extends StringedInstrument {

  Violin() {
    super.numberOfStrings = 4;
  }

  Violin(int numOfStrings) {
    super.numberOfStrings = numOfStrings;
  }

  public String sound() {
    return "Screech";
  }

  public void play() {
    System.out.println("Violin, a " + numberOfStrings + "-stringed instrument that goes " + this.sound());
  }
}
