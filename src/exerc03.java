// Escreva um programa que calcule os gastos com alimentação e
// transporte de um aluno durante um mês e apresente o resultado total e a média diária.

import java.util.Scanner;

public class exerc03 {

/* 
* Lista de Exercicios Aula02 -
* Exercicio 03
* data: 13/03/2023
* nome: Gabriel Machado
*/
		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double gastoAlimentacao;
		double gastoTransporte;
		double gastoTotal = 0;
		
		for(int i = 1; i < 31; i++) {
			System.out.println("Gasto com no dia: " + i);
			gastoAlimentacao = scan.nextDouble();
			System.out.println("Gasto com transporte no dia: " + i);
			gastoTransporte = scan.nextDouble();
			gastoTotal += gastoAlimentacao + gastoTransporte;
		}
		
		System.out.println("Seu gasto total é de: " + gastoTotal); 
		System.out.println("Seu gasto médio é: " + gastoTotal/30);
		
		
	}
}
