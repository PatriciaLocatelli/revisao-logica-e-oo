/*
*
Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
situação.
 */
package logica.estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		double y = sc.nextDouble();

		String local = localizacao(x, y);
		System.out.println(local);

		sc.close();

	}

	public static String localizacao(double x, double y) {
		if (x > 0 && y > 0) {
			return "Q1";
		} else if (x < 0 && y > 0) {
			return "Q2";
		} else if (x < 0 && y < 0) {
			return "Q3";
		} else if (x > 0 && y < 0) {
			return "Q4";
		} else {
			return "Origem";
		}
	}

}
