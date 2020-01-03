/*
 * 
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.
Código		Especificação		Preço
1			Cachorro Quente		R$4.00
2			X-Salada			R$4.50
3			X-Bacon				R$5.00
4			Torrada Simples		R$2.00
5			Refrigerante		R$1.50
 */
package logica.estruturacondicional;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		double preco = produtos(codigo);
		
		if (preco == -1) {
			System.out.println("Código Inválido");
		} else {
			System.out.printf("Total: R$ %.2f" , (preco * quantidade));
		}

		sc.close();
	}

	public static double produtos(int codigo) {
		switch (codigo) {
		case 1:
			return 4.0;
		case 2:
			return 4.5;
		case 3:
			return 5.0;
		case 4:
			return 2.0;
		case 5:
			return 1.5;
		default:
			return -1;
		}
	}

}
