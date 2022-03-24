package _09_Arrays;

import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {
        /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini yazdıran java code create ediniz (negatif sayilar da dahil olsun)

        */

        int[] array = {1,2,3,4,5,6,7,8};
        int adet = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                adet++;
                System.out.println(array[i]);
            }
        }
        System.out.println(adet);


    }

}
