package _09_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        /* TASK :
         kullanıcıdan alınan bir  String'deki herbir  karakterin adedini bir array içinde yazdıran bir java programı yazın.
         String  "Javacilar cook afilli" ise cevap şöyle olmalıdır:
         { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}
         */

        String cumle = "Javacilarsfds coksdfdsf afillisdfdsf";
        String harfler = "";
        String adetler = "";
        int sayac;

        //Cumle içerisindeki her bir harfi, kendinden sonraki harflerle karşılaştırıyor.
        //Eger, bu harf harfler stringine daha once atildi ise, bu harfi tekrar kontrol etmiyor.
        //Bu harf, daha once kontrol edilmedi ise, kendinden sonrakilerle kontrol edip, her eşleşmede sayaci +1 yapıyor.
        //Bu şekilde harfler (her harf bir defa yazılı) ve adetler (harfler String'i ile sirali olarak adetleri tutuyor) String'i oluşuyor.

        for (int i = 0; i < cumle.length(); i++) {
            sayac = 1;
            if (!harfler.contains(cumle.substring(i, i + 1))) {
                for (int j = i + 1; j < cumle.length(); j++) { //j, aranan indexten sonrakilere bakmak için
                    if (cumle.substring(i, i + 1).equals(cumle.substring(j, j + 1))) {
                        sayac++;
                    }
                }
                harfler = harfler.concat(cumle.substring(i, i + 1));
                adetler = adetler.concat("" + sayac); //3
            }
        }
        System.out.println(harfler);// harfler = "Javcilr okf"
        System.out.println(adetler);// adetler = "14123312211"

        //Oluşan harfler ve adetler String'i istenen outputa göre = ve , simgeleri ile yerleştiriliyor.
        String harflerAdetler = "";
        for (int i = 0; i < harfler.length(); i++) {
            harflerAdetler += harfler.substring(i, i + 1) + "=" + adetler.substring(i, i + 1) + "!";
        }
        // harflerAdetler = "J=1,a=4,v=1,c=2,i=3,l=3,r=1, =2,o=2,k=1,f=1,"

        System.out.println(harflerAdetler);

        //Bu noktada elde edilen String'i array'e dönüştürme işlemi yapıyoruz.
        String harflerAdetlerArray[] = harflerAdetler.split("!");

        System.out.println(Arrays.toString(harflerAdetlerArray));
        // [J=1, a=4, v=1, c=2, i=3, l=3, r=1,  =2, o=2, k=1, f=1].
    }


}


    

