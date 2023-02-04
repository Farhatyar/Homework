package class3;

public class IfElse_10 {
    public static void main (String [] args){

        boolean hungry=true;

        if(hungry){
            System.out.println(hungry);
            System.out.println(!hungry);

            System.out.println("lets eat");
            if (!hungry){
                System.out.println(hungry);
            }
            boolean nothungry= false;
            System.out.println(nothungry);
            if (!nothungry){
                System.out.println(hungry);
                System.out.println(nothungry);
            }
            if (!hungry){
                System.out.println(nothungry);
            }

        }
    }
}
