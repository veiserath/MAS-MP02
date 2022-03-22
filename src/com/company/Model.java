package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Model {
    private final List<Vehicle> vehicles = new ArrayList<>();
    private static final Set<Vehicle> allVehicles = new HashSet<>();
    private String name;


    public Model(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addVehicle(Vehicle vehicle) throws Exception {
        if(!allVehicles.contains(vehicle)) {
            // Check if the vehicle has been already added to any model
            if(allVehicles.contains(vehicle)) {
                throw new Exception("The vehicle is already connected with another model!");
            }
            vehicles.add(vehicle);
            allVehicles.add(vehicle);
        }
    }

    @Override
    public String toString() {
        return "Model{" +
                "vehicles=" + vehicles +
                ", name='" + name + '\'' +
                '}';
    }
}
