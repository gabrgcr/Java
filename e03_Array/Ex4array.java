package exGeneration.e03_Array;
import java.util.Scanner;

/*Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um
menu de opções:
(1) somar as duas matrizes
(2) subtrair a primeira matriz da segunda
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor
da constante deve ser lido e o resultado da adição da constante deve ser armazenado na
própria matriz.*/
public class Ex4array {

	public static void main(String[] args) {
	int[][] a = new int[2][2],b = new int[2][2],soma = new int[2][2],sub = new int[2][2];
	int cons,opt;
	Scanner in = new Scanner (System.in);
	System.out.printf("==========Exercício 4: Matriz 2x2==========\n\n");

	/*Leitura da Matriz A*/
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			System.out.printf("Insira o número para Matriz A["+i+"]["+j+"]: ");
			a[i][j] = in.nextInt();
		}
	}
	
	/*Leitura da Matriz B*/
	System.out.printf("\n");
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			System.out.printf("Insira o número para Matriz B["+i+"]["+j+"]: ");
			b[i][j] = in.nextInt();
		}
	}
	
	/*Soma e Sub*/
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			soma[i][j]=a[i][j]+b[i][j];
			sub[i][j]=b[i][j]-a[i][j];
		}
	}
	do
	{
	System.out.printf("\n\nInsira uma opção: \n");
	System.out.printf("(1) somar as duas matrizes\r\n"
			+ "(2) subtrair a primeira matriz da segunda\r\n"
			+ "(3) adicionar uma constante as duas matrizes\r\n"
			+ "(4) imprimir as matrizes\r\n"
			+ "(0) Sair\r\n");
	opt=in.nextInt();
		switch(opt) {
			case 1:
			{
				for(int i=0;i<2;i++)
				{
					for(int j=0;j<2;j++)
					{
						System.out.printf("\nSoma das Matrizes["+i+"]["+j+"]: "+soma[i][j]);
					}
				}
			}
			break;
			case 2:
			{
				for(int i=0;i<2;i++)
				{
					for(int j=0;j<2;j++)
					{
						System.out.printf("\nSoma das Matrizes["+i+"]["+j+"]: "+sub[i][j]);
					}
				}
			}
			break;
			case 3:
			{
				System.out.printf("\nInsira uma constante: ");
				cons = in.nextInt();
				for(int i=0;i<2;i++)
				{
					for(int j=0;j<2;j++)
					{
						a[i][j]=a[i][j]+cons;
						b[i][j]=b[i][j]+cons;
						System.out.printf("\nA["+i+"]["+j+"]: "+a[i][j]);
						System.out.printf("\nB["+i+"]["+j+"]: "+b[i][j]);
					}
				}
			}
			break;
			case 4:
			{
				for(int i=0;i<2;i++)
				{
					for(int j=0;j<2;j++)
					{
						System.out.printf("\nA["+i+"]["+j+"]: "+a[i][j]);
					}
				}
				System.out.printf("\n\n");
				for(int i=0;i<2;i++)
				{
					for(int j=0;j<2;j++)
					{
						System.out.printf("\nB["+i+"]["+j+"]: "+b[i][j]);
					}
				}
			}
			break;
		
	}
	}
	while(opt>0 && opt<5);
	in.close();
	}

}
