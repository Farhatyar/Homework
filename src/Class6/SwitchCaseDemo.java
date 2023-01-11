package Class6;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        String country="afghanistan";
        System.out.println(country.toLowerCase());
        switch (country.toLowerCase()){ // converts the text to lowercase USA=>usa

            case "usa":
                System.out.println("Burgers");
                break;
            case "Itlay":
                System.out.println("pasta");
                break;
            case "afghanistan":
                System.out.println("Kebab");
                break;
            default:
                System.out.println("Wrong country");
        }
    }
}
