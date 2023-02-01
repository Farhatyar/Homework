package HomeWork14;

public class Student2 {
    /*Write a Student class   that have instance variables name and address.
    Create a constructor that will initialize those variables.
     Print name & address of given  student using displayInfo method.
     */
String name;
String address;

Student2 (String sName,String sAddress){
    name=sName;
    address=sAddress;
}
void displayInFo(){
    System.out.println(name);
    System.out.println(address);

}

    public static void main(String[] args) {
        Student2 st2=new Student2("Omar","2500 knights road bensalem Pa 19020 ");
        st2.displayInFo();
    }
}
