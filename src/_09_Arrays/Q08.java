package _09_Arrays;

import java.util.Arrays;

public class Q08 {

    public static void main(String[] args) {
		
		/*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */

        String str = "$10 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        String[] array = str.split(" ");
        System.out.println(Arrays.toString(array));

        int toplamEuro = 0;
        int toplamDolar = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].startsWith("£")) {
                toplamEuro += Integer.valueOf(array[i].substring(1));
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].startsWith("$")) {
                toplamDolar += Integer.valueOf(array[i].substring(1));
            }
        }

        System.out.println("£ toplamı = " + toplamEuro);
        System.out.println("$ toplamı = " + toplamDolar);
    }
}


