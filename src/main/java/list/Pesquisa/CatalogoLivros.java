package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributo
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
        //Duas maneiras de adicionar instanciando
        //Livro livro = new Livro(titulo, autor, anoPublicacao);
        //livroList.add(livro);
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livroPorAutor =  new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livroPorAutor.add(l);
                }
            }
        } else {
            System.out.println("A Lista está Vázia!!!");
        }
        return livroPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
            List<Livro> livroPorano = new ArrayList<>();
            if (!livroList.isEmpty()) {
                for (Livro a : livroList) {
                    if (a.getAnoPublicacao() >= anoInicial && a.getAnoPublicacao() <= anoFinal) {
                        livroPorano.add(a);
                    }
                }
            } else {
                System.out.println("A Lista está Vázia!!!");
            }
            return livroPorano;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPortitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro t : livroList) {
                if (t.getTitulo().equalsIgnoreCase(titulo)){
                    livroPortitulo = t;
                    break;
                }
            }
        } else {
            System.out.println("A Lista está Vázia!!!");
        }
        return livroPortitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        //adicionar livro
        catalogoLivros.adicionarLivro("1984", "Georde Orwell", 1949);
        catalogoLivros.adicionarLivro("O Pequeno Principe", "Antoine de Saint-Exupery", 1943);
        catalogoLivros.adicionarLivro("A Menina que Roubava Livros", "Markus Zusak", 2005);
        catalogoLivros.adicionarLivro("A Sutil Arte de Ligar o Foda-se", "Mark Manson", 2016);
        catalogoLivros.adicionarLivro("As Cronicas de Gelo e Fogo: A Guerra dos tronos", "George R.R Martin", 1996);

        //pesquisa por autor
        System.out.println("Pequisa por autor!");
        System.out.println(catalogoLivros.pesquisarPorAutor("Georde Orwell"));
        System.out.println(catalogoLivros.pesquisarPorAutor("Mark Manson"));
        System.out.println(catalogoLivros.pesquisarPorAutor("Antoine de Saint-Exupery"));
        System.out.println(catalogoLivros.pesquisarPorAutor("Markus Zusak"));
        System.out.println(catalogoLivros.pesquisarPorAutor("George R.R Martin"));

        //pesquisa por ano
        System.out.println("Pequisa por intervalo de ano!");
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1900, 2000));

        //pesquisa por titulo
        System.out.println("Pesquisa por Titulo!");
        System.out.println(catalogoLivros.pesquisarPorTitulo("A Menina que Roubava Livros"));

    }

}
