// Nome:
//Ra:
//Objetivo: Faça um programa na Linguagem Java para efetuar a leitura de um
//número inteiro e apresentar o resultado do quadrado desse número.

import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
		//cria um objeto scanner
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero: ");
        //le os dados necessários
		int numero = sc.nextInt();
        //fazendo a conta
		int Quadrado =  (numero * numero);
        
        //exibindo o resultado da soma
		System.out.println("O número ao quadrado é: " + Quadrado);

	}
}
