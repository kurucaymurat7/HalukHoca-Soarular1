package _09_Arrays;

import java.util.Arrays;

public class Q16 {
    public static void main(String[] args) {
        /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */
        String input = "ade1r4d3";
        sumofDigits (input);
    }

    public static void sumofDigits(String input) {
        String[] array = input.split("");
        char karakter = ' ';
        System.out.println(Arrays.toString(array));

        int toplam = 0;
        for (int i = 0; i < array.length; i++) {
            karakter = input.charAt(i);
            if (Character.isDigit(karakter)){
                toplam += Integer.valueOf(String.valueOf(karakter));
                //toplam += Integer.parseInt(String.valueOf(karakter)); Bu şekilde de kullabılabilir...
            }
        }
        System.out.println(toplam);
    }
}

