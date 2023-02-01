package Class17;

public class Dog {
    String name;
    String breed;
    String color;
    int age;
    double weight;

    Dog(String dogName,String dogBreed, String dogcolor,
        int dogAge,double dogWeight){
        name=dogName;
        breed=dogBreed;
        color=dogcolor;
        age=dogAge;
        weight=dogWeight;

    }
    void printInfo(){
        System.out.println("Name "+name+" Breed "+breed+
                " Color "+color+" age "+age+" Weight "+weight);
    }
}