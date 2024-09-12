package livros.exercicio;

import java.util.ArrayList;
import java.util.List;

public class Prateleira {
    private List<Livro> livros;
    private Integer limite;
    private Double peso;

    public Prateleira(Integer limite, Double peso) {
        this.limite = limite;
        this.peso = peso;
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        if (livros.size() < limite) livros.add(livro);
        else System.out.println("A Prateleira não possui mais Espaço para Adicionar Livros.");
    }

    public void removerLivro(String codigo) {
        for (int i = 0; i < this.livros.size(); i++) {
            Livro livroDaVez = this.livros.get(i);

            if (livroDaVez.getCodigo().equalsIgnoreCase(codigo)) this.livros.remove(i);
        }
    }

    public Integer quantidadeLivros() {
        return livros.size();
    }

    Double getPesoTotal() {
        Double pesoTotal = peso;
        for (Livro livro : livros) {
            pesoTotal += livro.calcularPeso();
        }
        return pesoTotal;
    }

    Livro getLivroPorNome(String nome) {
        for (Livro livro : this.livros) {
            if (livro.getNome().equals(nome)) return livro;
        }
        return null;
    }

    public List<Livro> getLivros() {
        return livros;
    }
}
