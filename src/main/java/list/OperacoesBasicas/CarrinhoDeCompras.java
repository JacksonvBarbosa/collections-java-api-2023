package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> item;

    public CarrinhoDeCompras() {this.item = new ArrayList<>();}

    public void adiconarItem(String nomeItem, double precoItem, int quantidadeItem) {
        item.add(new Item(nomeItem, precoItem, quantidadeItem));
    }

    public void removerItem(String nomeItem) {
        List<Item> itemParaRemover = new ArrayList<>();
        if (!item.isEmpty()) {
            for (Item it : item) {
                if (it.getNomeItem().equalsIgnoreCase(nomeItem)) {
                    itemParaRemover.add(it);
                }
            }
            item.removeAll(itemParaRemover);
        } else {
            System.out.println("A lista está vazía!");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!item.isEmpty()) {
            for (Item i : item) {
                valorTotal += i.getPrecoItem() * i.getQuantidadeItem();
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazía!");
        }
    }

    public void exibirItens() {
        if(!item.isEmpty()){
            System.out.println(item);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "item=" + item +
                '}';
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adiconarItem("Balão", 50.0, 2);
        carrinhoDeCompras.adiconarItem("Camiseta", 120.0, 4);
        carrinhoDeCompras.adiconarItem("Camiseta", 120.0, 4);
        carrinhoDeCompras.exibirItens();
        System.out.println("Total da Compra: " + carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.removerItem("Balão");
        carrinhoDeCompras.exibirItens();
        System.out.println("Total da Compra: " + carrinhoDeCompras.calcularValorTotal());

    }

}
