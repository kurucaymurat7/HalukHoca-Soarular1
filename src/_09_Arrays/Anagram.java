package _09_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		/*
		 * Anagram, bir kelimenin harflerinden baska bir kelime olusturmaya denir.
			Kullanıcıdan alınacak  iki kelimenin Anagram durumunu belirleyen  Java kodunu yazınız.
			isAnagram("listen", "Silent") ==> true
		 */

		String kelime1 = "Silent";
		String kelime2 = "Listen";
		String array1 [] = kelime1.split("");
		String array2 [] = kelime1.split("");
		Arrays.sort(array1);
		Arrays.sort(array2);
		if (Arrays.equals(array1, array2)) {
			System.out.println("ANAGRAM...");
		} else {
			System.out.println("ANAGRAM DEĞİL...");
		}
	}
}
