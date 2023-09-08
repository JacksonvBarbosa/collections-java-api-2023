package main.java.list.OperacoesBasicas;

public class Item {

    //atributos
    private String nomeItem;
    private double precoItem;
    private int quantidadeItem;

    public Item(String nomeItem, double precoItem, int quantidadeItem) {
        this.nomeItem = nomeItem;
        this.precoItem = precoItem;
        this.quantidadeItem = quantidadeItem;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public int getQuantidadeItem() {
        return quantidadeItem;
    }

    @Override
    public String toString() {
        return "\nItem: " + nomeItem +
                "\nValor: R$ " +  precoItem +
                "\nQuant.: " + quantidadeItem + " un\n";
    }
}
