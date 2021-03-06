package e05_Heranca.ex01_animal;

public class Cavalo extends Animal{
    private boolean corrida;
    private int anos;
    public Cavalo(String nome, String origem, int idade, boolean bipede, boolean corrida, int anos) {
        super(nome, origem, idade, bipede);
        this.anos = anos;
        this.corrida = corrida;
    }

    public boolean isCorrida() {
        return corrida;
    }

    public void setCorrida(boolean corrida) {
        this.corrida = corrida;
    }

    public int getAnos() {
        return anos;
    }

    public void setAnos(int anos) {
        this.anos = anos;
    }

    public void exibeCavalo()
    {
        System.out.print("\nCavalo chamado "+getNome()+" tem origem em "+getOrigem()+".\nTem "+getIdade()+" anos.");
        if(isCorrida())
            System.out.print("\nÉ um cavalo de corrida, tendo corrido por "+getAnos()+" anos.\n");
        else
            System.out.print("\nÉ um cavalo que não é corredor.\n");
    }

    @Override
    public void fazSom(){
        System.out.print("Esse animal relincha!\n");
    }

    @Override
    public void movimento() {
        System.out.print("Esse animal corre!\n");
    }

}
