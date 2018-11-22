package sharpie;

public class Sharpie {

    String color;
    float width;
    float inkAmount = 100;

    Sharpie(String color, float width) {
        this.color = color;
        this.width = width;
    }

    public float use() {
        return inkAmount -= 1;
    }

}
