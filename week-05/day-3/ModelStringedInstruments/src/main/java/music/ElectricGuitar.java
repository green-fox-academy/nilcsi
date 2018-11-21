package main.java.music;

public class ElectricGuitar extends StringedInstrument{

  ElectricGuitar() {
    super.numberOfStrings = 6;
  }
  ElectricGuitar(int numOfStrings) {
    super.numberOfStrings = numOfStrings;
  }

  public String sound() {
    return "Twang";
  }

  public void play() {
    System.out.println("Electric Guitar, a " + numberOfStrings + "-stringed instrument that goes " + this.sound());
  }
}
