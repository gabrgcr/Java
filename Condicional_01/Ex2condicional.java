package exGeneration.Condicional_01;
import java.util.Scanner;
/*Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.*/
public class Ex2condicional {

	public static void main(String[] args) {
	int a,b,c;
	Scanner in = new Scanner (System.in);
	System.out.printf("==========Exerc�cio 2: Ordem Crescente==========\n\n");
	System.out.printf("Insira o n�mero A: ");
	a = in.nextInt();
	System.out.printf("Insira o n�mero B: ");
	b = in.nextInt();
	System.out.printf("Insira o n�mero C: ");
	c = in.nextInt();

	if(a<b)
	{
		if(a<c) 
		{
			System.out.printf("a:"+a+" ");
			if(b<c)
			{
				System.out.printf("b:"+b+" ");
				System.out.printf("c:"+c+" ");
			}
			else
			{
				System.out.printf("c:"+c+" ");
				System.out.printf("b:"+b+" ");
			}
		}
		else
		{
			System.out.printf("c:"+c+" ");
			System.out.printf("a:"+a+" ");
			System.out.printf("b:"+b+" ");
		}
	}
	else
	{
		if(b<c)
		{
			System.out.printf("b:"+b+" ");
			if(a<c)
			{
				System.out.printf("a:"+a+" ");
				System.out.printf("c:"+c+" ");
			}
			else
			{
				System.out.printf("c:"+c+" ");
				System.out.printf("a:"+a+" ");
			}
		}
		else
		{
			System.out.printf("c:"+c+" ");
			System.out.printf("b:"+b+" ");
			System.out.printf("a:"+a+" ");
		}
	}
	in.close();
	
	}
}
