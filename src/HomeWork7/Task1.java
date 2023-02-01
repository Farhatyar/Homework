package HomeWork7;

public class Task1 {
    public static void main(String[] args) {
/* Create an array of chars and store grades into it: A,B,C,D,E,F.
 Then print a grade B (use 2 different ways of creating an array).
 */
        char[] grades = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (int i = 0; i < grades.length; i++) {
            if (grades[i]=='B'){
                System.out.println(grades[i]);
            }
        }
        System.out.println(" second way");
        char[] grades1 = new char[6];
        grades1[0] = 'A';
        grades1[1] = 'B';
        grades1[2] = 'C';
        grades1[3] = 'D';
        grades1[4] = 'E';
        grades1[5] = 'F';
        for (int i = 0; i < grades1.length; i++) {
            if (grades1[i]=='B'){
                System.out.println(grades1[i]);
            }

        }
    }
}
