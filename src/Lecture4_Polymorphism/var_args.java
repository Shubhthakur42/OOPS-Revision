package Lecture4_Polymorphism;
class varArgs{
    public void methodOne(int a) {
        System.out.println("This is simple method");
    }
    public void methodOne(int ...i){
        System.out.println("This is var_args method");
    }
}
public class var_args {
    public static void main(String[] args) {
        varArgs v=new varArgs();
        v.methodOne(8);
        v.methodOne(4,5,2);
        v.methodOne(1,2,3,4,5,6,7,8);
    }
}
