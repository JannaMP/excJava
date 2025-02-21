// Nome:
//Ra:
//Objetivo: Faça um programa na Linguagem Java que leia uma temperatura
//em graus Fahrenheit e apresentá-la convertida em graus Celsius. A
//formula de conversão é C <-- (F - 32) * (5/9), sendo f a temperatura
//em Fahrenheit e C a temperatura em Celsius

import java.util.Scanner;

public class Temperatura2 {
    public static void main(String[] args) {
		//cria um objeto scanner
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os graus Fahrenheit: ");
        //le os dados necessários
		int Fahrenheit = sc.nextInt();
        //fazendo a conta
		Double Celsius = (Fahrenheit - 32.0) * (5.0/9.0);
        
        //exibindo o resultado da soma
		System.out.println("O seu Celsius é: " + Celsius);

	}
}
