package exGeneration.Repeticao_02;
import java.util.Scanner;
/*Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/

public class Ex6repeticao {

	public static void main(String[] args) {
	int i=0,soma=0,count=-1;
	Scanner in = new Scanner (System.in);
	System.out.printf("==========Exerc�cio 6: Numero Media==========\n\n");
	do 
	{
		System.out.printf("Insira um n�mero: ");
		i = in.nextInt();
		if(i%3==0)
		{
			soma=soma+i;
			count++;
		}
	}
	while(i!=0);
	if (count==0)
		count=1;
	System.out.printf("\nM�dia dos n�meros: "+(soma/count));
	in.close();
	}

}
