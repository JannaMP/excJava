// Nome:
//Ra:
//Objetivo: Faça um programa na Linguagem Java que receba 2 números e
//apresente a multiplicação dos dois números

import java.util.Scanner;

//criado classe somar
public class Somar{
	public static void main(String[] args) {
		//cria um objeto scanner
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
      //le os dados necessários
		Double valor1 = sc.nextDouble();
		System.out.println("Digite o segundo número: ");
		Double valor2= sc.nextDouble();
        
		//somando valores
		Double soma = valor1 + valor2;
        //exibindo o resultado da soma
		System.out.println("O resultado da soma é: " + soma);

	}
}