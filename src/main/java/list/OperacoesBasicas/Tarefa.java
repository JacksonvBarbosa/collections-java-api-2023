package main.java.list.OperacoesBasicas;

public class Tarefa {
    //atributos
    private String descricao;

    //construtor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    //Getters
    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
