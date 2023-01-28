package Class15;

public class MEthodPractice2 {
// eate a method that takes a String reverse it and return the  reversed String.
    // call the method reverseStr
    String reveerseStr(String input){
        String newStr="";
        for (int i =input.length()-1; i>=0; i--){
       newStr+=input.charAt(i);
        }
        return newStr;
    }
}