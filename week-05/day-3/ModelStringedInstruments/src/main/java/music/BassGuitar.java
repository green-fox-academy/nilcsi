package main.java.music;

public class BassGuitar extends StringedInstrument {

  BassGuitar() {
    super.numberOfStrings = 4;
  }

  BassGuitar(int numOfStrings) {
    super.numberOfStrings = numOfStrings;
  }

  @Override
  public String sound() {
    return "Duum-duum-duum";
  }

  public void play() {
    System.out.println("Bass Guitar, a " + numberOfStrings + "-stringed instrument that goes " + this.sound());
  }
}
