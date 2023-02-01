package HomeWork12;

public class Task3ByTeacher {
    /*
    Create a method that will print whether given String is palindrome or not
    return type =>void
    mane=>ispalindeome
    parameters=> String inputStr
    {
    }
     */

    void isPalindrome(String Str){
        StringBuilder st=new StringBuilder(Str);
        st.reverse();
        String reversedStr=st.toString()
                ;
        if (Str.equals(reversedStr)){
            System.out.println(Str+" is palindrome");
        }else {
            System.out.println(Str+" Not is palindrome");
        }
    }
    public static void main(String[] args) {
        Task3ByTeacher task3=new Task3ByTeacher();
        task3.isPalindrome("omar");
    }
}
