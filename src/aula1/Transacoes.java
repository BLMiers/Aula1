package aula1;



public class Transacoes {
    public String nome;
    public int valor;

    public Transacoes(String nome,int valor) {
        this.nome=nome;
        this.valor=valor;
    }

    public Transacoes(){
        this("Vazio",0);
    }

    public String getNome(){
        return nome;
    }

    public int getValor(){
        return valor;
    }

}


