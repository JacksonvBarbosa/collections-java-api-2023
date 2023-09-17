package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //atributo
    private List<Item> itemList;

    //construtor

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        //itemList.add(new Item(nome,preco, quantidade));
        //preciso antes de adicionar ao itemlist instanciar a classe Item como acima
        //criar um atributo dessa classe instanciada para passar a lista
        Item item = new Item(nome, preco, quantidade);
        itemList.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itemParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item n : itemList) {
                if (n.getNome().equalsIgnoreCase(nome)) {
                    itemParaRemover.add(n);
                    break;
                }
            }
        } else {
            System.out.println("A Lista está vazia!!!");
        }
        itemList.removeAll(itemParaRemover);
    }

    public double calcularValorTotal() {
        double valorTotalCarrinho = 0;
        if (!itemList.isEmpty()) {
            for (Item s : itemList) {
                valorTotalCarrinho += s.getPreco() * s.getQuantidade();
            }
        } else {
            System.out.println("A Lista está vazia!!!");
        }
        return valorTotalCarrinho;
    }

    public void exibirItems() {
        if (!itemList.isEmpty()){
            System.out.println(itemList);
        } else {
            System.out.println("A Lista está vazia!!!");
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        //adicionando items
        carrinhoDeCompras.adicionarItem("Bola", 10.0, 3);
        carrinhoDeCompras.adicionarItem("Ps4 Joystick", 450.0, 2);
        carrinhoDeCompras.adicionarItem("Playstation 5", 4500.0, 1);
        carrinhoDeCompras.adicionarItem("Cadeira Gamer", 870.0, 1);
        carrinhoDeCompras.adicionarItem("Head Set", 100.0, 1);
        carrinhoDeCompras.exibirItems();

        //remover Item
        carrinhoDeCompras.removerItem("Bola");
        carrinhoDeCompras.exibirItems();

        //calcular valor total do carrinho
        System.out.println("Total do carrinho: R$ " + carrinhoDeCompras.calcularValorTotal());


    }
}
