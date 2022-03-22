package com.company;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    private String name;
    private final List<User> users = new ArrayList<>();
    private Model model;

    private Vehicle(Model model,String name) {
        this.name = name;
    }

    public static Vehicle createVehicle(Model model, String name) throws Exception {
        if(model == null) {
            throw new Exception("The given model does not exist!");
        }

        // Create a new vehicle
        Vehicle vehicle = new Vehicle(model, name);

        // Add to the model
        model.addVehicle(vehicle);

        return vehicle;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void addUser(User user) {
        this.users.add(user);
    }
}
