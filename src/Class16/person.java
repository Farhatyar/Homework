package Class16;

public class person {
    private double bankBalance=1250000;
    String Address="Street 123"; // default access level is applied
    public String name= "Jon Snow";

    private void printPhonePassword(){
        System.out.println("pass123");
    }
    void printSSN(){
        System.out.println("123456789");
    }
   public void printTikTokAccount(){
       System.out.println("user123");

    }
    public static void main(String[] args) {
        person person=new person();
        System.out.println(person.bankBalance);
        System.out.println(person.Address);
        System.out.println(person.name);
        person.printPhonePassword();
        person.printSSN();
        person.printTikTokAccount();
    }
}
