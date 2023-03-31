// Escrever um programa para calcular o valor gasto de combustível
// de um carro durante um percurso. Considere o valor do litro do combustível como sendo
// de 6,50 e o consumo do carro como sendo de 12 km/litro.

import java.util.Scanner;

public class exerc06 {

/* 
* Lista de Exercicios Aula02 -
* Exercicio 06
* data: 27/03/2023
* nome: Gabriel Machado
*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double valorCombustivel = 6.50;
//		double consumoCarro = 12;
		double valorGastoCombustivel = 0;
		double litroGasto = 0;
		System.out.println("Insira a distância percorrida: ");
		double distancia = scan.nextDouble();
		
		
		while (distancia % 12 != 0) {
			distancia--;
		}
		if (distancia % 12 == 0) {
			for(int i = 0; i < distancia; litroGasto++) {
			distancia -= 12;
			}
		} else if (distancia < 12) {
			litroGasto++;
		}
		valorGastoCombustivel += valorCombustivel * litroGasto; 
		
		System.out.println("O valor gasto de combustível é de: " + valorGastoCombustivel);
		System.out.println("O gasto de combustível é de: " + litroGasto);

	}
	
}
