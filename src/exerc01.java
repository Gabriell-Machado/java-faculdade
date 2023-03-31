// Escreva um programa que, com base em uma temperatura em
// graus celsius, a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit
// (F), seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C * 1.8 + 32
// + 459.67.

public class exerc01 {
/*
 * Lista de Exercicios Aula02 -
 * Exercicio 01
 * data: 06/03/2023
 * nome: Gabriel Machado
 */
	public static void main(String[] args) {
		double C;
		double K;
		double Re;
		double Ra;
		double F;
		C = 22;
		System.out.println("C: " + C);
		F = C *1.8+32;
		System.out.println("F: " + F);
		K = C + 273.15;
		System.out.println("K: " + K);
		Re = C * 0.8;
		System.out.println("Re: " + Re);
		Ra = C * 1.8 + 32 + 459.67;
		System.out.println("Ra: " + Ra);
		
	}

}
