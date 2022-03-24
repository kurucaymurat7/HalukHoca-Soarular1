package KarisikSorular;

import java.util.Scanner;

public class C01 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ne kadar çay ? ");
        double caymiktari = scan.nextDouble();
        System.out.println("Ne kadar şeker ? ");
        double sekermiktari = scan.nextDouble();

        double sonuc = ((caymiktari * sekermiktari * 1.7)*365)/1000;

        System.out.println("Yılda " + sonuc + " kg şeker kullanıyor...");


    }

}


