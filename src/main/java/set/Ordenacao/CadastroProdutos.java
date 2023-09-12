package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    //atributos
    private Set<Produto> produtoSet;

    //construtor


    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    //métodos
    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPornome = new TreeSet<>(produtoSet);
        /*O TreeSet serve para fazer a organização
        * de uma lista quando definimos o comparable
        * no caso do Colletions não serve por que ele
        *trabalha com list e não com Set */
        return produtosPornome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        /*Como temos a classe ComparatorPorPreco então
        * nesse caso passamos essa classe para ser organizada
        * no TreeSet*/
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public Set<Produto> exibirProdutosPorQuantidade() {
        Set<Produto> produtosPorQuantidade = new TreeSet<>(new ComparatorPorQuantidade());
        /*Como temos a classe ComparatorPorPreco então
         * nesse caso passamos essa classe para ser organizada
         * no TreeSet*/
        produtosPorQuantidade.addAll(produtoSet);
        return produtosPorQuantidade;
    }

    public Set<Produto> exibirProdutosPorCodigo() {
        Set<Produto> produtosPorCodigo = new TreeSet<>(new ComparatorPorCodigo());
        /*Como temos a classe ComparatorPorPreco então
         * nesse caso passamos essa classe para ser organizada
         * no TreeSet*/
        produtosPorCodigo.addAll(produtoSet);
        return produtosPorCodigo;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L, "Produto 5", 15d, 5);
        cadastroProdutos.adicionarProduto(2L, "Produto 0", 20d, 10);
        cadastroProdutos.adicionarProduto(1L, "Produto 3", 10d, 2);
        cadastroProdutos.adicionarProduto(9L, "Produto 9", 2d, 2);

        System.out.println(cadastroProdutos.produtoSet);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println(cadastroProdutos.exibirProdutosPorPreco());

        System.out.println(cadastroProdutos.exibirProdutosPorQuantidade());

        System.out.println(cadastroProdutos.exibirProdutosPorCodigo());


    }
}
