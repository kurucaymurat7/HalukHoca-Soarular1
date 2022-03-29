package _10_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q10_Murat_HalukHoca {
    public static void main(String[] args) {
        int arr[] = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7};
        //3, 5+1, 2+7+9, 2+3+5+7
        System.out.println(buNasilMethod(arr));

        int[] array = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7};
        int sayac = -1;
        int toplam;
        List<Integer> toplamliste = new ArrayList<Integer>();

        for (int i = 1; i < array.length; i++) {
            toplam = 0;
            for (int j = 1; j <= i; j++) {
                sayac++;
                if (sayac > array.length - 1)
                    break;
                else {
                    toplam += array[sayac];
                }
            }
            if (toplam != 0)
                toplamliste.add(toplam);
        }
        System.out.println(toplamliste);

    }


    public static ArrayList<Integer> buNasilMethod(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        int kullanilan = 1;
        while (arr.length - kullanilan >= count) {
            int toplam = 0;
            for (int i = 0; i <= count; i++) {
                toplam += arr[kullanilan - 1 + i];
            }
            count++;
            kullanilan += count;
            list.add(toplam);
        }
        return list;
    }

}
