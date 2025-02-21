// Nome:
//Ra:
//Objetivo: Faça um programa na Linguagem Java que calcule a área da
//circunferência.

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
		//cria um objeto scanner
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o raio: ");
        //le os dados necessários
		Double Raio = sc.nextDouble();
        //fazendo a conta
		Double AreaCirculo= (3.14159 * (Raio * Raio));
        
        //exibindo o resultado da soma
		System.out.println("A sua área é: " + AreaCirculo);

	}
}
