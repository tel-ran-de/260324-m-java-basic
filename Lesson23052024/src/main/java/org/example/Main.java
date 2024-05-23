package org.example;

import org.example.house.House;
import org.example.methods.TestMethods;

public class Main {
    public static void main(String[] args) {
//        House myHouse = new House();
//        System.out.println(myHouse.getFloor() + " " + myHouse.getRooms() + " " + myHouse.getAddress());
//        myHouse.setFloor(3);
//        myHouse.setRooms(5);
//        myHouse.setAddress("Some address");
//        System.out.println(myHouse.getFloor() + " " + myHouse.getRooms() + " " + myHouse.getAddress());
        House myHouse = new House(3, 5, "Address");
        System.out.println(myHouse.getFloor() + " " + myHouse.getRooms() + " " + myHouse.getAddress());
        myHouse.setFloor(-100);
        System.out.println(myHouse.getFloor() + " " + myHouse.getRooms() + " " + myHouse.getAddress());

//        TestMethods testMethods = new TestMethods();
//        testMethods.getSum(10, 15);
    }
}