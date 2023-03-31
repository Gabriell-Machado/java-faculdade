import java.util.Scanner;

public class exerc09 {

/* 
* Lista de Exercicios Aula02 -
* Exercicio 09
* data: 30/03/2023
* nome: Gabriel Machado
*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira o valor do carro: ");
        double valorCarroDepreciacao = scan.nextDouble();
        double valorCarroAplicacao = valorCarroDepreciacao;

        for(int i = 1; i < 11; i++) {
            valorCarroDepreciacao = valorCarroDepreciacao - (valorCarroDepreciacao * 0.07); 
            valorCarroAplicacao = valorCarroAplicacao + (valorCarroAplicacao * 0.07);
            System.out.println("Valor do carro após o " + i + "° ano de depreciação: " + (int)valorCarroDepreciacao);
            System.out.println("Valor do carro após o " + i + "° ano de aplicação: " + (int)valorCarroAplicacao);
            System.out.println("A diferença de valor é de: " + (int)(valorCarroAplicacao - valorCarroDepreciacao));
        }
        
    }
}