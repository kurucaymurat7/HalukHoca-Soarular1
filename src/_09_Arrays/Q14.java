package _09_Arrays;

import java.util.Arrays;

public class Q14 {

    public static void main(String[] args) {
        /*  TASK :
         * Congratulations kelimesini Array yontemlerini kullanarak asagidaki outputu
         * alin.
         * input : Congratulations
         * output: [C, o, n, g, r, a, t, u, l, a, t, i, o, n, s]
         * sniitilitirgniC --> o ,a ve u harfini i ye donusturun.

         */

        String input = "Congratulations";
        String[] array = input.split("");
        System.out.println(Arrays.toString(array));

        System.out.println(input);

        String tersString = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.substring(i, i+1).equals("o") || input.substring(i, i+1).equals("a") ||input.substring(i, i+1).equals("i")) {
                tersString+= "i";
            } else {
                tersString += input.substring(input.length() - i-1, input.length()-i);
            }
        }

        System.out.println(tersString);
    }

}
