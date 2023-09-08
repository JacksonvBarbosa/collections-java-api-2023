package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import main.java.list.Ordenacao.ComparatorPorAltura;
public class OrdenacaoPessoa {
    private List<Pessoa> pessoalist;

    public OrdenacaoPessoa() {
        this.pessoalist = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoalist.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoalist);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
        /*Aqui ele vai saber como ordenar as pessoas por idade
        * através do comparable implementado na Classe Pessoa*/
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoalist);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }
}
