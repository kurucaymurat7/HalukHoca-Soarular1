package Projects.filmTahmin;

import java.util.*;

public class FilmTahmin {

    static List<String> filmList = new ArrayList<>(Arrays.asList("JOKER", "INCEPTION", "PIYANIST", "GREENMILE", "LEON", "GODFATHER", "JURASSICPARK", "TITANIC"));
/*
 TASK :
  yukarıdaki film listinde bulunan filmlerden herhangi birisini kullanıcının filim ismini  görmeden
  filmin index nosuna göre sectiriniz
  seçilen filmin  ismini filmin harf saysının 2 katı kadar hak tanıyarak tahmin etmesini
  sağlayan method create ediniz...
  Ahanda TRICK...
  kullanıcının sectiği filmin harf sayısını  console yazdırınız.
  kullanıcının sectiği film için tahmin hakkını  console yazdırınız.
  kullanıcının her tahmininde kalan hak sayısını console yazdırınız.
  kullanıcının her tahmininde doğru ve yanlış tahmin  sayısını console yazdırınız.
  kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız.

 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("~~~FILM TAHMIN OYUNUNA HOSGELDINIZ~~~");
        int secimIndex = -1;
        String film = "";
        int kalanhak = -1;
        String tahmin = "";
        char devamke = ' ';

        System.out.println("1-" + (filmList.size()) + " arasinda bir sayi giriniz");
        secimIndex = scan.nextInt();
        film = filmList.get(secimIndex - 1);
        kalanhak = film.length();

        while (true) {
            System.out.println(" Kalan Hak : " + kalanhak);
            System.out.print("Tahmin : ");
            tahmin = scan.next();
            if (tahmin.equalsIgnoreCase(film)) {
                System.out.println(" Tebrikler. Bildiniz. ");
                break;
            } else {
                kalanhak -=1;
                if (kalanhak == 0) {
                    System.out.println(" Maalesef hakkınız kalmadı .");
                    System.out.println(" Film : " + film);
                    break;
                }
            }
        }
    }
}
