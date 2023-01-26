package Class12;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please Enter your username");
        String username=scanner.next();
        System.out.println("please Enter your password");
        String password=scanner.next();
        System.out.println("please Enter your password again");
        String confirmpassword=scanner.next();
        if(username.isEmpty() || password.isEmpty()){
            System.out.println("username or password cannot be empty");
        }else if(password.length()<8){
            System.out.println("password is too short");
        }else if (password.contains(username)){
            System.out.println("password cannot contain username");
        }else if (!password.equals(confirmpassword)){
            System.out.println("passwords do not match");
        }
    }
}
