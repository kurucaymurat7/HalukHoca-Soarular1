package _09_Arrays;

import java.util.Arrays;

public class Q06 {
    public static void main(String[] args) {
	
	/*TASK :
	write a java program to find the second largest number in the array?
	Maximum and minimum number in the array?
	(Dizideki en büyük ikinci sayyiyi, maksimum ve minimum sayiyi
	bulmak için bir java programi yazin)
	
	int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	
	*/

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]); // En buyuk ikinci sayi
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);

    }
}
