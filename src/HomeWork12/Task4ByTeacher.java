package HomeWork12;

public class Task4ByTeacher {
    /*Create a method that will say Hello in different language based
    on the country that will passed when method is executed
    return type=>String void
    name =sayHello
    parameter =>String countryName
     */
    String sayHello(String countryName){
        switch (countryName){
            case "USA":
                return "Hello";
            case "Kazakhstan":
                return  "Salem";
            case "Italy":
                return "Ciao";
            case "China":
                return "Ni hao";
            default:
                return "Country not supported";
        }
    }

    public static void main(String[] args) {
        Task4ByTeacher task4=new Task4ByTeacher();
        System.out.println(task4.sayHello("Italy"));
    }
}
