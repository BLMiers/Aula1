package aula1;

import java.util.ArrayList;
import java.util.List;

public class Conta {
    private String nome;
    private int numero;
    private List<Transacoes> transacoess=new ArrayList<>();

    public Conta(String nome,int idade){
        this.nome=nome;
        this.numero=numero;
    }

    public void addTrasn(Transacoes transacoes){
        transacoess.add(transacoes);
    }

    public void listTrans(){

        for(Transacoes transacoes : transacoess){
            System.out.println(transacoes.getNome());
            System.out.println(transacoes.getValor());
        }
    }
}
