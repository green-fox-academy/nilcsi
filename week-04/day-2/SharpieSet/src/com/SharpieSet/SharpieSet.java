package com.SharpieSet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SharpieSet {

    private List<Sharpie> sharpies;

    public SharpieSet (){

        this.sharpies = new ArrayList<>();
    }

    public void add (Sharpie sharpie) {
        sharpies.add(sharpie);
    }
    public int countUsable() {
        int count = 0;
        for (Sharpie element : sharpies;) {
            if (element.inkAmount > 0) {
                count++;
            }
        }
        return count;
    }

    public void removeTrash() {
        for (sharpies element : sharpies) {
            if (element.inkAmount <= 0) {
                sharpies.remove(element);
            }
        }
    }
}
