// Faça um programa (Missão1_EXERC07) que, dada a idade de uma pessoa expressa em
// anos, meses e dias, mostre-a expressa em dias. Leve em consideração o ano com 365
// dias e o mês com 30. (Ex: 3 anos, 2 meses e 15 dias = 1170 dias).

import java.util.Scanner;

public class exerc07 {

/* 
* Lista de Exercicios Aula02 -
* Exercicio 07
* data: 29/03/2023
* nome: Gabriel Machado
*/
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantidade de anos: ");
        int anos = scan.nextInt();
        System.out.println("Quantidade de meses: ");
        int meses = scan.nextInt();
        System.out.println("Quantidade de dias: ");
        int dias = scan.nextInt();
        System.out.print(anos + " anos " + meses + " meses " + dias + " dias = ");

        while (anos != 0) {
            dias += 365;
            anos--;
        }
        while (meses != 0) {
            dias += 30;
            meses--;
        }
        System.out.println(dias + " dias");
    }
}