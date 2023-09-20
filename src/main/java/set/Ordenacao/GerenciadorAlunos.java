package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    //atributo
    private Set<Alunos> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double nota) {
        alunosSet.add(new Alunos(nome, matricula, nota));
    }

    public void removerAluno(long matricula) {
        Alunos alunoParaRemover = null;
        if (!alunosSet.isEmpty()) {
            for (Alunos a : alunosSet) {
                if (a.getMatricula() == matricula) {
                    alunoParaRemover = a;
                    break;
                }
            }
            alunosSet.remove(alunoParaRemover);
        } else {
            System.out.println("O conjunto de alunos está vázio!!");
        }
        if (alunoParaRemover == null) {
            System.out.println("Matricula não encontrada!");
        }
    }

    public Set<Alunos> exibirAlunosPorNome() {
        Set<Alunos> alunosPorNome = new TreeSet<>(alunosSet);
        return alunosPorNome;
    }

    public Set<Alunos> exibirAlunosPorNota() {
        Set<Alunos> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunosSet);
        return alunosPorNota;
    }

    public void exibirAlunos() {
        System.out.println(alunosSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        //adicionar alunos
        gerenciadorAlunos.adicionarAluno("Joaozinho", 1010L, 9.0);
        gerenciadorAlunos.adicionarAluno("Mariazinha", 1019L, 8.0);
        gerenciadorAlunos.adicionarAluno("Luquinhas", 1011L, 7.5);
        gerenciadorAlunos.adicionarAluno("Aninha", 1510L, 10.0);

        //exibir alunos por nome
        System.out.println("Exibindo alunos por nome");
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());

        //exibir alunos por nota
        System.out.println("Exibindo alunos por nota");
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());

        //exibir alunos
        System.out.println("Exibindo alunos");
        gerenciadorAlunos.exibirAlunos();

    }
}
