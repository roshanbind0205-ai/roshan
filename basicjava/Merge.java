package com.roshan.basicjava;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.util.TreeSet;

public class Merge {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileInputStream("Screen.txt"));
        Scanner p = new Scanner(new FileInputStream("Screen1.txt"));
        PrintWriter pw = new PrintWriter(new FileOutputStream("out.txt"));

        TreeSet<Integer> set = new TreeSet<>();

        while (sc.hasNextInt()) {
            set.add(sc.nextInt());
            // System.out.print(set);
        }
        while (p.hasNextInt()) {
            set.add(p.nextInt());
            //  System.out.print(set);
        }
        for (int num : set) {

            pw.print(num);
        }
        pw.flush();
        pw.close();
        System.out.print("complite merge");
    }
}
