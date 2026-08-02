package Lecture_3;


interface Fathers {
    default void marriage(){
        System.out.println("we should always do Love Marriage");
    }
}
interface Mothers {
    default void marriage(){
        System.out.println("We should always do Arrange marriage");
    }
}
class sons implements Fathers , Mothers { //this gives error we cant do mutiple inheritance it creates diamond problem
    public void marriage(){
        Fathers.super.marriage();
    }
}

public class SolutionOfDiamondPblm {
    public static void main(String[] args) {
        sons s1 =new sons();
        s1.marriage();
    }
}

