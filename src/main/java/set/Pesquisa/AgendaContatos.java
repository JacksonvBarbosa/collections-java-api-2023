package main.java.set.Pesquisa;

import javax.sound.midi.Soundbank;
import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributos
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contarosPorNome = new HashSet<>();
        for (Contato contato: contatoSet) {
            if (contato.getNome().startsWith(nome)){
                contarosPorNome.add(contato);
            }
        }
        return contarosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato contato: contatoSet) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNumero(novoNumero);
                contatoAtualizado = contato;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Jackson", 2222);
        agendaContatos.adicionarContato("Jackson", 2121);
        agendaContatos.adicionarContato("Jackson Ventura", 2020);
        agendaContatos.adicionarContato("Jackson Barbosa", 2424);
        agendaContatos.adicionarContato("Jose", 1122);
        agendaContatos.adicionarContato("Joao", 1133);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Jose"));

        System.out.println(agendaContatos.atualizarNumeroContato("Jackson Ventura", 505050));
        agendaContatos.exibirContatos();



    }
}
