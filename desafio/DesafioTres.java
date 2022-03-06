package desafio;

import java.util.Scanner;

public class Tres {

	public static String geraNovaString(String[] textoSplit) {
		String textoSemEspaco = "";
		for (int i = 0; i < textoSplit.length; i++) {
			textoSemEspaco += textoSplit[i];
		}

		return textoSemEspaco;
	}

	public static double validacao(String[] textoSplit) {
		int tamanhoDoTexto = (geraNovaString(textoSplit)).length();
		double coluna;
		double linha;
		double raiz = Math.sqrt(tamanhoDoTexto);
		coluna = linha = Math.floor(raiz);

		if (raiz <= coluna && coluna <= linha && linha <= raiz && linha * coluna >= tamanhoDoTexto) {
			while (linha * coluna > tamanhoDoTexto) {
				coluna -= 0.0000001;
				linha -= 0.0000001;
			}
		} else {
			while (linha * coluna <= tamanhoDoTexto) {
				coluna += 0.0000001;
				linha += 0.0000001;
			}
		}

		return Math.ceil(linha);
	}

	public static String geraGrid(String[] textoSplit) {
		String texto = geraNovaString(textoSplit);
		String stringFinal = "";
		int cont = 0;

		for (int j = 0; j < validacao(textoSplit); j++) {
			while (cont <= validacao(textoSplit)) {
				for (char letra : texto.toCharArray()) {

					stringFinal += letra;
					cont++;
					if (cont % validacao(textoSplit) == 0) {
						stringFinal += '\n';
					}
				}
			}
		}

		return stringFinal;
	}

	public static String geraCript(String[] textoSplit) {
		char[] texto = geraNovaString(textoSplit).toCharArray();
		String stringFinal = "";
		
		for(int letra = 0; letra < texto.length; letra++) {
			for(int i = 0; i < texto.length; i++) {
				if (i % validacao(textoSplit) == letra) {
					stringFinal += texto[i];
				}
			}
			
			stringFinal += " ";
		}
		
		
		return stringFinal;
	}

	
	public static void main(String[] args) {
		System.out.println("Favor insira o texto a ser 'encriptado': ");
		Scanner entrada = new Scanner(System.in);
		String texto = entrada.nextLine();
		String[] textoSeparado = texto.split(" ");

		System.out.println(geraCript(textoSeparado));

		entrada.close();
	}

}
