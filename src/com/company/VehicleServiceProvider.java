package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VehicleServiceProvider {
    private String damageFixed;
    private double price;
    private Date date;

    List<Vehicle> vehicles;
    List<ServiceProvider> serviceProviders;

    public VehicleServiceProvider(String damageFixed, double price, Date date) {
        this.damageFixed = damageFixed;
        this.price = price;
        this.date = date;
        this.vehicles = new ArrayList<>();
        this.serviceProviders = new ArrayList<>();
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public List<ServiceProvider> getServiceProviders() {
        return serviceProviders;
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }
    public void addServiceProvider(ServiceProvider serviceProvider) {
        this.serviceProviders.add(serviceProvider);
    }

    public void removeVehicle(Vehicle vehicle) {
        this.vehicles.remove(vehicle);
    }
    public void removeServiceProvider(ServiceProvider serviceProvider) {
        this.serviceProviders.remove(serviceProvider);
    }

    public String getDamageFixed() {
        return damageFixed;
    }

    public void setDamageFixed(String damageFixed) {
        this.damageFixed = damageFixed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
