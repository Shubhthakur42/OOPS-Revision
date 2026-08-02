package Lecture_3;

class Vehicle {
    Vehicle() {
        System.out.println("This is Vehicle class cunstructor");
    }
}
class fourWheeler extends Vehicle {
    fourWheeler(){
        System.out.println("This is fourWheeler constructor");
    }
}
class car extends fourWheeler {
    car() {
        System.out.println("THis is car constructor");
    }
}
public class multilevel {
    public static void main(String[] args) {
        car c1 = new car();
        // output
//        This is Vehicle class cunstructor
//        This is fourWheeler constructor
//        THis is car constructor
        // Constructor called from Base class to child class
    }
}
