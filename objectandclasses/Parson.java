package com.roshan.objectandclasses;

public class Parson {

    String name;
    int age;

    public Parson(String n, int a) {
        name = n;
        age = a;
    }

    public void display() {
        System.out.printf("Name= %s, Age= %s\n", name, age);
    }

    public static void main(String[] agrs) {
        Parson p1 = new Parson("Roshan", 19);
        p1.display();

    }
}
