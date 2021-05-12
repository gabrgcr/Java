package e05_Heranca.ex01_animal;

public class Animal {
	private String nome;
	private String origem;
	private int idade;
	private boolean bipede;

	public Animal(String nome, String origem, int idade, boolean bipede) {
		super();
		this.nome = nome;
		this.origem = origem;
		this.idade = idade;
		this.bipede = bipede;
	}

	public boolean isBipede() {
		return bipede;
	}

	public void setBipede(boolean bipede) {
		this.bipede = bipede;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
