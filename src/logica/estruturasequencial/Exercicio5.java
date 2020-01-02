package logica.estruturasequencial;

import java.util.Locale;
/*
 *
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
 */
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo1 = sc.nextInt();
		int numeroPecas1 = sc.nextInt();
		double valorPeca1 = sc.nextDouble();
		
		int codigo2 = sc.nextInt();
		int numeroPecas2 = sc.nextInt();
		double valorPeca2 = sc.nextDouble();
		
		System.out.printf("VALOR A PAGAR = R$ %.2f", ((numeroPecas1 * valorPeca1) + (numeroPecas2 * valorPeca2)));
		
		sc.close();

	}

}
