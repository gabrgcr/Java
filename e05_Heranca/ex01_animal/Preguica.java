package e05_Heranca.ex01_animal;

public class Preguica extends Animal{

    public Preguica(String nome, String origem, int idade, boolean bipede) {
        super(nome, origem, idade, bipede);
    }

    @Override
    public void fazSom() {
        System.out.print("\nEsse animal faz AAAAAA AAAAAAAAAA e Zzzzzzz Zzzzzzz!");
    }

    @Override
    public void movimento() {
        System.out.print("\nEsse animal sobre em árvores!");
    }

    public void exibePreguica() {
        System.out.print("\nEssa é a preguiça "+getNome()+" ela tem "+getIdade()+" anos e vem de "+getOrigem());
    }
}
