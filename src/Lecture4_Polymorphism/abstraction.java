package Lecture4_Polymorphism;
abstract class person {
    String name;
    int age;
    float height;

    /**
     * Abstract class cannot be instantiated
     * Abstract class can have constructor
     * Abstract class can be used as a reference
     */
    person(String name,int age,float height){
        this.name=name;
        this.age=age;
        this.height=height;
    }
}

class student extends person{
    int marks;
    float avg;
    student(String name,int age,float height,int marks,float avg){
        super(name,age,height);// To call parameterised contructor of parent from child class
        this.marks=marks;
        this.avg=avg;
    }
    public void display(){
        System.out.println("Name is: "+name);
        System.out.println("Age is: "+age);
        System.out.println("Height is: "+height);
        System.out.println("Marks is: "+marks);
        System.out.println("Avg is: "+avg);
    }
}

public class abstraction {
    public static void main(String[] args) {
        student s1=new student("Shubham",21,5.10f,100,78.7f);
        s1.display();
    }
}
