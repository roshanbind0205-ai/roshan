package com.roshan.basicjava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class AddList {

    public static void main(String[] agrs) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileInputStream("Productlist.txt"));
        PrintWriter pw =new PrintWriter(new FileOutputStream("out.txt"));
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            pw.println(line);
            System.out.println(line);
        }
        pw.flush();
        pw.close();

    }

}
