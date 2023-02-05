package HomeWork15.Task1;

public class Task1_ClassA {
    void printA (){
        System.out.println("print from Class A");
    }
}

class task1_classB extends Task1_ClassA{
    void printB(){
        System.out.println("print from Class B");
    }
}
class task1_classC extends task1_classB{
    void printC(){
        System.out.println("print from Class C");
    }
}


