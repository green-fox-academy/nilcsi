public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000

        double a = 3.1;
        double b = 6.3;
        double c = 4.8;

        double surface_area = (2*a) + (2*b) + (2*c);
        double volume = a*b*c;

        System.out.println("Surface area: " + surface_area);
        System.out.println("Volume: " + volume);
    }

}
