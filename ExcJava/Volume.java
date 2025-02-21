// Nome:
//Ra:
//Objetivo: .Faça um programa na Linguagem Java para calcular e apresentar o
//valor do volume de uma lata de óleo, utilizando a fórmula:
//VOLUME <-- 3.14159 * RAIO2 * ALTURA.

import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
		//cria um objeto scanner
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o raio: ");
        //le os dados necessários
		Double Raio = sc.nextDouble();
        System.out.println("Digite a altura: ");
        Double Altura = sc.nextDouble();
        //fazendo a conta
		Double Volume= (3.14159 * (Raio * Raio)) * Altura;
        
        //exibindo o resultado da soma
		System.out.println("O seu volume é: " + Volume);

	}
}
