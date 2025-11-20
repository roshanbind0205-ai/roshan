package com.roshan.basicjava;

import java.util.Scanner;

public class Scannersum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value A: ");
        int a = sc.nextInt();

        System.out.print("Enter the value B: ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("Sum: " + sum);
    }
}
