package _07_ForLoop;

public class Q19_YildizPiramitt {
    /*
     Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız.
            Sonuç böyle olmalıdır;

                   *
                  * *
                 * * *
                * * * *
               * * * * *
     */

    public static void main(String[] args) {

        for (int i = 5; i >= 0; i--) {
            for (int j = i+1; j <= 5; j++) {
                System.out.print(" * ");
            }
            System.out.println();
            for (int x = 1; x <= i; x++) {
                System.out.print(" ");
            }
        }
    }
}

