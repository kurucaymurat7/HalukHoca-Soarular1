package _10_List;
import java.util.Random;
import java.util.Scanner;

public class QTasKagitMakas01 {
    public static void main(String[] args) {

        System.out.println("TAS KAGİT MAKAS OYUNU... BASARİLAR");
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int ksecim = 0, bsecim = 0;

        int round = 0;
        int kpuani = 0;
        int bpuani = 0;
        int devamke = -1;
        while (true) {
            round++;
            int i=1;
            for (i = 1; i <= 3; i++) {
                System.out.println("Seçimin nedir ? 1...TAS , 2...KAGIT , 3...MAKAS ");
                ksecim = scan.nextInt();

                if (ksecim == 1) System.out.println("Kullanici secimi : TAS ");
                if (ksecim == 2) System.out.println("Kullanici secimi : KAGİT");
                if (ksecim == 3) System.out.println("Kullanici secimi : MAKAS ");

                bsecim = rand.nextInt(3);
                bsecim++;
                if (bsecim == 1) System.out.println("Bilgisayar secimi : TAS ");
                if (bsecim == 2) System.out.println("Bilgisayar secimi : KAGİT");
                if (bsecim == 3) System.out.println("Bilgisayar secimi : MAKAS ");

                if (ksecim == bsecim) {
                    System.out.println(" İki taraf da puan alamadi. ");
                }
                if (ksecim == 1) {
                    if (bsecim == 2) {
                        kpuani++;
                        System.out.println("Kullanici 1 puan aldi.");
                    }
                    if (bsecim == 3) {
                        bpuani++;
                        System.out.println("Bilgisayar 1 puan aldi.");
                    }
                }
                if (ksecim == 2) {
                    if (bsecim == 1) {
                        kpuani++;
                        System.out.println("Kullanici 1 puan aldi.");
                    }
                    if (bsecim == 3) {
                        bpuani++;
                        System.out.println("Bilgisayar 1 puan aldi.");
                    }
                }
                if (ksecim == 3) {
                    if (bsecim == 1) {
                        bpuani++;
                        System.out.println("Bilgisayar 1 puan aldi.");
                    }
                    if (bsecim == 2) {
                        kpuani++;
                        System.out.println("Kullanici 1 puan aldi.");
                    }
                }
            }
            System.out.println(round + ".tur bitti. SONUÇLAR");
            System.out.println("Kullanici puani : " + kpuani + ", " + "Bilgisayar puani : " + bpuani);
            System.out.println("Oyuna devam etmek istiyor musunuz ? EVET (1) / HAYIR (0)");
            devamke = scan.nextInt();
            if (devamke == 0) break;
        }
        System.out.println(" oyun bitti...");
        if (kpuani == bpuani) {
            System.out.println("BERABERE KALDINIZ...");
        } else if (kpuani > bpuani) {
            System.out.println("KULLANICI KAZANDI...");
        } else {
            System.out.println("BİLGİSAYAR KAZANDI...");
        }
    }
}



