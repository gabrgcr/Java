package e05_Heranca.ex01_animal;

public class InfoAnimal {
    public static void main(String[] args){
        Cachorro dog = new Cachorro("Totó","Brasil",5,true);
        dog.exibeDog();
        Cavalo horsi = new Cavalo("Pocotó","Minas",15,false,true,2);
        horsi.exibeCavalo();
    }
}
