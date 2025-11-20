package com.roshan.basicjava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProductList {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileInputStream("Productlist1.txt"));

        while (sc.hasNextLine()) {
            String line = sc.nextLine();

            int n = line.indexOf("Pepsi");
            if (n >= 0) {
                System.out.println(n);
                System.out.println(line);
                int length = line.length();
                while (true) {
                    line = line.replaceAll("  ", " ");
//                    line = line.replaceAll("   ", " ");
                    if (length > line.length()) {
                        length = line.length();
                    } else {
                        break;
                    }
                    System.out.println(line);
                }
                int price = Integer.parseInt(line.split(" ")[1]);
                System.out.println(price);
            }
//            int n=line.indexOf("35");
//            System.out.println(n);
        }
    }
}
