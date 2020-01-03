/*
 * 
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.
 */
package logica.estruturacondicional;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println((((a%b)==0) || ((b%a)==0)) ? "São Multiplos":"Não são multiplos");
		
		sc.close();
	}
}
