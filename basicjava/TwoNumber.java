package com.roshan.basicjava;

import java.util.Scanner;

public class TwoNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number :");
        
        int a=0;
        try{
         a=Integer.parseInt(sc.nextLine());
        }
        catch(Exception ex){
            System.out.println(ex);
        }

        System.out.println("Enter the Number :");
        int b = sc.nextInt();
//        int a=Integer.parseInt(sc.nextLine());

        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
