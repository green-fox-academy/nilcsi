package com.Farm;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    List<Animal> animals =  new ArrayList<>();

    int slots = 10;

    public void breed(){
        Animal newAnimal = new Animal();
        if(slots > 0) {
            animals.add(newAnimal);
        }
    }

    public void slaughter(){

        int leastHungry = 0;

        for(int i = 0; i < animals.size(); i++){
            if(animals.get(i).hunger < animals.get(leastHungry).hunger) {
                leastHungry = i;
            }
        }
        animals.remove(animals.get(leastHungry));

    }
}
