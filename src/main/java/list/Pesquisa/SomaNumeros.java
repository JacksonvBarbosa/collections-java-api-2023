package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    //atributos
    private List<Integer> numeroInteiro;

    //contrutores
    public SomaNumeros() {
        this.numeroInteiro = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "SomaNumeros{" +
                "numeroInteiro=" + numeroInteiro +
                '}';
    }

    //métodos
    public void adicionarNumero(int numero) {
        this.numeroInteiro.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (Integer numero: numeroInteiro) {
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!numeroInteiro.isEmpty()) {
            for (Integer numero: numeroInteiro) {
                if (maiorNumero <= numero) {
                    maiorNumero = numero;
                }
            }
            return maiorNumero;
        }  else {
                throw new RuntimeException("A lista está vazia!");
            }
    }


    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if (!numeroInteiro.isEmpty()) {
            for (Integer numero: numeroInteiro) {
                if (menorNumero >= numero) {
                    menorNumero = numero;
                }
            }
            return menorNumero;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if (!numeroInteiro.isEmpty()) {
        System.out.println(numeroInteiro);
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(246);
        somaNumeros.adicionarNumero(8);
        somaNumeros.adicionarNumero(66);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(23);
        somaNumeros.adicionarNumero(2);


        somaNumeros.exibirNumeros();
        System.out.println(somaNumeros.calcularSoma());

        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.encontrarMenorNumero());
    }


}
