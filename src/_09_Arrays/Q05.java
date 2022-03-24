package _09_Arrays;

public class Q05 {

    public static void main(String[] args) {
        /*  TASK :
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         */

        double[] array = {1,2,3,4,5,6,7};
        double toplam = 0;
        double ortalama = 0;

        for (int i = 0; i < array.length; i++) {
            toplam += array[i];
        }
        ortalama = toplam / array.length;
        System.out.println(ortalama);

        for (int i = 0; i < array.length; i++) {
            if (array[i]>ortalama) {
                System.out.println(array[i]);
            }

        }

    }

}


