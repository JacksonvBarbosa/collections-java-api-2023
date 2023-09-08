package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    //atributos
    private Set<String> conjuntoPalavrasUnicas;


    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        conjuntoPalavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!conjuntoPalavrasUnicas.isEmpty()){
            if (conjuntoPalavrasUnicas.contains(palavra)) {
                conjuntoPalavrasUnicas.remove(palavra);
            } else {
                System.out.println("Palavra não existe no Conjunto listado!");
            }
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public boolean verificarPalavra(String palavra) {
        return conjuntoPalavrasUnicas.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        if (!conjuntoPalavrasUnicas.isEmpty()) {
            System.out.println(conjuntoPalavrasUnicas);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas{" +
                "conjuntoPalavrasUnicas=" + conjuntoPalavrasUnicas +
                '}';
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas1 = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas1.adicionarPalavra("Futebol");
        conjuntoPalavrasUnicas1.adicionarPalavra("Voleibol");
        conjuntoPalavrasUnicas1.adicionarPalavra("Basketbol");
        conjuntoPalavrasUnicas1.adicionarPalavra("Praia");

        conjuntoPalavrasUnicas1.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas1.removerPalavra("Praia");
        System.out.println(conjuntoPalavrasUnicas1.verificarPalavra("Basketbol"));
        conjuntoPalavrasUnicas1.exibirPalavrasUnicas();

    }
}
