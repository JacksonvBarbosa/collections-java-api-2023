package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    //atributo
    private Set<String> conjuntoPalavraSet;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavraSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        conjuntoPalavraSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        String palavraParaRemover = null;
        if (!conjuntoPalavraSet.isEmpty()) {
            for (String p : conjuntoPalavraSet) {
                if (p.equalsIgnoreCase(palavra)) {
                    palavraParaRemover = p;
                    break;
                }
            }
        } else {
            System.out.println("A lista está vázia!!");
        }
        conjuntoPalavraSet.remove(palavraParaRemover);
    }

    public void verificarPalavra(String palavra) {
        String palavraParaVerificar = null;
        if (!conjuntoPalavraSet.isEmpty()) {
            if (conjuntoPalavraSet.contains(palavra)) {
                System.out.println("A palavra " + palavra + " está na lista");
                } else {
                System.out.println("Palavra inexistente no conjunto!!");
            }
        } else {
            System.out.println("Conjunto está vázia!!");
        }
    }
        public void exibirPalavrasUnicas() {
            System.out.println(conjuntoPalavraSet);
        }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        //adicionar palavra
        conjuntoPalavrasUnicas.adicionarPalavra("Boné");
        conjuntoPalavrasUnicas.adicionarPalavra("Pernambuco");
        conjuntoPalavrasUnicas.adicionarPalavra("Pista");
        conjuntoPalavrasUnicas.adicionarPalavra("Ponteiro");
        conjuntoPalavrasUnicas.adicionarPalavra("Chaves");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        //remover palavra
        conjuntoPalavrasUnicas.removerPalavra("Boné");
        conjuntoPalavrasUnicas.removerPalavra("Pernambuco");
        conjuntoPalavrasUnicas.removerPalavra("Pista");
        //conjuntoPalavrasUnicas.removerPalavra("Ponteiro");
        conjuntoPalavrasUnicas.removerPalavra("Chaves");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        //verificar palavra no set
        conjuntoPalavrasUnicas.verificarPalavra("Ponteiro");



    }
}
