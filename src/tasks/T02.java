package tasks;

import java.util.Scanner;

public class T02 {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen datayi methodda parametre olarak alan
         * ve datanın 2'nin kuvveti olup olmadığını kontrol eden PowersofTwo(num) methodu create ediniz.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi giriniz : ");
        int sayi = scan.nextInt();
        powersofTwo(sayi);
    }

    public static void powersofTwo(int sayi) {
        int carpim = 2;
        boolean sonuc = false;
        sonuc = (sayi == 2) ? true: false;
        while (carpim < sayi) {
            for (int i = 1; i < sayi; i++) {
                carpim = carpim * carpim;
                if (carpim == sayi) {
                    sonuc = true;
                } else if (carpim >sayi) {
                    break;
                }
            }
        }
        if (sonuc) {
            System.out.println("2 nin karesidir");
        } else {
            System.out.println("2'nin karesi değildir");
        }
    }
}

