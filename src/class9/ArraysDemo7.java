package class9;

public class ArraysDemo7 {
    public static void main(String[] args) {
        // create an array store 10,20,30,4,5,6,7,80
        // add all the elements which are multiple of 2

       int [] array= {10,20,30,4,5,6,7,80 };
        int sum =0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0){
                sum = sum +array[i];
            }
        }
        System.out.println(sum);
        }

}

