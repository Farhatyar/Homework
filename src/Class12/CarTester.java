package Class12;

public class CarTester {

    public static void main(String[] args) {
        // create the object of the class
        Car bmw=new Car();
        bmw.make="BMW";
        bmw.model="I7";
        bmw.year=2023;
        bmw.moveForward();
        bmw.applyBrakes();

        // create two classes of your choice and call
        // the methods from those classes
        Car audi = new Car();
        audi.model ="E-tron";
        audi.make ="Audi";
        audi.year=2022;
        audi.color="black";
        audi.moveForward();
    }
}
