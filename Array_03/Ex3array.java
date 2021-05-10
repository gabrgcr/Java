package exGeneration.Array_03;
/*Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/

import java.util.Scanner;

public class Ex3array {

	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		Scanner in = new Scanner (System.in);
		System.out.printf("==========Exercício 3: Matriz 3x3==========\n\n");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.printf("Insira o número para Matriz["+i+"]["+j+"]: ");
				matriz[i][j] = in.nextInt();
			}
		}
		
		System.out.printf("\n\nNúmeros maiores que 10: ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(matriz[i][j]>10)
					System.out.printf("\nMatriz["+j+"]["+i+"]: "+matriz[i][j]);
			}
		}
	in.close();
	}

}
