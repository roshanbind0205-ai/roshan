
package com.roshan.objectandclasses;


public class Employee extends Parson{
    String post;
    int salary;
    public Employee( String n, int a, String p, int s){
        super(n,a);
        post=p;
        salary=s;    }
    public String toString(){
        return String.format("Name=%s, Age=%s, Post=%s, Salary=%s",name,age,post,salary);
    }
    public static void main(String[] args) {
        Employee e=new Employee("Prince", 21, "Computer",120000);
//        System.out.print(e);
        
         Maneger c = new Maneger("Roshan",20,"Software",21000,"Maneger",e);
        System.out.println(c);
    }
    
}
