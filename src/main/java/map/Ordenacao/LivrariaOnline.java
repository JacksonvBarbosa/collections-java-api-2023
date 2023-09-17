package main.java.map.Ordenacao;

import java.util.*;

public class LivrariaOnline {
    //atributo
    Map<String, Livro> livroDisponivel;

    public LivrariaOnline() {
        this.livroDisponivel = new HashMap<>();
    }

    public void adicionarLivro(String link, Livro livro) {
        livroDisponivel.put(link, livro);
    }

    public void removerLivro(String titulo) {
        List<String> chavesRemover = new ArrayList<>();
        if (!livroDisponivel.isEmpty()) {
            for (Map.Entry<String, Livro> entry : livroDisponivel.entrySet()) {
                if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                    chavesRemover.add(entry.getKey());
                }
            }
        }
        for (String chave : chavesRemover) {
            livroDisponivel.remove(chave);
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        return new TreeMap<>(livroDisponivel);
    }
    public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
        Map<String, Livro> livroPorAutor = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> entry : livroDisponivel.entrySet()) {
            Livro livro = entry.getValue();
            if (livro.getAutor().equals(autor)) {
                livroPorAutor.put(entry.getKey(), livro);
            }
        }
        return livroPorAutor;
    }

    public List<Livro> obterLivroMaisCaro() {
        List<Livro> livrosMaisCaros = new ArrayList<>();
        double precoMaisAlto = Double.MIN_VALUE;

        if (!livroDisponivel.isEmpty()) {
            for (Livro livro : livroDisponivel.values()) {
                if (livro.getPreco() > precoMaisAlto) {
                    precoMaisAlto = livro.getPreco();
                }
            }
        } else {
            throw new NoSuchElementException("A livraria está vazia!");
        }

        for (Map.Entry<String, Livro> entry : livroDisponivel.entrySet()) {
            if (entry.getValue().getPreco() == precoMaisAlto) {
                Livro livroComPrecoMaisAlto = livroDisponivel.get(entry.getKey());
                livrosMaisCaros.add(livroComPrecoMaisAlto);
            }
        }
        return livrosMaisCaros;
    }

    public List<Livro> obterLivroMaisBarato() {
        List<Livro> livrosMaisBaratos = new ArrayList<>();
        double precoMaisBaixo = Double.MAX_VALUE;

        if (!livroDisponivel.isEmpty()) {
            for (Livro livro : livroDisponivel.values()) {
                if (livro.getPreco() < precoMaisBaixo) {
                    precoMaisBaixo = livro.getPreco();
                }
            }
        } else {
            throw new NoSuchElementException("A livraria está vazia!");
        }

        for (Map.Entry<String, Livro> entry : livroDisponivel.entrySet()) {
            if (entry.getValue().getPreco() == precoMaisBaixo) {
                Livro livroComPrecoMaisBaixo = livroDisponivel.get(entry.getKey());
                livrosMaisBaratos.add(livroComPrecoMaisBaixo);
            }
        }
        return livrosMaisBaratos;
    }

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();

        livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", new Livro("1984", "George Orwell", 50d));
        livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", new Livro("A Revolução dos Bichos", "George Orwell", 7.05d));
        livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6", new Livro("Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d));
        livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", new Livro("Malorie", "Josh Malerman", 5d));
        livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", new Livro("E Não Sobrou Nenhum", "Agatha Christie", 50d));
        livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", new Livro("Assassinato no Expresso do Oriente", "Agatha Christie", 5d));

        livrariaOnline.exibirLivrosOrdenadosPorPreco();

       // String autorPesquisar = "Josh Malerman";
       // livrariaOnline.pesquisarLivrosPorAutor(autorPesquisar);

        //System.out.println(livrariaOnline.obterLivroMaisCaro());

       // System.out.println(livrariaOnline.obterLivroMaisBarato());

        //livrariaOnline.removerLivro("1984");
        //System.out.println(livrariaOnline.livroDisponivel);
    }
}
