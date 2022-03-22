package com.company;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private final List<Vehicle> vehicles = new ArrayList<>(); //still can add, remove, update, but cannot do vehicles = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }
}
