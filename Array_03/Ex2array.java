package exGeneration.Array_03;
/*Fa�a um programa que receba 6 n�meros inteiros e mostre:
� Os n�meros pares digitados;
� A soma dos n�meros pares digitados;
� Os n�meros �mpares digitados;
� A quantidade de n�meros �mpares digitados.*/

import java.util.Scanner;
public class Ex2array {

	public static void main(String[] args) {
	int[] A = new int[6];
	int somapar=0,qtimpar=0;
	Scanner in = new Scanner (System.in);
	System.out.printf("==========Exerc�cio 2: Array==========\n\n");
	for(int i=0;i<6;i++)
	{
		System.out.printf("Insira o n�mero "+(i+1)+": ");
		A[i] = in.nextInt();
		if((A[i]%2)==0)
			somapar=somapar+A[i];
		else
			qtimpar++;
	}
	
	System.out.printf("\nPares: ");
	for(int i=0;i<6;i++)
		if((A[i]%2)==0)
			System.out.printf(A[i]+" ");
	
	System.out.printf("\nImpares: ");
	for(int i=0;i<6;i++)
		if((A[i]%2)==1)
			System.out.printf(A[i]+" ");
	
	System.out.printf("\n\nSoma de Pares: "+somapar);
	System.out.printf("\nQuantidade de Impares: "+qtimpar);
	in.close();
	}

}
