package exGeneration.e02_Repeticao;
import java.util.Scanner;
/*Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/

public class Ex2repeticao {

	public static void main(String[] args) {
	int par=0,imp=0,num;
	Scanner in = new Scanner (System.in);
	System.out.printf("==========Exerc�cio 2: Impar/Par==========\n\n");
	
	for(int i=1;i<=10;i++)
		{
			System.out.printf("Insira o n�mero "+i+": ");
			num = in.nextInt();
			if(num%2==0)
				par++;
			else
				imp++;
		}
	System.out.printf("\nPares: "+par);
	System.out.printf("\nImpares: "+imp);
	in.close();
	}

}
