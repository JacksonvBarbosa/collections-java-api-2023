package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atributo
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigo) {
        convidadoSet.add(new Convidado(nome, codigo));
    }

    public void removerConvidadoPorCodigo(int codigo) {
        Convidado convidadoParaRemover = null;
        if (!convidadoSet.isEmpty()) {
            for (Convidado c : convidadoSet) {
                if (c.getCodigo() == codigo) {
                    convidadoParaRemover = c;
                    break;
                }
            }
        } else {
            System.out.println("A lista está vázio!!");
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidado() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.exibirConvidado();

        //adicionar convidados
        conjuntoConvidados.adicionarConvidado("Jackson", 1111);
        conjuntoConvidados.adicionarConvidado("Joaquim", 1111);
        conjuntoConvidados.adicionarConvidado("Joana", 1111);
        conjuntoConvidados.adicionarConvidado("Jackson", 1122);
        conjuntoConvidados.adicionarConvidado("Debora", 1234);
        conjuntoConvidados.adicionarConvidado("Rita", 2231);
        conjuntoConvidados.adicionarConvidado("Ruan", 1234);

        System.out.println("A lista contem " + conjuntoConvidados.contarConvidados() + " convidados");
        conjuntoConvidados.exibirConvidado();

        //remover convidado pro código
        conjuntoConvidados.removerConvidadoPorCodigo(1122);
        //conjuntoConvidados.removerConvidadoPorCodigo(1111);
        //conjuntoConvidados.removerConvidadoPorCodigo(4321);
        //conjuntoConvidados.removerConvidadoPorCodigo(2231);

        System.out.println();

        //contar convidados
        System.out.println("Lista após remover convidados");
        System.out.print("A lista de convidados contem " + conjuntoConvidados.contarConvidados());
        System.out.println();
        conjuntoConvidados.exibirConvidado();


    }

}
