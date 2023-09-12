package main.java.set.Ordenacao;

import javax.swing.*;
import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
	//atributos
	private String nome;
	private long cod;
	private double preco;
	private int quantidade;

	//construtor
	public Produto( long cod, String nome, double preco, int quantidade) {
		this.nome = nome;
		this.cod = cod;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	@Override
	public int compareTo(Produto p) {
		return nome.compareToIgnoreCase(p.getNome());
	}

	//método to String


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Produto produto)) return false;
		return getCod() == produto.getCod();
	}

	@Override
	public int hashCode() {
		return Objects.hash(getCod());
	}

	@Override
	public String toString() {
		return "Produto{" +
				"nome='" + nome + '\'' +
				", cod=" + cod +
				", preco=" + preco +
				", quantidade=" + quantidade +
				'}';
	}

	//Getters and Setters

	public String getNome() {
		return nome;
	}

	public long getCod() {
		return cod;
	}

	public double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

}

class ComparatorPorPreco implements Comparator<Produto> {

	@Override
	public int compare(Produto p1, Produto p2) {
		return Double.compare(p1.getPreco(), p2.getPreco());
	}
}

class ComparatorPorQuantidade implements Comparator<Produto> {


	@Override
	public int compare(Produto q1, Produto q2) {
		return Integer.compare(q1.getQuantidade(), q2.getQuantidade());
	}
}

class ComparatorPorCodigo implements Comparator<Produto> {

	@Override
	public int compare(Produto c1, Produto c2) {
		return Long.compare(c1.getCod(), c2.getCod());
	}
}
