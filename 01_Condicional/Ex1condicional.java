package exGeneration.Condicional_01;
import java.util.*;
/*Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/

public class Ex1condicional {

	public static void main(String[] args) {
	int a,b,c;
	Scanner in = new Scanner (System.in);
	System.out.printf("==========Exerc�cio 1: Maior Vari�vel==========\n\n");
	System.out.printf("Insira o n�mero A: ");
	a = in.nextInt();
	System.out.printf("Insira o n�mero B: ");
	b = in.nextInt();
	System.out.printf("Insira o n�mero C: ");
	c = in.nextInt();

	if(a>b && a>c)
		System.out.printf("\nO maior n�mero � A!");	
	else if(b>a && b>c)
		System.out.printf("\nO maior n�mero � B!");
	else if(c>a && c>b)
		System.out.printf("\nO maior n�mero � C!");
	else
		System.out.printf("\nExistem n�meros iguais!");
	in.close();
	}

}
