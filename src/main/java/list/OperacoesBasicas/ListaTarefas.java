package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    //atributo
    List<Tarefa> taferaList;

    //construtor

    public ListaTarefas() {
        this.taferaList = new ArrayList<>();
    }

    //métodos
    public void adicionarTarefa(String descricao) {
        //Tarefa des = new Tarefa(descricao);
        //taferaList.add(des); //ou posso fazer desse jeito
        taferaList.add(new Tarefa(descricao)); //as duas soluções estão corretas vou usar essa nesse caso
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefaARemover = new ArrayList<>();
        if (!taferaList.isEmpty()) {
           for (Tarefa d : taferaList) {
               if (d.getDescricao().equalsIgnoreCase(descricao)) {
                   tarefaARemover.add(d);
               }
           }
           taferaList.removeAll(tarefaARemover);
        } else {
            System.out.println("Lista de tarefa vazia!");
        }
    }

    public int obterNumeroTotalTarefas() {
        return taferaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(taferaList);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        //listaTarefas.adicionarTarefa("Pedalar");
        //listaTarefas.adicionarTarefa("Jogar bola");
        //listaTarefas.adicionarTarefa("Jogar bola");
        //listaTarefas.adicionarTarefa("Nadar");
        //listaTarefas.adicionarTarefa("Correr");

        System.out.println("Numero de Tarefas");
        System.out.println(listaTarefas.obterNumeroTotalTarefas());
        System.out.println("Descrição das Tarefas");
        listaTarefas.obterDescricoesTarefas();

        listaTarefas.removerTarefa("jogar bOlA");
        System.out.println("Numero de Tarefas");
        System.out.println(listaTarefas.obterNumeroTotalTarefas());
        System.out.println("Descrição das Tarefas");
        listaTarefas.obterDescricoesTarefas();



    }
}
