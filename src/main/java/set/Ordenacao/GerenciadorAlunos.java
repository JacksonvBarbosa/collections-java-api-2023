package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    //atributos

    Set<Alunos> alunosSet;

    //contrutor
    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        alunosSet.add(new Alunos(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        Alunos alunosParaRemover = null;
        if (!alunosSet.isEmpty()) {
            for (Alunos a : alunosSet) {
                if (a.getMatricula() == matricula) {
                    alunosParaRemover = a;
                    break;
                }
            }
            alunosSet.remove(alunosParaRemover);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }
    public void exibirAlunos() {
        System.out.println(alunosSet);
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

    public Set<Alunos> exibirAlunosPorMatricula() {
        Set<Alunos> alunosPorMatricula = new TreeSet<>(new ComparatorPorMatricula());
        alunosPorMatricula.addAll(alunosSet);
        return alunosPorMatricula;
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos =  new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Jose", 1L, 7.5d);
        gerenciadorAlunos.adicionarAluno("Jackson", 4L, 9d);
        gerenciadorAlunos.adicionarAluno("Maria", 1L, 4.5d);
        gerenciadorAlunos.adicionarAluno("Manuele", 7L, 6d);

        gerenciadorAlunos.exibirAlunos();

        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());

        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());

        System.out.println(gerenciadorAlunos.exibirAlunosPorMatricula());


    }

}
