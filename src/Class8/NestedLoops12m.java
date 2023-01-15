package Class8;

public class NestedLoops12m {
    public static void main(String[] args) {
        /* 1 2 3 4 5
           2 3 4 5
           3 4 5
           4 5
           5
          */
        for (int row = 1; row <=5; row++) {
            for (int col =row; col <=5 ; col++) {
                System.out.print(col+" ");

            }
            System.out.println();
        }
    }
}
