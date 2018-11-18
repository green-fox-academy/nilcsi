package com.Farm;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    List<Animal> animals;
    int slots;

    public void breed(){
        if(slots > 0) {
            animals.add(new Animal());
        }
    }

    public void slaughter(){
        int leastHungry = 0;

        for(int i = 0; i < animals.size(); i++){
            if(animals.get(i).hunger > leastHungry) {
                leastHungry = animals.get(i).hunger;
            }
        }
        animals.remove(leastHungry);
    }
}
