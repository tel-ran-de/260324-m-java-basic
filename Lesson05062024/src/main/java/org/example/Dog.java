package org.example;

public class Dog {
//    state
    private String name;

//    behavior
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void run() {
        System.out.println(name + " is running");
    }
}
