package exGeneration.e04_classesPOO.ex1cliente;
/*Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
public class cliente {
	private String primeiroNome;
	private String sobrenome;
	private String telefone;
	private int idade;
	
	public cliente(String primeiroNome, String sobrenome, String telefone, int idade){
		this.primeiroNome = primeiroNome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
		this.idade = idade;
	}

	public void exibeCliente() {
		System.out.printf("Cliente: "+primeiroNome+" "+sobrenome);
		System.out.printf("\nTelefone: "+telefone);
		System.out.printf("\nIdade: "+idade);
	}
	
	
	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
