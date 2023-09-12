package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    //atributo
    private Map<String, Integer> contadorPalavraMap;

    public ContagemPalavras() {
        this.contadorPalavraMap = new HashMap<>();
    }

    public void adicionarPalavra(String linguagem, Integer contagem) {
        contadorPalavraMap.put(linguagem, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!contadorPalavraMap.isEmpty()) {
            contadorPalavraMap.remove(palavra);
        } else {
            throw new RuntimeException("Lista de Palavras Vazia!");
        }
    }

    public int exibirContagemPalavras() {
        int contagemTotal = 0;
        if (!contadorPalavraMap.isEmpty()) {
            for (int contagem : contadorPalavraMap.values()) {
                contagemTotal += contagem;
            }
        } else {
            throw new RuntimeException("Lista de Palavras Vazia!");
        }
        return contagemTotal;
    }

    public String encontrarPalavrasMaisFrequente() {
        String linguagemMaisFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : contadorPalavraMap.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                linguagemMaisFrequente = entry.getKey();
            }
        }
        return linguagemMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("Playbol", 1);
        contagemPalavras.adicionarPalavra("Marionete", 4);
        contagemPalavras.adicionarPalavra("Playbol", 7);
        contagemPalavras.adicionarPalavra("Politica", 2);
        contagemPalavras.adicionarPalavra("Playbol", 5);
        contagemPalavras.adicionarPalavra("Bicicleta", 1);

        System.out.println(contagemPalavras.exibirContagemPalavras());

       String linguagemMaisFrequente = contagemPalavras.encontrarPalavrasMaisFrequente();
        System.out.println(linguagemMaisFrequente);
    }
}
