package Class12;

import java.util.Locale;

public class StringDemo2 {
    public static void main(String[] args) {
        // only converts the upper case to the lower case
        String str="JAVA IS FUN";
        String newstr= str.toLowerCase();
        System.out.println(newstr);
        String str2="i love java";
        String upperCaseLetter=str2.toUpperCase();
        System.out.println(upperCaseLetter);

    }
}
