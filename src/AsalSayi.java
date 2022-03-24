public class AsalSayi {
    public static void main(String[] args) {
        int sayi = 13;
        int bolenlertoplami = 0;
        for (int i = 2; i < sayi ; i++) {
            if (sayi%i ==0) {
                bolenlertoplami += i;
            }
        }
        if (bolenlertoplami == 0) {
            System.out.println("Asal sayi");
        } else {
            System.out.println("Asal olmayan sayi");
        }
    }
}
