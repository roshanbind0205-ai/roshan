package com.roshan.basicjava.Carbooking;

import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;

public class BookingSystem {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Car[] cars = new Car[10];
        int ncars = 0;
        while (true) {
            System.err.println("0-Exit, 1-Book,2-Car Entry, 3-All Cars ");
            int option = Integer.parseInt(s.nextLine());
            switch (option) {
                case 0:
                    
                    try{
                        
                        ObjectOutputStream out=new ObjectOutputStream(new  FileOutputStream("Detail.txt"));
                        out.writeObject(cars);
                        out.flush();
                        out.close();
                        System.out.println("Car_Detail save sucessfull");
                       }
                        
                    catch(IOException DetailsEx)
                        {
                            
                            System.out.print(DetailsEx);
                        }
                        
                    return;
                    
                
                case 1:
                    System.out.println("Book");
                    
                    break;
                case 2:
                    System.err.println("Enter Car");
                    
                    if (ncars > cars.length) {
                        System.err.println("Cars full");
                        break;
                    }
                    cars[ncars] = new Car();
                    ncars++;
                
                case 3:
                    for (int i = 0; i <= ncars - 1; i++) {
                        System.err.println(cars[i]);
                    }
                    break;
                default:
                    System.err.println("In Valid");
            }
        }
        
    }
}
