package exGeneration.Condicional_01;
import java.util.*;
/*Faça um programa que receba três inteiros e diga qual deles é o maior.*/

public class Ex1condicional {

	public static void main(String[] args) {
	int a,b,c;
	Scanner in = new Scanner (System.in);
	System.out.printf("==========Exercício 1: Maior Variável==========\n\n");
	System.out.printf("Insira o número A: ");
	a = in.nextInt();
	System.out.printf("Insira o número B: ");
	b = in.nextInt();
	System.out.printf("Insira o número C: ");
	c = in.nextInt();

	if(a>b && a>c)
		System.out.printf("\nO maior número é A!");	
	else if(b>a && b>c)
		System.out.printf("\nO maior número é B!");
	else if(c>a && c>b)
		System.out.printf("\nO maior número é C!");
	else
		System.out.printf("\nExistem números iguais!");
	in.close();
	}

}
