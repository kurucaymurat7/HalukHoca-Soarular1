package Projects.Projects_01;

import java.util.Random;
import java.util.Scanner;

public class RandomNum {


    /*
    Given a positive integer num name is max ,

    create a random number between 0 to max

    output should be int

     */



 /*

    Veri tipi integer olan max sayısı verildiğinde

    0 ile max sayisi arasindan random bir sayi elde et(olustur)

    output tipi int olmalı


  */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("bir sasyi giriniz : ");
        int max=scanner.nextInt();

        Random rnd = new Random();
        int sayi = rnd.nextInt(max);
        System.out.println(sayi);
		

    }
}