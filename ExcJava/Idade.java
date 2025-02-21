// Nome:
//Ra:
//Objetivo: Faça um programa na Linguagem Java que leia a idade de uma
//pessoa expressa em ano, mês e dia e mostre-as em dias.

import java.util.Scanner;

public class Idade {
     public static void main(String[] args) {
		//cria um objeto scanner
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o dia: ");
        //le os dados necessários
		int Dia  = sc.nextInt();
        System.out.println("Digite o mes: ");
        int Mes = sc.nextInt();
        System.out.println("Digite o ano: ");
        int Ano = sc.nextInt();
        //fazendo a conta
		int totalDias = (Dia + (Mes * 30) + (Ano * 360));       
        //exibindo o resultado da soma
		System.out.println("A sua idade em dias é: " + totalDias);

	}
}
