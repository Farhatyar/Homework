package Class10;

public class D2Arrays {
    public static void main(String[] args) {
        // a 2D array which can hold 3 one D arrays
        // each of size 3

        String[][] thomsonTrain=new String[3][];

     String[] cabin0={"Adam","Ahmad","sam"};
     String[] cabin1={"Nabi","jan","Yousuf"};
     String[] cabin2={"safi","khan","Omad"};

     thomsonTrain[0]=cabin0;
     thomsonTrain[1]=cabin1;
     thomsonTrain[2]=cabin2;

     // in the first [] we specify the address of 1 D ARRAY
        System.out.println(thomsonTrain[1][2]);

    }
}
