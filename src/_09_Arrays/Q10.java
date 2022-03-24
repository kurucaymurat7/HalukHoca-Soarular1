package _09_Arrays;

import java.util.Arrays;

public class Q10 {

    public static void main(String[] args) {
        /* TASK:
         you have a string "GayetBasarılı"
         with arrays change it to "CoookBasarılı" and write changing array
         (String'iniz: "Gayet Basarılı"  Diziyi "CoookBasarılı" ye cevirin )
         */

        String cumle = "GayetBasarılı";
        String[] array = cumle.split("");
        String[] yeniarray = new String[array.length];

        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            switch (i) {
                case 0:
                    yeniarray[i] = "C";break;
                case 1: case 2: case 3:
                    yeniarray[i] = "o";break;
                case 4:
                    yeniarray[i] = "k";break;
                default: break;
            }
            yeniarray[i] = array [i];
        }
        System.out.println(Arrays.toString(yeniarray));
    }

}
