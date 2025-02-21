// Nome:
//Ra:
//Objetivo: Faça um programa na Linguagem Java que receba um número e
//mostre o resto da divisão por 6.

import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
		//cria um objeto scanner
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número: ");
        //le os dados necessários
		Double numero = sc.nextDouble();
        //fazendo a conta
		Double resultado= numero % 6.0;
        
        //exibindo o resultado da soma
		System.out.println("O seu resto é: " + resultado);

	}
}
