package HomeWork20;

public abstract class  Insurance {
   /*Create a class Insurance that will have an attribute as insuranceName and
    unimplemented behaviour as getQuote and cancelInsurance. Create 3 subclasses
    Car, Pet, Health. Car class has its own attribute as carModel and Class Pet
    has petType attribute. Create 3 objects of the subclasses and store them in
    ArrayList. Using for loop/advanced for loop/ iterator access all methods of
    the class.*/
   static String insuranceName;
    double baseRate=156.4;

    public  abstract void getQuote();
    public abstract void cancelInsurance();
    }
    class Car extends Insurance{
    String carModel;
    public Car(String carModel) {
        this.carModel=carModel;
    }
        @Override
        public void getQuote() {
            System.out.println("Car insurance 200$");
        }
        @Override
        public void cancelInsurance() {
            System.out.println("you will get refund 50%");
        }
    }
    class pet extends Insurance{
    pet(String petType){
        this.petType=petType;
    }
    String petType;
        @Override
        public void getQuote() {
            System.out.println("your pet insurance is 15$");

        }

        @Override
        public void cancelInsurance() {
            System.out.println("you will not get refund anything");
        }
    }
    class Health extends Insurance{
    int age;
        public Health(int age) {
            this.age=age;
        }

        @Override
        public void getQuote() {
            System.out.println("your Health insurance is 149.99$");
        }

        @Override
        public void cancelInsurance() {
            System.out.println("you will get refund 100%");
        }
    }
