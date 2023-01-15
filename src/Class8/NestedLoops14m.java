package Class8;

public class NestedLoops14m {
    public static void main(String[] args) {
        /* 1
        1 0
        1 0 1
        1 0 1 0
        1 0 1 0 1
         */
        for (int row = 1; row < 6; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col%2+" ");

            }
            System.out.println();

        }

    }
}
