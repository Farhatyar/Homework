package HomeWork17;

public class Tester {
    public static void main(String[] args) {
        CreditCard creditCard=new CreditCard();
        System.out.println(creditCard.calculateInterest(25000,10));
         Visa v=new Visa();
        System.out.println(v.calculateInterest(10000,2.3));

        AX ax=new AX();
        System.out.println(ax.calculateInterest(6000,1.2));
    }


}
