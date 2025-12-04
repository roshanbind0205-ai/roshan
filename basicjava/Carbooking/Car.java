package com.roshan.basicjava.Carbooking;

import java.util.Scanner;
import java.io.Serializable;

public class Car implements Serializable {

    private static final long serialVersionUID = 1L;

    String company, model, carnumber;

    public Car(String company, String model, String carnumber) {
        this.company = company;
        this.model = model;
        this.carnumber = carnumber;

    }

    public Car() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the company :");
        company = sc.nextLine();

        System.out.print("Enter the model :");
        model = sc.nextLine();

        System.out.print("Enter the carnumber :");
        carnumber = sc.nextLine();
    }

    @Override
    public String toString() {
        return String.format("company=%s, Model=%s, carnumber=%s", company, model, carnumber);
    }

}
