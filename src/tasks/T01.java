package tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T01 {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen cumleyi  parametre olarak alan
         * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
         * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
         * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
         */

        String cumle = "Ali, bugun yeni okulda gitti mi?";
        System.out.println(cumle);
        String kelime = LongestWord(cumle);
        System.out.println(kelime);
    }

    public static String LongestWord(String cumle) {
        List<String> cumleArray = new ArrayList<String>();
        cumle = cumle.trim().replaceAll("\\p{Punct}",""); // punctuation isaretlerini siler, hiçlik koyar
        cumleArray = List.of(cumle.split(" "));

        String enuzunKelime = cumleArray.get(0);
        for (int i = 0; i < cumleArray.size(); i++) {
            if (cumleArray.get(i).length() > enuzunKelime.length()) {
                enuzunKelime = cumleArray.get(i);
            }
        }
        return enuzunKelime;

    }
}
