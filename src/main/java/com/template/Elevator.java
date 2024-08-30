package com.template;

public class Elevator {
    int minFloor;
    int maxFloor;
    int currentFloor;
    int passanger;
    int maxCapacity;

    public Elevator(int minFloor, int maxFloor, int maxCapacity) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        this.maxCapacity = maxCapacity;
        this.currentFloor = 0;
        this.passanger = 0;
    }

    public   int moveToFloor(int floor) {
        if (floor >= minFloor && floor <= maxFloor) {
            this.currentFloor = floor;
            return this.currentFloor;
        }return this.currentFloor;
    }

    public int addPassenger(){
        if (this.passanger < maxCapacity) {
            passanger++;
            return this.passanger;
        }return this.passanger;
    }

    public int removePassenger(){
        if (passanger > 0) {
        this.passanger = this.passanger - 1;
        return this.passanger;
        }return 0;
    }

    public int getCurrentFloor(){
        return this.currentFloor;
    }

    public int getPassengerCount(){
        return this.passanger;
    }



}
