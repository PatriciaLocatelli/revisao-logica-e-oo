/*
 * 
 Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
 */
package logica.estruturacondicional;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		System.out.println(numero + " é " + ((numero < 0) ? "NEGATIVO" : "NAO NEGATIVO"));
		
		sc.close();
	}
}
