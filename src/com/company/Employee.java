package com.company;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    String name;
    Map<String,Vehicle> carsToWash;

    public Employee() {
        this.carsToWash = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Vehicle> getCarsToWash() {
        return carsToWash;
    }

    public void addCarToWash(Vehicle vehicle) {
        this.carsToWash.put(vehicle.getName(), vehicle);
    }

    public boolean isDirty(Vehicle vehicle) {
        return carsToWash.containsKey(vehicle.getName());
    }
}
