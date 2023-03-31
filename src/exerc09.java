// Monte um programa (Missão1_EXERC09) que, dado o valor de um carro com
// depreciação de 7% ao ano, mostre o valor de venda durante 10 anos. Considere também
// o mesmo valor do carro, investido em aplicação básica com correção de 7%. Mostre o
// valor do investimento durante 10 anos. Mostre também a diferença entre eles em cada
// ano.

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