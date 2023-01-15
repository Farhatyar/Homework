package HomeWork5;

public class Task3 {
    public static void main(String[] args) {

        // Print even numbers from 20 to 1 (2 ways)
        int i=20;
        for ( i = 20; i >=1 ; i-=2) {
            System.out.println(i);

        }
        System.out.println("****************************");
         int j=20;
        for ( j= 20; j >0 ; j--) {
            if (i%2==0){
                System.out.print(j);
            }

        }
    }
}
