package e05_Heranca.ex01_animal;

public class Cachorro extends Animal{

    public Cachorro(String nome, String origem, int idade, boolean bipede) {
        super(nome, origem, idade, bipede);
    }
    public void exibeDog()
    {
        System.out.print("Doguinho chamado "+getNome()+" tem origem em "+getOrigem()+".\nTem "+getIdade()+" anos.");
    }
}
