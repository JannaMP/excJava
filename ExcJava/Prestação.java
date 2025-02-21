// Nome:
//Ra:
//Objetivo: Faça um programa na Linguagem Java para efetuar o cálculo e a
//apresentação do valor de uma prestação em atraso, utilizando a
//fórmula PRESTAÇÃO <-- VALOR + (VALOR * (TAXA/100) *TEMPO).

import java.util.Scanner;

public class Prestação {

    public static void main(String[] args) {
		//cria um objeto scanner
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor: ");
        //le os dados necessários
		Double valor = sc.nextDouble();

        System.out.println("Digite a taxa: ");
        //le os dados necessários
		Double Taxa = sc.nextDouble();

        System.out.println("Digite o tempo em atraso: ");
        //le os dados necessários
		Double Tempo = sc.nextDouble();

        //fazendo a conta
		Double Prestação = valor + (valor * (Taxa/100) *Tempo);
        
        //exibindo o resultado da soma
		System.out.println("A sua prestação é: " + Prestação);

	}
    
}
