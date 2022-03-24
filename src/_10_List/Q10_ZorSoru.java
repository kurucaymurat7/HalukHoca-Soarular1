package _10_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q10_ZorSoru {
    /* TASK :
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
     */
    public static void main(String[] args) {
        int[] array = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7, 10, 11, 12, 13, 15};
        String str = "";
        int sayac = -1;
        int toplam;
        List<String> liste = new ArrayList<String>();
        List<Integer> toplamliste = new ArrayList<Integer>();

        for (int i = 1; i < array.length; i++) {
            toplam = 0;
            str = "";
            for (int j = 1; j <= i; j++) {
                sayac++;
                if (sayac > array.length - 1)
                    break;
                else {
                    str += array[sayac];
                    toplam += array[sayac];
                }
                if (j != i) {
                    str += "+";
                }
            }
            if (!str.contains(" ")) {
                liste.add(str);
            }
            toplamliste.add(toplam);
        }
        for (int i = 0; i <= liste.size(); i++) {
            if (liste.get(i).equals("")) {
                liste.removeAll(Collections.singleton(""));
            }
        }
        for (int i = 0; i <= liste.size(); i++) {
            if (toplamliste.get(i).equals(0)) {
                toplamliste.removeAll(Collections.singleton(0));
            }
        }

        System.out.println(liste);
        System.out.println(toplamliste);
    }
}




