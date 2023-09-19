package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    //atributo
    Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                }
            }
        }
        tarefaSet.remove(tarefaParaRemover);
    }

    public void exibirTarefa() {
        System.out.println(tarefaSet);
    }

    public void contarTarefa() {
        System.out.println(tarefaSet.size());
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.isConcluido()) {
                    tarefasConcluidas.add(t);
                }
            }
        } else {
            System.out.println("A lista de tarefas está vázia!");
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (!t.isConcluido()) {
                    tarefasPendentes.add(t);
                }
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluido(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefasPendentes = null;
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasPendentes = t;
            }
        }

        if (tarefasPendentes != null) {
            for (Tarefa t : tarefaSet){
                t.setConcluido(false);
            }
        }
        tarefaSet.add(tarefasPendentes);
    }

    public void limparTarefas() {
        if (!tarefaSet.isEmpty()) {
            tarefaSet.clear();
        } else {
            System.out.println("A lista de tarefas já está vázia!!");
        }
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        //adicionar tarefas
        listaTarefas.adicionarTarefa("Jogar");
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Reforçar Estudo");
        listaTarefas.adicionarTarefa("Praticar");

        System.out.print("Temos ");
        listaTarefas.contarTarefa();
        System.out.println("tarefas");

        listaTarefas.exibirTarefa();

        //remover tarefa
        listaTarefas.removerTarefa("Estudar Java");
        //listaTarefas.removerTarefa("Praticar");

        System.out.print("Temos ");
        listaTarefas.contarTarefa();
        System.out.println("tarefas");

        listaTarefas.exibirTarefa();

        //marcar tarefa como concluida
        listaTarefas.marcarTarefaConcluida("Jogar");
        listaTarefas.marcarTarefaConcluida("Praticar");

        //tarefas concluidas
        System.out.println("Tarefas Concluidas");
        System.out.println(listaTarefas.obterTarefasConcluidas());

        listaTarefas.marcarTarefaPendente("Jogar");

        //Tarefas Pendentes
        System.out.println("Tarefas Pendentes");
        System.out.println(listaTarefas.obterTarefasPendentes());

        //limpanado lista de tarefas
//        System.out.println("Limpando lista de Tarefas");
//        listaTarefas.limparTarefas();
//        listaTarefas.exibirTarefa();
    }
}
