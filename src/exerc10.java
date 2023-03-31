// Crie um programa (Missão1_EXERC010) que, dado o valor do salário de um usuário,
// calcule a quantidade de salários mínimos que esse usuário ganha e imprima o resultado.
// (1 SM = R$1210,00).

import java.util.Scanner;

public class exerc10 {

/* 
* Lista de Exercicios Aula02 -
* Exercicio 10
* data: 30/03/2023
* nome: Gabriel Machado
*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double valorSalarioMinimo = 1210;
        System.out.println("Digite o salário do usúario: ");
        double valorSalarioUsuario = scan.nextDouble();
        double quantidadeSalarios = valorSalarioUsuario/valorSalarioMinimo;

        System.out.print("A quantidade de salários minímos que esse usúario recebe é: ");
        System.out.printf("%.2f", quantidadeSalarios);


    }
}
