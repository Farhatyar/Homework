package HomeWork8;

public class dogTester {
    public static void main(String[] args) {

        dog Husky=new dog();

        Husky.name="M";
        Husky.Bread="Husky";
        Husky.color="black";
        Husky.behavior=true;
        Husky.noise();
        System.out.println("*****************");

        dog Bulldog=new dog();

        Bulldog.name="B";
        Bulldog.Bread="Bulldog";
        Bulldog.color="White";
        Bulldog.behavior=false;
        Bulldog.eat();
        System.out.println("*****************");

        dog Labrador=new dog();

        Labrador.name="G";
        Labrador.Bread="Labrador";
        Labrador.color="White";
        Labrador.behavior=true;
        Labrador.sleep();


    }
}
