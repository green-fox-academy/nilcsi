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
        for (int i = 0; i < sharpies.size(); i++) {
            if (sharpies.get(i).inkAmount > 0) {
                count++;
            }
        }
        return count;
    }
    public void removeTrash() {
        for (int i = 0; i < sharpies.size(); i++) {
            if (sharpies.get(i).inkAmount == 0) {
                sharpies.remove(i);
                i--;
            }
        }
    }
}