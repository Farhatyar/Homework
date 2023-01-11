package Class6;

public class logicalNotDemo {
    public static void main(String[] args){
        System.out.println(false);
        System.out.println(!false);

        boolean condition=!true;
        System.out.println(condition);

        String Password="pass123";
        System.out.println(Password.equals("pass123"));
        if(!Password.equals("pass123")){
            System.out.println("wrong password");
        }
        boolean isRaining=true;

        if(!isRaining){
            System.out.println("lets go for a walk");
        }else {
            System.out.println("let take the umbrelle");
        }
    }
}
