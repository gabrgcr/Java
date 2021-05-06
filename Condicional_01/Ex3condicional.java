package exGeneration.Condicional_01;
import java.util.Scanner;
/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
-10-14 infantil
-15-17 juvenil
-18-25 adulto*/

public class Ex3condicional {

	public static void main(String[] args) {
	int idade;
	Scanner in = new Scanner (System.in);
	System.out.printf("==========Exercício 3: Idade==========\n\n");
	System.out.printf("Insira a idade: ");
	idade = in.nextInt();
	if(idade>=10 && idade<=14)
		System.out.printf("\nCategoria Infantil");
	else if(idade>=15 && idade<=17)
		System.out.printf("\nCategoria Juvenil");
	else if(idade>=18 && idade<=25)
		System.out.printf("\nCategoria Adulto");
	else
		System.out.printf("\nFora da faixa de idade");
	in.close();
	}

}
