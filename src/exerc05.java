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
