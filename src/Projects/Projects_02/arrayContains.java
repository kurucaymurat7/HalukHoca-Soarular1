package Projects.Projects_02;

import java.util.Arrays;
import java.util.Scanner;

public class arrayContains {


    /*Artan düzende sıralanmış iki adet ınt array göz önüne alındığında,
 dış ve iç, içteki tüm sayılar dışta görünüyorsa true değerini döndürür.
İlk arrayin ikinci arrayi içerdiğini doğrulayın.

         linearIn([1, 2, 4, 6], [2, 4]) → true
         linearIn([1, 2, 4, 6], [2, 3, 4]) → false
         linearIn([1, 2, 4, 4, 6], [2, 4]) → true */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String myStr = scan.nextLine();
        String[] arr = myStr.split(" ");
        int[] myArr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            myArr[i] = num;
        }

        int[] UseThisArray1 = new int[3];
        int[] UseThisArray2 = new int[2];

        for (int i = 0; i < 3; i++) {
            UseThisArray1[i] = myArr[i];
        }
        for (int i = 3; i < 5; i++) {
            UseThisArray2[i - 3] = myArr[i];
        }

//        Code start here
//        Use the array name UseThisArray1 and UseThisArray2

//        Koda burdan başla
//        UseThisArray1 ve UseThisArray2 array isimlerini kullan

        boolean sonuc = false;
        int count = 0;
        int sayi = 0;
        for (int i = 0; i < UseThisArray2.length; i++) {
            count = 0;
            for (int j = 0; j < UseThisArray1.length; j++) {
                if (UseThisArray2[i] == UseThisArray1[j]) {
                    count++; // içten bir eleman aldık, dışta döndürdük. eğer içeriyorsa count artacak.
                }
            }
            if (count > 0) { //count artmışsa, sayi da 1 artmış olacak.
                sayi++;
            }
        } if (sayi == UseThisArray2.length) { //döngüler bittiğinde sayi içteki array-in uzunluğuna eşit olsa
            sonuc = true;                     //demek ki, içteki elemanların hepsi dışta var.
        }
        System.out.println(sonuc);

        // 1 2 4 2 4 array-imiz olsun. dış 1 2 4 , iç 2 4 olacak. 2-yi alıp dışta döndürdüğümüzde count arttığından
        // sayi da 1 olacak. daha sonra içten 4 alıyoruz, dışta döndürüyoruz. count yine artıyor. sayi da 2 oluyor, true dönüyor.
        // 1 2 4 2 2 olduğunda, sayi en son 1 olduğundan false dönecek.








    }
}
