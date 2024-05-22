package org.example.constructorTest;

public class Student {
    String name;
    int age;
    String group;

//    default constructor
    public Student(){}

//    constructor with name param
    public Student(String name) {
        this.name = name;
    }

//    constructor with group and name
    public Student(String name, String  group) {
        this.name = name;
        this.group = group;
    }

//    constructor with all params
    public Student(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }
}
