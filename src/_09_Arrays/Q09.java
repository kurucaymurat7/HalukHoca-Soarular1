package _09_Arrays;

import java.util.Arrays;

import static java.lang.Math.sqrt;

public class Q09 {

    public static void main(String[] args) {
		/* TASK :
        given an int array and find the squares of the elements
        (Verilen bir int dizisi icin elemanlarin karelerini bulun )
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */

        int [] array = {2,6,4,5,8,9};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]*array[i]);
        }
    }

}
