package main.java.set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Alunos implements Comparable<Alunos>{
    //atributos
    private String nome;
    private long matricula;
    private double nota;

    public Alunos(String nome, long matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    @Override
    public int compareTo(Alunos a) {
        return nome.compareTo(a.getNome());
    }

    public String getNome() {
        return nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public double getNota() {
        return nota;
    }

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
        return "Alunos - " +
                "\n nome = " + nome +
                " -> matricula = " + matricula +
                " -> nota = " + nota +
                "\n\n";
    }
}

class ComparatorPorNota implements Comparator<Alunos> {

    @Override
    public int compare(Alunos a1, Alunos a2) {
        return Double.compare(a1.getNota(), a2.getNota());
    }
}
