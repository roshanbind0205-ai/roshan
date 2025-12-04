package CarbookingSystem;

import java.util.Scanner;

public class Person {

    Scanner sc = new Scanner(System.in);
    String name, mobile, address;
    int age;

    public Person() {
        System.out.print("Enter the name :");
        name = sc.nextLine();

        System.out.print("Enter the mobile :");
        mobile = sc.nextLine();

        System.out.print("Enter the address :");
        address = sc.nextLine();

        System.out.print("Enter the age :");
        age = sc.nextInt();
    }

    public Person(String n, String m, String ad, int a) {
        name = n;
        mobile = m;
        address = ad;
        age = a;
    }

    public String toString() {
        return String.format("name=%s, mobile=%s, address=%s, age=%s", name, mobile, address, age);
    }

    public static void main(String[] args) {
        Person p = new Person("Roshan", "8188935865", "Mirzapur", 21);
        System.out.println(p);

        Person p1 = new Person();
        System.out.println(p1);
    }
}
