package Class19;

public class DonkeyTest {
    public static void main(String[] args) {

      //  Donkey donkey=new Donkey(); // default constructor created by the compiler
                      // when a programmer does not create one
        Donkey donkey=new Donkey("pepper",3);// the moment you create a constructor
                         // compiler does not give any Default constructor
        donkey.print();
       }
}
