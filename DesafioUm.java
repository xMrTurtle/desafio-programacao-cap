package desafio;

import java.util.Arrays;

public class Um {

	public static void main(String[] args) {
		int[] arr = { 9, 2, 1, 4, 6, 8, 5, 7, 3};
		int index = arr.length/2;
		Arrays.sort(arr);
		
		System.out.println("A mediana para o array em memória, com número ímpar de elementos é "+ arr[index]);

	}
}
