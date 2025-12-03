package com.roshan.basicjava.Carbooking;

import java.util.Scanner;

public class Car {
static String arr[]={"Thar","Bolero","Car","Swift","Auto","Taxi","Indigo","Suzuki","Artiga","Tempu"};
    String company,model,carnumber,sheets;
    Scanner sc = new Scanner(System.in);

    public Car(String c, String m, String car , String s) {
        
       company=c;
       model=m;
       carnumber=car;
       sheets=s;
    }

    public Car() {
        
        
       
        System.out.print("Enter the company :");
        company=sc.nextLine();
        
        System.out.print("Enter the model :");
        model=sc.nextLine();
        
        System.out.print("Enter the carnumber :");
        carnumber=sc.nextLine();
        
        System.out.println("Enter the sheets :");
        sheets=sc.nextLine();

        

    }

    @Override
    public String toString() {
        return String.format("company=%s, model=%s, carnumber=%s ,sheets=%s", company, model,carnumber,sheets);
    }

    public static void main(String[] args) {

        Car c = new Car("Maruti Suzuki","xyz","up 63 6464","6");
  
        System.out.println(c);
        Car c1 = new Car();
        System.out.println(c1);
    }
}
