package com.reserveNumber.classes;

public class Room {
    private int capacity;
    private int cost;
    private boolean empty;

    public Room(int capacity, int cost, boolean empty) {
        this.capacity = capacity;
        this.cost = cost;
        this.empty = empty;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }
}
