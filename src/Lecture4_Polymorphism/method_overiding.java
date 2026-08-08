package Lecture4_Polymorphism;

class plane {
    void fly(){
        System.out.println("Plane is flying");
    }
    void land(){
        System.out.println("Plane is Landing");
    }
    void takeoff(){
        System.out.println("Plane is takeoff");
    }
}
class cargoPlane extends plane {
    void fly(){
        System.out.println("cargoPlane is flying");
    }
    void land(){
        System.out.println("cargoPlane is Landing");
    }
    void takeoff(){
        System.out.println("cargoPlane is takeoff");
    }
}
class fighterPlane extends plane {
    void fly(){
        System.out.println("fighterPlane is flying");
    }
    void land(){
        System.out.println("fighterPlane is Landing");
    }
    void takeoff(){
        System.out.println("fighterPlane is takeoff");
    }
}
class airPort{
    void allowPlane(plane p){
        p.takeoff();
        p.fly();
        p.land();
    }
}
public class method_overiding {
    public static void main(String[] args) {
        airPort mumbai=new airPort();
        mumbai.allowPlane(new plane());
        mumbai.allowPlane(new cargoPlane());
        mumbai.allowPlane(new fighterPlane());
    }
}
