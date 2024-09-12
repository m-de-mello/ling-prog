package school.sptech;

import java.util.ArrayList;
import java.util.List;

// Objeto Todo
public class Grupo {
    private String nome;
    private List<Contato> contatos;

    public Grupo(String nome) {
        this.nome = nome;
        this.contatos = new ArrayList<>();
    }

    public void adicionar(Contato contato) {
        this.contatos.add(contato);
    }

    public void remover(Contato contato) {
        this.contatos.remove(contato);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Contato> getContatos() {
        return contatos;
    }
}
