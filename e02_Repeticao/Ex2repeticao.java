package exGeneration.e02_Repeticao;
import java.util.Scanner;
/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/

public class Ex2repeticao {

	public static void main(String[] args) {
	int par=0,imp=0,num;
	Scanner in = new Scanner (System.in);
	System.out.printf("==========Exercício 2: Impar/Par==========\n\n");
	
	for(int i=1;i<=10;i++)
		{
			System.out.printf("Insira o número "+i+": ");
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
