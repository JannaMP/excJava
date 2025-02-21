// Nome:
//Ra:
//Objetivo: Faça um programa na Linguagem Java que leia uma temperatura em
//graus Celsius e apresentá-la convertida em graus Fahrenheit. A
//fórmula de conversão é F <-- (9 * C + 160) /5, sendo f a temperatura
//em Fahrenheit e C a temperatura em Celsius.

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
		//cria um objeto scanner
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os graus Celsius: ");
        //le os dados necessários
		int Celsius = sc.nextInt();
        //fazendo a conta
		Double Fire= ((9.0 * Celsius) + 160.0) / 5.0;
        
        //exibindo o resultado da soma
		System.out.println("O seu Fahrenheit é: " + Fire);

	}
}
