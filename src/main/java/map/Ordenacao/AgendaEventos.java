package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    //atributo
    Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
       // Evento evento = new Evento(nome, atracao);
        //eventosMap.put(data, evento);
        eventosMap.put(data, new Evento(nome, atracao)); // temos essas duas opções de adicionar dadods na agendaEventos
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventorTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventorTreeMap);
    }

    public void obterProximoEvento() {
//        Set<LocalDate> dataSet = eventosMap.keySet();
//        Collection<Evento> values = eventosMap.values();
//        eventosMap.get(); - Esse método mais os de cima não funciona para obter as datas do próximo evento

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventorTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventorTreeMap.entrySet()) {
            //A regra de negócio esta abaixo na condicional if
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + "Acontecerá na data " + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2021, Month.AUGUST, 5), "Evento 2", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2021, Month.JUNE, 20), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2020, Month.JUNE, 12), "Evento 8", "Atração 5");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.DECEMBER, 25), "Evento 11", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.OCTOBER, 14), "Evento 11", "Atração 2");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }

}
