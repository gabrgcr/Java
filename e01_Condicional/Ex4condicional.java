package exGeneration.e01_Condicional;
import java.util.Scanner;
/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/

public class Ex4condicional {

	public static void main(String[] args) {
	float n;
	Scanner in = new Scanner (System.in);
	System.out.printf("==========Exercício 4: Número==========\n\n");
	System.out.printf("Insira o número: ");
	n = in.nextFloat();
	if(n%2 == 0)
		System.out.printf("Número par!\n\nRaiz quadrada: %.2f",Math.sqrt(n));
	else
		System.out.printf("Número ímpar!\n\nQuadrado: %.0f",Math.pow(n,2));
	in.close();
	}

}
