package Lecture_3;

//      The diamond problem is an ambiguity that arises in object-oriented programming when a class inherits from two different parents
//      that both contain a method with the exact same signature
// This if both parents have constructor then at time of obj creation of son which constructor run first ? Ambiguity

class Father {
    public void marriage(){
        System.out.println("we should always do Love Marriage");
    }
}
class Mother {
    public void marriage(){
        System.out.println("We should always do Arrange marriage");
    }
}
    //class son extends Father extends Mother { //this gives error we cant do mutiple inheritance it creates diamond problemy
    //    public void Hello(){
    //        System.out.println("Hello");
    //    }
    //}

public class diamondProblem {
    public static void main(String[] args) {
//        son s1=new son();
////        s1.Hello();
    }
}
