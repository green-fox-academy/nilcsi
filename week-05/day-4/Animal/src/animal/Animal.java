package animal;

public class Animal {

    int hunger = 50;
    int thirst = 50;

    Animal() {}

    public int eat(){

        return hunger --1;
    }

    public int drink() {

        return thirst --;
    }

    public void play(){
        hunger ++;
        thirst ++;
    }

}
