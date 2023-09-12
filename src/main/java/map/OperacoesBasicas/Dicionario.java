package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    //atributo

    private Map<String, String> dicionario;

    public Dicionario() {
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        String palavraParaRemover = null;
        if (!dicionario.isEmpty()) {
            dicionario.remove(palavra);
        } else {
            System.out.println("O dicionário está vazio");
        }
    }

    public void exibirPalavras() {
        if (!dicionario.isEmpty()){
        System.out.println(dicionario);
        } else {
            System.out.println("O dicionário está vazio");
        }
    }

    public String pesquisarPorPalavra(String palavra) {
        String definicao = dicionario.get(palavra);
        if (definicao != null) {
            return definicao;
        }
        return "Linguagem não encontrada no dicionário";
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Bola", "Objeto circular para praticar esporte");
        dicionario.adicionarPalavra("Lapis", "Objeto para escrever e desenhar");
        dicionario.adicionarPalavra("Televisão", "Aparelho que exibi imagem na tela");
        dicionario.adicionarPalavra("Avião", "Objeto com duas asas que voa");

        dicionario.exibirPalavras();

        dicionario.removerPalavra("Lapis");
        dicionario.exibirPalavras();

        String definicaoBola = dicionario.pesquisarPorPalavra("Bola");
        System.out.println(definicaoBola);

        String definicaoTv = dicionario.pesquisarPorPalavra("Televisão");
        System.out.println(definicaoTv);

    }
}
