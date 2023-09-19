package main.java.set.Pesquisa;

import backUpResolvidoList.Pessoa;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;

public class AgendaContatos {
    //atributo
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numeroelefone) {
        contatoSet.add(new Contato(nome, numeroelefone));
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> pesquisaPeloNome = new HashSet<>();
        if (!contatoSet.isEmpty()) {
            for (Contato n : contatoSet) {
                if (n.getNome().startsWith(nome)) {
                    pesquisaPeloNome.add(n);
                }
            }
            return pesquisaPeloNome;
        } else {
            throw new RuntimeException("A lista está vázia");
        }
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato numeroParaAtualizar = null;
        if (!contatoSet.isEmpty()) {
            for (Contato c : contatoSet) {
                if (c.getNome().equalsIgnoreCase(nome)) {
                    c.setNumeroTelefone(novoNumero);
                    numeroParaAtualizar = c;
                    break;
                }
            }
        } else {
            System.out.println("A lista está vázia!!");
        }
        return numeroParaAtualizar;
    }

    public int quantidadeDeContatos() {
        return contatoSet.size();
    }
    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        System.out.println("Sua Agenda tem " + agendaContatos.quantidadeDeContatos() + " contato(s)\n");
        agendaContatos.exibirContatos();

        //adicionar contatos
        agendaContatos.adicionarContato("Jose", 1111);
        agendaContatos.adicionarContato("Patricia",1234);
        agendaContatos.adicionarContato("Mauro", 2222);
        agendaContatos.adicionarContato("Ailton", 4321);

        System.out.println("Sua Agenda tem " + agendaContatos.quantidadeDeContatos() + " contato(s)\n");
        agendaContatos.exibirContatos();
        //pesquisar por nome
        System.out.println();
        System.out.println(agendaContatos.pesquisarPorNome("Jose"));

        //atualizar numero de telefone
        agendaContatos.atualizarNumeroContato("Patricia", 54321);
        agendaContatos.atualizarNumeroContato("Mauro", 112233);
        agendaContatos.atualizarNumeroContato("ailton", 5897412);


        System.out.println("Sua Agenda tem " + agendaContatos.quantidadeDeContatos() + " contato(s)\n");
        agendaContatos.exibirContatos();
    }

}
