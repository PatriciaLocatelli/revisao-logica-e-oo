/*
 * 
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
 */
package logica.estruturacondicional;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		int horas = (horaInicial < horaFinal) ? (horaFinal - horaInicial) : ((24 - horaInicial) + horaFinal);
		System.out.println("O JOGO DUROU " + horas + " HORA(S)");
		sc.close();
	}
}
