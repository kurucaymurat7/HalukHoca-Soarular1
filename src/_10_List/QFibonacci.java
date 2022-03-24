package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QFibonacci {
     /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     1-1-2-3-5-8-13-21-34....
     */

    public static void main(String[] args) {

        int ilksayi = 1;
        int ikincisayi = 1;
        int toplam = 0;
        System.out.print("" + ilksayi + " - " + ikincisayi + " - ");
        for (int i = 2; i < 10; i++) {
            toplam = ilksayi + ikincisayi;
            System.out.print( toplam + " - " );
            toplam=ilksayi+ikincisayi;
            ilksayi = ikincisayi;
            ikincisayi = toplam;
        }
    }
}
