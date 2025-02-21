// Nome:
//Ra:
//Objetivo: .Faça um programa na Linguagem Java para ler dois valores inteiros
//para as variáveis A e B e efetuar a troca dos valores de forma que a
//variável A passe a possuir o valor da variável B e a variável B passe
//a possuir o valor da variável A. Apresentar os valores trocados.

import java.util.Scanner;

public class Variavel {
    public static void main(String[] args) {
		//cria um objeto scanner
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor A: ");
        //le os dados necessários
		int A = sc.nextInt();
        System.out.println("Digite o valor B: ");
        int B = sc.nextInt();
        int C;
        C = A;
        A = B;
        B = C;

        //fazendo a conta
        
        //exibindo o resultado da soma
		System.out.println("O valor de A é: " + A);
        System.out.println("O valor de B é: " + B);

	}
}
