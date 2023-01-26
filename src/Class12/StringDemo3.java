package Class12;

import javax.lang.model.element.Name;

public class StringDemo3 {
    public static void main(String[] args) {
        String firstName="Ahmad Tamim";
        String lastName="Farhatyar";
        String fullname=firstName+" "+lastName;
        System.out.println(fullname);
        System.out.println(firstName+" "+lastName);
        System.out.println(firstName.concat(" "+lastName));
    }
}
