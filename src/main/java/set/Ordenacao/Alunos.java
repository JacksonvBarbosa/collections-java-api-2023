package main.java.set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Alunos implements Comparable<Alunos> {
    //atributos
    private String nome;
    private long matricula;
    private double nota;

    //construtor
    public Alunos(String nome, long matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    //metodo comparable por nome
    @Override
    public int compareTo(Alunos a) {
        return nome.compareToIgnoreCase(a.getNome());
    }

    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public double getNota() {
        return nota;
    }

    //metodos para formatação e organização
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alunos alunos)) return false;
        return getMatricula() == alunos.getMatricula();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMatricula());
    }



    @Override
    public String toString() {
        return "Alunos{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", nota=" + nota +
                '}';
    }
}

class ComparatorPorNota implements Comparator<Alunos> {

    @Override
    public int compare(Alunos n1, Alunos n2) {
        return Double.compare(n1.getNota(), n2.getNota());
    }
}

class ComparatorPorMatricula implements Comparator<Alunos> {

    @Override
    public int compare(Alunos m1, Alunos m2) {
        return Long.compare(m1.getMatricula(), m2.getMatricula());
    }
}
