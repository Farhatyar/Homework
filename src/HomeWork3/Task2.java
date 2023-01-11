package HomeWork3;

public class Task2 {
    public static void main(String[] args) {
        double rate=4.5;
        int price=300000;

        if(rate>4.5 ){
            System.out.println("lets not buy a house");
        }else {
            System.out.println("let's consider it");
            if(price>200000){
                System.out.println("apply for loan");
            }else {
                System.out.println("pay cash");
                }
            if (price<=200000)
            {
                System.out.println("Accept the client");
            }else {
                System.out.println("Reject the loan");
            }
        }
    }
}
