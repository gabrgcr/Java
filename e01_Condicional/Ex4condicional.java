package exGeneration.e01_Condicional;
import java.util.Scanner;
/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/

public class Ex4condicional {

	public static void main(String[] args) {
	float n;
	Scanner in = new Scanner (System.in);
	System.out.printf("==========Exerc�cio 4: N�mero==========\n\n");
	System.out.printf("Insira o n�mero: ");
	n = in.nextFloat();
	if(n%2 == 0)
		System.out.printf("N�mero par!\n\nRaiz quadrada: %.2f",Math.sqrt(n));
	else
		System.out.printf("N�mero �mpar!\n\nQuadrado: %.0f",Math.pow(n,2));
	in.close();
	}

}
