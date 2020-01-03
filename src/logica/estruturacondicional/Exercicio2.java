/*
 * Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
 */
package logica.estruturacondicional;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		System.out.println((numero%2 == 0)?"PAR":"ÍMPAR");
		
		sc.close();
	}

}
