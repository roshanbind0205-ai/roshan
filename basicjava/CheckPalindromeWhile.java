package com.roshan.basicjava;

import java.util.Scanner;

public class CheckPalindromeWhile {

    public static void main(String[] args) {
        System.out.println("Enter the name :");

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println(name);

        String n = name.toLowerCase();
        String s = "";

        int i = n.length() - 1;

        while (i >= 0) {
            s = s + n.charAt(i);
            i--;
        }
        if (n.equals(s)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
