package Lecture_1;

import java.sql.SQLOutput;

// Basically we can access methods inside any class without an object but method should be static then only by using className.method_name();

public class Book {
    private String name;
    private static int numberOfPages=100;
    Book(String name, int numberOfPages) {
        this.name=name;
        this.numberOfPages=numberOfPages;
    }
    public static void getInfo(){
//        System.out.println(this.name);
        System.out.println(numberOfPages);
    }

    public static void main(String[] args) {
        Book.getInfo();
    }
}
