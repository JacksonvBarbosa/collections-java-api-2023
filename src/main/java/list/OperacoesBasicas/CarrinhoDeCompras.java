package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //atributo
    List<Item> itemList;

    //construtor

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        //preciso antes de adicionar ao itemlist instanciar a classe Item como acima
        //criar um atributo dessa classe instanciada para passar a lista
        itemList.add(item);
    }
}
