package com.PetrolStation;

public class Station {

    int gasAmount;

	// write your code here
        /*Create Station and Car classes
                Station
        gasAmount
        refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount
        Car
                gasAmount
        capacity
        create constructor for Car where:
        initialize gasAmount -> 0
        initialize capacity -> 100*/

    public void refill(Car car){
        gasAmount = (car.carGasAmount - car.capacity);
        car.carGasAmount = gasAmount;
    }
}
