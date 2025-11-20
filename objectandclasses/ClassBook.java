package com.roshan.objectandclasses;

public class ClassBook {

    String subject, bookname;
    int price;

    public ClassBook(String s, String b, int p) {
        subject = s;
        bookname = b;
        price = p;
    }

    public String toString() {
        return "subject :" + subject + ", bookname :" + bookname + ", price" + price;

    }

    public static void main(String[] agrs) {
        ClassBook cl = new ClassBook("Math", "upbord", 200);
        System.out.println(cl);
    }
}
