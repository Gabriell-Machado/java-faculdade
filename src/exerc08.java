// Fazer um programa (Missão1_EXERC08) que imprima a média aritmética dos números
// 8,9 e 7. A média dos números 4, 5 e 6. A soma das duas médias. A média das médias.

public class exerc08 {

/* 
* Lista de Exercicios Aula02 -
* Exercicio 08
* data: 29/03/2023
* nome: Gabriel Machado
*/
    public static void main(String [] args) {

        double media897 = (7+8+9)/3;
        double media456 = (4+5+6)/3;
        double mediaMedia = (media456+media897)/2;

        System.out.println("Média dos números 7, 8 e 9: " + media897);
        System.out.println("Média dos números 4, 5 e 6: " + media456);
        System.out.println("A soma das médias é: " + (media456 + media897));
        System.out.println("A média das médias é: " + mediaMedia);

    }
}