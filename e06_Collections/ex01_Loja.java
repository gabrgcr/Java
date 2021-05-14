package e06_Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ex01_Loja {
    public static void main(String[] args)
    {
        String yes="S";
        int i=0;
        ArrayList<String> listashop = new ArrayList();
        Scanner in = new Scanner(System.in);
        while(yes.equals("S"))
        {
            System.out.print("\nInforme o produto: ");
            String produto = in.nextLine();
            listashop.add(produto);
            System.out.print("Deseja inserir outro produto?(S): ");
            yes = in.nextLine();
        }
            System.out.print("\nDeseja visualizar produtos?(S): ");
            yes = in.nextLine();

        while(yes.equals("S"))
        {
            System.out.printf("Produtos: %s",listashop);
            System.out.print("\nDeseja ver produtos novamente?(S): ");
            yes = in.nextLine();
        }

            System.out.print("\nDeseja deletar produtos?(S): ");
            yes = in.nextLine();

        while(yes.equals("S"))
        {
            int cod;
            System.out.print("Informe o código do item que deseja deletar: ");
            cod = in.nextInt();
            listashop.remove(cod);
            System.out.print("\nDeseja deletar mais produtos?(S): ");
            yes = in.nextLine();
        }

        System.out.print("\nExibição da Lista: "+listashop);

    }
}
