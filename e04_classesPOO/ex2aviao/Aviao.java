package exGeneration.e04_classesPOO.ex2aviao;
/*Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
public class Aviao {
	private String companhia;
	private String origem;
	private String destino;
	private int qtpassageiros;
	
	public Aviao(String companhia, String origem, String destino, int qtpassageiros){
		this.companhia = companhia;
		this.origem = origem;
		this.destino = destino;
		this.qtpassageiros = qtpassageiros;
	}

	public void exibeAviao() {
		System.out.printf("Companhia: "+companhia);
		System.out.printf("\nOrigem: "+origem);
		System.out.printf("\nDestino: "+destino);
		System.out.printf("\nPassageiros Confirmados: "+qtpassageiros);
	}
}
