package exGeneration.e02_Repeticao;
import java.util.Scanner;
/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/

public class Ex3repeticao {

	public static void main(String[] args) {
	int idade=0,maior=0,menor=0;
	Scanner in = new Scanner (System.in);
	System.out.printf("==========Exercício 3: Idades==========\n\n");
	while(idade!=-99)
	{
		System.out.printf("Insira a idade da pessoa: ");
		idade = in.nextInt();
		if(idade<21 && idade!=-99)
			menor++;
		if(idade>50)
			maior++;
	}
	System.out.printf("\nTotal de pessoas com menos de 21 anos: "+menor);
	System.out.printf("\nTotal de pessoas com mais de 50 anos: "+maior);
	in.close();
	}

}
