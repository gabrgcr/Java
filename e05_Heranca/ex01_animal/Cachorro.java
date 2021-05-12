package e05_Heranca.ex01_animal;

public class Cachorro extends Animal{

    public Cachorro(String nome, String origem, int idade, boolean bipede) {
        super(nome, origem, idade, bipede);
    }
    public void exibeDog()
    {
        System.out.print("\nDoguinho chamado "+getNome()+" tem origem em "+getOrigem()+".\nTem "+getIdade()+" anos.");
    }

    @Override
    public void fazSom(){
        System.out.print("\nEsse animal late!");
    }

    @Override
    public void movimento() {
        System.out.print("\nEsse animal corre!");
    }
}
