// Escreva um programa para calcular e apresentar o valor do volume
// de uma lata de óleo, utilizando fórmula: V = 3.14159 * R * R * A, em que as variáveis: V,
// R e A representam respectivamente o volume, o raio e a altura. Vamos declarar as
// variáveis V, R e A como double e definir um valor qualquer para as variáveis de altura e
// de raio. Agora vamos escrever a fórmula, conforme dita no enunciado e, em seguida,
// exibir na tela uma mensagem contendo o resultado do volume encontrado.

import java.util.Scanner;

public class exerc05 {

/* 
* Lista de Exercicios Aula02 -
* Exercicio 05
* data: 27/03/2023
* nome: Gabriel Machado
*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Coloque o valor do raio: ");
		double raio = scan.nextDouble();
		System.out.println("Coloque o valor da altura: ");
		double altura = scan.nextDouble();
		
		double volume = 3.14159 * raio * raio * altura;
		System.out.println("Volume da lata de óleo é: " + volume);
	}

}
