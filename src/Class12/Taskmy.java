package Class12;

public class Taskmy {
    public static void main(String[] args) {
        String username="Ahmad456";
        String password="kabul789";
        String confirmpassword="kabul789";

        boolean usernameIsempty=username.isEmpty();
        boolean passwordIsempty=username.isEmpty();

        if (usernameIsempty || passwordIsempty){
            System.out.println("Username or password connot be empty");
        }
        else if (password.length()<8){
            System.out.println("password is too short");
        }
else if (password.contains(username)){
    System.out.println("password connot contain username");

}
    else     if (!password.equals(confirmpassword)) {

            System.out.println("passwords do not match");
        }else {
            System.out.println("Your username and password has been created");
        }

    }
}
