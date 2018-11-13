package com.SharpieSet;

public class Main {

    public static void main(String[] args) {
        SharpieSet sharpies = new SharpieSet();

        sharpies.add(new Sharpie("blue", 13));
        sharpies.add(new Sharpie("red", 70));
        sharpies.add(new Sharpie("orange", 53));
        sharpies.add(new Sharpie("pink", 41));

        System.out.println(sharpies.countUsable());
        sharpies.removeTrash();
    }

}
