package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    //atributo
    List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        if (!pessoaList.isEmpty()){
        Collections.sort(pessoaPorIdade);
        } else {
            System.out.println("A lista está vázia!!!");
        }
        return pessoaPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        if (!pessoaList.isEmpty()){
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        } else {
            System.out.println("A lista está vázia!!!");
        }
        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        //adiconar Pessoas
        ordenacaoPessoas.adicionarPessoa("Jackson", 39, 1.72);
        ordenacaoPessoas.adicionarPessoa("João", 55, 1.72);
        ordenacaoPessoas.adicionarPessoa("Debora", 38, 1.68);
        ordenacaoPessoas.adicionarPessoa("Duda", 18, 1.65);
        ordenacaoPessoas.adicionarPessoa("Maria", 13 , 1.77);

        //Ordenado por Idade
        System.out.println("Pessoa ordenadas por idade: " + ordenacaoPessoas.ordenarPorIdade());


        //Ordenado por ALtura
        System.out.println("Pessoa ordenadas por altura: " + ordenacaoPessoas.ordenarPorAltura());

    }
}
