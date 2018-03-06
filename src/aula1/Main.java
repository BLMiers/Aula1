package aula1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Escolha uma das seguintes opcoes.\n");
        System.out.println("Criar conta.(1)\nInserir Transacao.(2)\nListar Transacoes de uma conta.(3)\nSaldo Total.(4) ");
        Scanner in =new Scanner(System.in);
        int ops=Integer.parseInt(in.nextLine());

        switch(ops){

            case 1: System.out.println("De um nome para sua conta e sua idade.");
                    String nome=in.nextLine();
                    int idade=Integer.parseInt(in.nextLine());
                    Conta a=new Conta(nome,idade);
                    break;
            case 2:



        }


    }
}
