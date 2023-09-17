package backUpResolvidoList;

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
        if (!numeroAscendente.isEmpty()){
        Collections.sort(numerolist);
        return numerolist;
        } else {
            throw new RuntimeException("A lista está vázia!!");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numeroDescendente = new ArrayList<>(numerolist);
        if (!numeroDescendente.isEmpty()){
        numeroDescendente.sort(Collections.reverseOrder());
        return numeroDescendente;
        } else {
            throw new RuntimeException("A lista está vázia!!");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumero ordenacaoNumero = new OrdenacaoNumero();

        //adiconar Número
        ordenacaoNumero.adicionarNumero(2);
        ordenacaoNumero.adicionarNumero(6);
        ordenacaoNumero.adicionarNumero(9);
        ordenacaoNumero.adicionarNumero(1);
        ordenacaoNumero.adicionarNumero(17);

        //Ordenar pela ordem ascendente
        System.out.println("ordem ascendente: " + ordenacaoNumero.ordenarAscendente());

        //Ordenar pela ordem descendente
        System.out.println("ordem ascendente: " + ordenacaoNumero.ordenarDescendente());
    }

}
