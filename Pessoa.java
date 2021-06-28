package br.com.mercadolivre;

public class Pessoa implements Precedente<Pessoa> {

    public Pessoa (String nome, int cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    String nome;


    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    int cpf;

    public int precedeA(Pessoa pessoa1, Pessoa pessoa2) {
        //Se a pessoa1 preceder a pessoa 2, retorne 1, se nao retorne -1;
        if( pessoa1.getCpf() < pessoa2.getCpf()){
            return 1;
        }else{
            return -1;
        }
    }
}