package _10_List;

public class Q07 {

    public static void main(String[] args) {
		/* TASK :
		ayna check sorusu:
		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		 output : verilen array simetriktir
		 */
        int array[] = { 1, 2, 3, 4, 5, 4, 3, 2, 1};
        int sayac = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[array.length-1-i]) {
                sayac++;
            }
        }
        if (sayac == array.length) {
            System.out.println("Simetriktir");
        } else {
            System.out.println("Asimetriktir");
        }
    }

}
