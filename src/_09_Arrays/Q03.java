package _09_Arrays;

import java.util.Arrays;

public class Q03 {

    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method yaziniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6

         */
        int array[] = {1,2,-3,4,-5,-6};
        int yeniarray[] = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            yeniarray [i] = array[i]*(-1);
        }

        System.out.println(Arrays.toString(yeniarray));
    }


}
