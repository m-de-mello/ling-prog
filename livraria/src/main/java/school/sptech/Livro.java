package school.sptech;

public class Livro {
    private Integer idLivro;
    private String nome;
    private Double preco;

    public void Livro(Integer idLivro, String nome, Double preco) {
        this.idLivro = idLivro;
        this.nome = nome;
        this.preco = preco;
    }

    public void Livro() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(Integer idLivro) {
        this.idLivro = idLivro;
    }
}


