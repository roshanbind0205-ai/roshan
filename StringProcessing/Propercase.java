package com.roshan.StringProcessing;

import java.util.Scanner;

public class Propercase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Nmae");
        String pcase = "";
        String name = sc.nextLine().trim().toLowerCase();
        System.out.println(name);
        String[] names = name.split(" ");
        int n = names.length;
        System.out.println(n);
        for (int i = 0; i <= n - 1; i++) {
            String s1 = names[i].substring(0, 1);
            s1 = s1.toUpperCase();
            String s2 = names[i].substring(1);
            pcase += s1 + s2 + " ";

        }

        System.out.println(pcase);
    }
}
