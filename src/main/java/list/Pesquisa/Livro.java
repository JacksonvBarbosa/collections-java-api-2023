package main.java.list.Pesquisa;

public class Livro{
    //atributos
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = ano;
    }


    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro - \n"  +
                " titulo = " + titulo +
                " autor = " + autor +
                " ano = " + anoPublicacao + "\n";
    }
}
