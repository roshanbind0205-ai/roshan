
package com.roshan.basicjava;
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        
        System.out.println("Enter the Name :");
        Scanner sc = new Scanner(System.in);
        
        String name=sc.nextLine();
//        System.out.println(name);
        
        String n=name.toLowerCase();
        String s="";
        
        for(int i=n.length()-1; i>=0; i--){
            s=s+n.charAt(i);
        }
        if(n.equals(s)){
            System.out.println("Palindrome");
            
        }
        else{
            System.out.println("Not Palindrome");
    }
    }
}
