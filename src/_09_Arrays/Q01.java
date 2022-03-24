package _09_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {

	/* TASK :
	 kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
	 ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
	 java code create ediniz.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int adet = 5;

		int[] array  = new int[adet];

		for (int i = 0; i < 5; i++) {
			System.out.println(i+1 + ". eleman : ");
			array[i] = scan.nextInt();
		}

		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		System.out.println(array[array.length-1] - array[0]);
	}

}
