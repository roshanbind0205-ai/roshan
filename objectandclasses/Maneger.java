package com.roshan.objectandclasses;

public class Maneger extends Employee {

    String department;
    Employee secretary;

    public Maneger(String n, int a, String p, int s, String d, Employee sec) {
        super(n, a, p, s);
        department = d;
        secretary = sec;

    }

    public String toString() {
//        return "name :" + name + ", department : " + department + ", age :" + age;
        return String.format("%s, department=%s, secretary=%s", super.toString(), department, secretary);
    }

    public static void main(String[] args) {
     
//         Maneger c = new Maneger("Roshan",20,"Software",21000,"Maneger",e);
//        System.out.println(c);
    }
}
