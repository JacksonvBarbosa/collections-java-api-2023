package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    //atributo
    List<Integer> numerolist;

    public SomaNumeros() {
        this.numerolist = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numerolist.add(numero);
    }

    public Integer calcularSoma() {
        int somaTotal = 0;
        if (!numerolist.isEmpty()) {
            for (Integer s : numerolist) {
                somaTotal += s;
            }
        } else {
            System.out.println("A Lista ta Vázia!!!");
        }
        return somaTotal;
    }

    public Integer encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!numerolist.isEmpty()) {
            for (Integer numero : numerolist) {
                if (maiorNumero <= numero) {
                    maiorNumero = numero;
                }
            }
        } else {
            System.out.println("A Lista ta Vázia!!!");
        }
        return maiorNumero;
    }

    public Integer encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if (!numerolist.isEmpty()) {
            for(Integer numero : numerolist) {
                if (menorNumero >= numero) {
                    menorNumero = numero;
                }
            }
        } else {
            System.out.println("A Lista ta Vázia!!!");
        }
        return menorNumero;
    }

    public void exibirNumeros() {
        if (!numerolist.isEmpty()){
        System.out.println(numerolist);
        } else {
            System.out.println("A lista está Vázia!!!");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        //adiconar numeros
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(45);
        somaNumeros.adicionarNumero(56);
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(89);
        somaNumeros.adicionarNumero(-12);

        somaNumeros.exibirNumeros();

        //Calcular soma
        System.out.println("A soma dos numeros inseridos é: " + somaNumeros.calcularSoma());

        //Maior e Menor Numero
        System.out.println("O maior número da lista é: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("O menor número da lista é: " + somaNumeros.encontrarMenorNumero());

    }

}
