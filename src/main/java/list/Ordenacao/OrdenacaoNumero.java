package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumero {
    //atributo
    List<Integer> numerolist;

    public OrdenacaoNumero() {
        this.numerolist = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numerolist.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numeroAscendente = new ArrayList<>(numerolist);
        if (!numeroAscendente.isEmpty()) {
            Collections.sort(numeroAscendente);
        } else {
            System.out.println("A lista está vázia!!");
        }
        return numeroAscendente;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numeroDescendente = new ArrayList<>(numerolist);
        if (!numeroDescendente.isEmpty()) {
            numeroDescendente.sort(Collections.reverseOrder());
        } else {
            System.out.println("A lista está vázia!!");
        }
        return numeroDescendente;
    }

    public static void main(String[] args) {
        OrdenacaoNumero ordenacaoNumero = new OrdenacaoNumero();

        //adicionar número
        ordenacaoNumero.adicionarNumero(-4);
        ordenacaoNumero.adicionarNumero(6);
        ordenacaoNumero.adicionarNumero(1);
        ordenacaoNumero.adicionarNumero(0);
        ordenacaoNumero.adicionarNumero(100);

        //Ordenar em ordem ascendente
        System.out.println("Números em ordem ascendente: " + ordenacaoNumero.ordenarAscendente());

        //Ordenar em ordem descendente
        System.out.println("Números em ordem descendente: " + ordenacaoNumero.ordenarDescendente());
    }
}
