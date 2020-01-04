/*
 Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
 */
package logica.estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double valor = sc.nextDouble();
		String intervalo = intervaloValores(valor);
		
			System.out.println(intervalo);
		
		sc.close();

	}

	public static String intervaloValores(double valor) {
		if (valor >= 0 && valor <= 25.00) {
			return "[0,25]";
		} else if (valor > 25.00 && valor <= 50.0) {
			return "[25,50]";
		} else if (valor > 50.00 && valor <= 75.00) {
			return "[50,75]";
		} else if (valor > 75.00 && valor <= 100.00) {
			return "[75,100]";
		} else {
			return "Fora do Intervalo";
		}
	}

}
