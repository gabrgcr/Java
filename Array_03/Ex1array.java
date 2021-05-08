package exGeneration.Array_03;

public class Ex1array {

	public static void main(String[] args) {
	int[] A = new int[6];
	System.out.printf("==========Exercício 1: Array==========\n\n");
	A[0]=1;
	A[1]=0;
	A[2]=5;
	A[3]=-2;
	A[4]=-5;
	A[5]=7;
	int soma=(A[0]+A[1]+A[5]);
	A[4]=100;
	for(int i=0;i<=5;i++)
	{
		System.out.printf("\n"+A[0]);
		System.out.printf("Soma: "+soma);
	}
	}

}
