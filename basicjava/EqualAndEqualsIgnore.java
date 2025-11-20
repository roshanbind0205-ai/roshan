package com.roshan.basicjava;

public class EqualAndEqualsIgnore {

    public static void main(String[] args) {

        String a = " Hello ";
        String b = " hello ";

        int n = a.charAt(5);
        System.out.println(n);

        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));
    }
}
