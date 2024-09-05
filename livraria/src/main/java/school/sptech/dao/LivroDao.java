package school.sptech.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import school.sptech.DatabaseConfiguration;
import school.sptech.Livro;

import java.util.List;

public class LivroDao {
    private JdbcTemplate assistente;

    public LivroDao() {
        DatabaseConfiguration conexao = new DatabaseConfiguration();
        this.assistente = conexao.getTemplate();
    }

    public void createTableLivro() {
        String sql = """ 
                CREATE TABLE IF NOT EXISTS livro (
                idLivro INT PRIMARY KEY AUTO_INCREMENT,
                nome VARCHAR(50),
                preco DOUBLE
                )""";

        assistente.execute(sql);
    }

    public void insertLivro(Livro livro) {
        String sql = "INSERT INTO livro (nome, preco) VALUES (?, ?)";
        assistente.update(sql, livro.getNome(), livro.getPreco());

        System.out.println("Livro Cadastrado com Sucesso!");
    }

    public void selectLivro() {
        String sql = "SELECT * FROM livro";
        List<Livro> livros = assistente.query(sql, new BeanPropertyRowMapper<>(Livro.class));

        for (Livro livro : livros) {
            System.out.println("ID: %d".formatted(livro.getIdLivro()));
            System.out.println("Nome: %s".formatted(livro.getNome()));
            System.out.println("Preço: %.2f".formatted(livro.getPreco()));
            System.out.println("-".repeat(50));
        }
    }

    public Boolean selectLivro(Integer idLivro) {
        String sql = "SELECT * FROM livro WHERE idLivro = %d".formatted(idLivro);
        List<Livro> livros = assistente.query(sql, new BeanPropertyRowMapper<>(Livro.class));

        if (livros.isEmpty()) {
            System.out.println("Não Existe um Livro com esse ID!");
            return false;
        }
        else return true;
    }

    public void updateLivro(Livro livro) {
        String sql = "UPDATE livro SET nome = ?, preco = ? WHERE idLivro = ?";
        assistente.update(sql, livro.getNome(), livro.getPreco(), livro.getIdLivro());

        System.out.println("Livro Alterado com Sucesso!");
    }
}
