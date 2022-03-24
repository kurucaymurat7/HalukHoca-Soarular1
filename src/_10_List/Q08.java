package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q08 {

    public static void main(String[] args) {
        /* TASK :
         * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
         * 8. elemaninin yerlerini degistirin.
         *
         * ORNEK:
         *
         * INPUT : String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
         * OUTPUT : String[] isimler={"Umit","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
         */

        // list.set ile
        // temp kullanarak

        String[] isimler= {"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
        String[] yeniisimler = isimler;

        System.out.println(Arrays.toString(isimler));

        String temp = isimler [2]; // temp = "Kemal"
        yeniisimler[2] = isimler[7]; //yenisimler2 = Furkan
        yeniisimler[7] = temp; // yeniismler7 = Kemal

        System.out.println(Arrays.toString(yeniisimler));

    }

}
