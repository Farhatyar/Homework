package Class8;

public class NestedLoops13m {
    public static void main(String[] args) {
        /* 5
           5 4
           5 4 3
           5 4 3 2
           5 4 3 2 1
          */
        for (int row = 5; row >=1; row--) {
            for (int col =5; col >=row ; col--) {
                System.out.print(col+" ");

            }
            System.out.println();
        }
    }
}
