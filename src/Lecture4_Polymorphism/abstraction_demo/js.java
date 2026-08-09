package Lecture4_Polymorphism.abstraction_demo;

// Exposing the set of services but hiding the internal implementation is abstraction

import com.sun.security.jgss.GSSUtil;

abstract class Bird{
    public abstract void fly();
    public abstract void eat();
}
class Sparrow extends Bird{
    public void fly(){
        System.out.println("Sparrow fly at short height");
    }
    public void eat(){
        System.out.println("Sparrow eat grains");
    }
}
abstract class Eagle extends Bird{
    public void fly(){
        System.out.println("Eagle fly at very very height");
    }
    public abstract void eat();
}
class SerpentEagle extends Eagle{
    public void eat(){
        System.out.println("Serpent eagle eats snake");
    }
}
class GoldenEagle extends Eagle{
    public void eat(){
        System.out.println("Golden eagle catches prey over the ocean");
    }
}
class Crow extends Bird{
    public void fly(){
        System.out.println("Crow fly at medium height");
    }
    public void eat(){
        System.out.println("Crow eat sweet");
    }
}

class Sky{
    public void allowBird(Bird ref){
        ref.fly();
        ref.eat();
    }
}
public class js {
    public static void main(String[] args) {
        Sky sky =new Sky();
        sky.allowBird(new Sparrow());
        sky.allowBird(new SerpentEagle());
        sky.allowBird(new GoldenEagle());
        sky.allowBird(new Crow());
//        sky.allowBird(new Sparrow());
    }
}
