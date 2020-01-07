/*
 *
Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
 */
package logica.estruturarepetitiva.topicowhile;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			String quadrante;
			if (x == 0 || y == 0) {
				break;
			} else {
				quadrante = qualQuadrante(x, y);
				System.out.println(quadrante);
			}
		}

		sc.close();
	}

	public static String qualQuadrante(int x, int y) {
		if (x > 0 && y > 0) {
			return "Primeiro Quadrante";
		} else if (x < 0 && y > 0) {
			return "Segundo Quadrante";
		} else if (x < 0 && y < 0) {
			return "Terceiro Quadrante";
		} else {
			return "Quarto Quadrante";
		}
	}

}
