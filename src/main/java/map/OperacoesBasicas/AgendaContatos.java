package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributo
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }

    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
           numeroPorNome =  agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Jackson", 12345);
        agendaContatos.adicionarContato("Jackson", 2332);
        agendaContatos.adicionarContato("Jackson Barbosa", 1111111);
        agendaContatos.adicionarContato("Jackson Ventura", 22222233);
        agendaContatos.adicionarContato("Jackson", 444444444);
        agendaContatos.adicionarContato("Debora Santos", 1111111);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Debora Santos");
        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Jackson Ventura"));


    }
}
