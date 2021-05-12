package e05_Heranca.ex01_animal;

public class InfoAnimal {
    public static void main(String[] args){
        Cachorro dog = new Cachorro("Totó","Brasil",5,false);
        dog.exibeDog();
        dog.fazSom();
        dog.movimento();
        Cavalo horsi = new Cavalo("Pocotó","Minas",15,false,true,2);
        horsi.exibeCavalo();
        horsi.fazSom();
        horsi.movimento();
        Preguica pregs = new Preguica("Lontra","Árvore",5, true);
        pregs.exibePreguica();
        pregs.fazSom();
        pregs.movimento();
    }
}
