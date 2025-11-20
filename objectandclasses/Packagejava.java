package com.roshan.objectandclasses;
//import java.util.Scanner;

public class Packagejava {

    String name, age;

    public Packagejava(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name" + name + ",age" + age;
    }

    public static void main(String[] args) {

        Packagejava p = new Packagejava("roshan", "12");
        System.out.println(p);

    }
}
