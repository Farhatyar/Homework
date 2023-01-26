package Class12;

public class StringDemo9 {
    public static void main(String[] args) {
      String str="jkh124dfgdf1568621*!@#$%fgfdg^&&**()_";
      int counter=0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                counter++;
            }
        }
        System.out.println("Total isAlphabetic in str "+counter);
    }
}
