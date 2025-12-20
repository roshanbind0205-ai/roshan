
package com.roshan.basicjava.stringpractice;


import java.util.Scanner;
public class Person {
    Scanner sc=new Scanner(System.in);
    String name,mobile,address;
    
    public Person(String name, String mobile, String address){
        
    this.name=name;
    this.mobile=mobile;
    this.address=address;
    
    }
    
    public Person()
    {
        System.out.println("Enter the Name :");
        name=sc.nextLine();
        
        System.out.println("Enter the Mobile :");
        mobile=sc.nextLine();
         
        System.out.println("Enter the Address :");
        address=sc.nextLine();   
    }
    
    public String toString()
     {   
      return String.format("Name=%s, Mobile=%s, Address=%s",name,mobile,address);    
     }
    public static void main(String[] args) 
    {
        Person p1=new Person();
        System.out.println(p1);   
    }
}
