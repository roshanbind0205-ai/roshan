package com.roshan.basicjava.Carbooking;


import java.util.ArrayList;

public class CarManager {

    private ArrayList<Car> cars;
//    private int nextId = 1;

    public CarManager() {
        cars = CarStorage.loadCars();
    }

    public void addCar() {
        Car c = new Car();
        cars.add(c);
        CarStorage.saveCars(cars);
        System.out.println("Car added!");
    }

    public void listCars() {
        if (cars.isEmpty()) {
            System.out.println("No cars  avlable.");
            return;
        }
        for (Car c : cars) {
            System.out.println(c);
        }
        
                }
    }
    


