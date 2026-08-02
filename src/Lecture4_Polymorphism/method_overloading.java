package Lecture4_Polymorphism;

class Sum{
    public void add(int a, int b) {
        System.out.println("int -int Argument");
    }
    public void add(float a, float b) {
        System.out.println("Float Float argument");
    }
    public void add(double a, double b){
        System.out.println("Double-Double argument");
    }
}
public class method_overloading {
    public static void main(String[] args) {
        Sum s1= new Sum();
        s1.add(20,40);
    }
}
