package Projects.Projects_02;

import java.util.Scanner;

public class diffBetweenMaxMin {

    /*
    Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array.

    Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.


    bigDiff([10, 3, 5, 6]) → 10-3 result = 7
    bigDiff([7, 2, 10, 9]) → 10-2 result = 8
    bigDiff([2, 10, 7, 1]) → 10-1 result = 9

    return type is int
     */

    public static void main(String[] args) {

        int[] array = {10, 3, 5, 6};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0 ; i< array.length ; i++){
            max = Math.max(max, array[i]);
            min = Math.min(min, array[i]);
        }

        System.out.println(max - min);


    // Your code start here. Don't remove or change anything before this line. Your array is -> useThisArray in line 27
    // Kodlamaya burdan başla.Bu satırdan önceki satırlarda hiçbirşeyi kaldırma ve degiştirme. Kullanacağın array 27.ci satırda  --> useThisArray


    }

}

