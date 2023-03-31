import java.util.Scanner;

public class exerc04 {

/* 
* Lista de Exercicios Aula02 -
* Exercicio 04
* data: 27/03/2023
* nome: Gabriel Machado
*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Coloque o peso em quilogramas: ");
		double m = scan.nextDouble();
		System.out.println("Coloque a altura em metros: ");
		double h = scan.nextDouble();
		System.out.println("Coloque o tempo em segundos: ");
		int t = scan.nextInt();
		
		double cavalos = (m * h / t) / 745.6999;
		System.out.println("A quantidade necessária de cavalos é: " + (int)cavalos);
		
	}

}
