package org.example.house;

public class House {
    private int floor;
    private int rooms;
    private String address;

    public House() {}

    public House(int floor, int rooms, String address) {
        this.floor = floor;
        this.rooms = rooms;
        this.address = address;
    }

    public int getFloor() {
        return this.floor;
    }

    public int getRooms() {
        return this.rooms;
    }

    public String getAddress() {
        return this.address;
    }

    public void setFloor(int floor) {
        if (floor < 1 && floor > 10) {
            this.floor = floor;
        } else {
            System.out.println("Incorrect value");
        }

    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
