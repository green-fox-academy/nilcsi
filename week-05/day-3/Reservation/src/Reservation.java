import java.util.Random;

public class Reservation implements Reservationy {

  private String codeBooking;
  private String dowBooking;

  public Reservation() {
    this.codeBooking = getCodeBooking();
    this.dowBooking = getDowBooking();
  }

  public String getDowBooking() {
    String[] dayOfWeek = new String[]{"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    Random r = new Random();
    return dayOfWeek[r.nextInt(7)];
  }

  public String getCodeBooking() {
    Random r = new Random();
    String code = "";

    for(int i = 0; i < 8; i++) {
      char c = (r.nextInt(2) == 1) ? (char) (r.nextInt(26) + 'A') : (char) (r.nextInt(10) + '0');
      code += c;
    }
    return code;
  }

  public void print() {
    System.out.println("Booking#" + getCode() + "for" + getDow());
  }

  public String getDow() {
    return dowBooking;
  }

  public void setDow(String dow) {
    this.dowBooking = dowBooking;
  }

  public String getCode() {
    return codeBooking;
  }
}
