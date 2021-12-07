package com.engeto.urm.dto;

import java.util.List;
import java.util.Random;

public class Ship {
    private Integer id;
    private String name;
    private Integer capacity;
    private boolean isOnWay;
    private Integer countOfTransports;
    private Integer averageSpeed;
    public List<Cargo> seznamCargo;

    public Ship(Integer id, String name, Integer capacity, boolean isOnWay, Integer countOfTransports, Integer averageSpeed, List<Cargo> seznamCargo) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.isOnWay = isOnWay;
        this.countOfTransports = countOfTransports;
        this.averageSpeed = averageSpeed;
        this.seznamCargo = seznamCargo;
    }

    public Ship() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public boolean isOnWay() {
        return isOnWay;
    }

    public void setOnWay(boolean onWay) {
        isOnWay = onWay;
    }

    public Integer getCountOfTransports() {
        return countOfTransports;
    }

    public void setCountOfTransports(Integer countOfTransports) {
        this.countOfTransports = countOfTransports;
    }

    public Integer getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(Integer averageSpeed) {
        while (averageSpeed >= 30){
            setAverageSpeed(new Random().nextInt(101));
        }
        this.averageSpeed = averageSpeed;
    }

    public List<Cargo> getSeznamCargo() {
        return seznamCargo;
    }

    public void setSeznamCargo(List<Cargo> seznamCargo) {
        this.seznamCargo = seznamCargo;
    }
}
