package desafio;

import java.util.Scanner;

public class Dois {
	
	public static int calculaPares(int [] mat, int dif, int total) {
		for (int elemento = 0; elemento < mat.length; elemento++) {
			for (int novoElemento = 0; novoElemento < mat.length; novoElemento++) {
				if (novoElemento > elemento && 
				   (mat[elemento] - mat[novoElemento] == dif || mat[novoElemento] - mat[elemento] == dif)) {
						total++;
				}
			}
		}
		
		return total;
	}
	
	public static void main(String[] args) {
		int[] n = { 1, 5, 3, 4, 2, 7, 6, 9, 8};
		int totalDePares = 0;
		
		System.out.println("Por favor, insira a diferença entre os números para que sejam gerados os pares: ");
		
		Scanner entrada = new Scanner(System.in);
		int x = entrada.nextInt();		
		
		System.out.println("O total de pares com diferença de " + x + " é: " + calculaPares(n, x, totalDePares));
		
		entrada.close();
	}
}
