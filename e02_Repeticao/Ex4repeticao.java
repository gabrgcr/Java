package exGeneration.e02_Repeticao;
import java.util.Scanner;
/*Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
-o número de pessoas calmas;
-o número de mulheres nervosas;
-o número de homens agressivos;
-o número de outros calmos;
-o número de pessoas nervosas com mais de 40 anos;
-o número de pessoas calmas com menos de 18 anos.*/

public class Ex4repeticao {

	public static void main(String[] args) {
	int i=1,idade,sex,p,calm=0,mn=0,ha=0,oc=0,nv=0,jc=0;
	Scanner in = new Scanner (System.in);
	System.out.printf("==========Exercício 4: Pesquisa==========\n\n");
	while(i<=150)
	{
		System.out.printf("Insira a idade: ");
		idade = in.nextInt();
		System.out.printf("Sexo: (1)Feminino\n      (2)Masculino\n      (3)Outros\n");
		sex = in.nextInt();
		System.out.printf("Personalidade: (1)Calma\n               (2)Nervosa\n               (3)Agressiva\n");
		p = in.nextInt();
		if(p==1)
			calm++;
		if(sex==1 && p==2)
			mn++;
		if(sex==2 && p==3)
			ha++;
		if(sex==3 && p==1)
			oc++;
		if(idade>40 && p==2)
			nv++;
		if(idade<18 && p==1)
			jc++;
	i++;
	}
		System.out.printf("\nNumero de pessoas calmas: "+calm);
		System.out.printf("\nNumero de mulheres nervosas: "+mn);
		System.out.printf("\nNumero de homens agressivos: "+ha);
		System.out.printf("\nNumero de outros calmos: "+oc);
		System.out.printf("\nNumero de pessoas com mais de 40 anos nervosas: "+nv);
		System.out.printf("\nNumero de pessoas com menos de 18 anos calmas: "+jc);
		in.close();
	}

}
