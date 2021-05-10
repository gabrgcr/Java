package exGeneration.e02_Repeticao;
import java.util.Scanner;
/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/

public class Ex5repeticao {

	public static void main(String[] args) {
	int i=0,soma=0;
	Scanner in = new Scanner (System.in);
	System.out.printf("==========Exercício 5: Numero Soma==========\n\n");
	do
	{
		System.out.printf("Insira um número: ");
		i = in.nextInt();
		soma = soma+i;
	}
	while(i!=0);
	System.out.printf("\nSoma: "+soma);
	in.close();
	
	}	
}
