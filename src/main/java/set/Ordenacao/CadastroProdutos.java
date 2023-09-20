package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    //atributo
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, long codigo, double preco, int quantidade) {
        produtoSet.add(new Produto(nome, codigo, preco, quantidade));
    }


    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public Set<Produto> exibirProdutosPorQuantidade() {
        Set<Produto> produtosPorQuantidade = new TreeSet<>(new ComparatorPorQuantidade());
        produtosPorQuantidade.addAll(produtoSet);
        return produtosPorQuantidade;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        //adicionar produtos
        cadastroProdutos.adicionarProduto("cadeira", 1234L, 150.0, 4);
        cadastroProdutos.adicionarProduto("mesa", 12309L, 400.0, 3);
        cadastroProdutos.adicionarProduto("armario", 1122L, 760.0, 1);
        cadastroProdutos.adicionarProduto("pia", 1122L, 200.0, 1);

        //exibir produtos
        System.out.println("Exibindo produto aleatório");
        System.out.println(cadastroProdutos.produtoSet);
        System.out.println();

        //exibir produto por nome
        System.out.println("Exibindo produto por nome");
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println();

        //exibir produto por preço
        System.out.println("Exibindo produto por preço");
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
        System.out.println();

        //exibir produto por quantidade
        System.out.println("Exibindo produto por quantidade");
        System.out.println(cadastroProdutos.exibirProdutosPorQuantidade());
    }

}
