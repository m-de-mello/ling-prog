package recrutamento.teste;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private String ra;
    private List<Double> notas;
    private Double media;

    public Aluno(String nome, String ra) {
        this.nome = nome;
        this.ra = ra;
        this.notas = new ArrayList<>();
    }

    public Aluno() {

    }

    public void adicionarNota(Double nota) {
        this.notas.add(nota);
    }

    public Double calcularMedia() {
        this.media = 0.0;
        if (this.notas.isEmpty()) {
            return this.media;
        }

        for (Double nota : this.notas) {
            this.media += nota;
        }
        this.media /= this.notas.size();
        return this.media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return String.format("{Nome: %s | RA: %s | Notas: %s | Média: %.1f}", this.nome, this.ra, this.notas, this.media);
    }
}
