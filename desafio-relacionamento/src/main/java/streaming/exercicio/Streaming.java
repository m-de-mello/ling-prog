package streaming.exercicio;

import java.util.ArrayList;
import java.util.List;

public class Streaming {
    List<Filme> filmes;

    public Streaming() {
        this.filmes = new ArrayList<>();
    }

    public void adicionarFilme(Filme filme) {
        this.filmes.add(filme);
    }

    public void removerFilme(Integer id) {
        for (int i = 0; i < this.filmes.size(); i++) {
            Filme filmeDaVez = this.filmes.get(i);
            if (filmeDaVez.getId().equals(id)) this.filmes.remove(i);
        }
    }

    public Integer getQuantidadeDeFilmes() {
        return this.filmes.size();
    }

    public Double getMediaFilmes() {
        Double mediaFilmes = 0.0;
        for (Filme filme : this.filmes) {
            mediaFilmes += filme.getNotaImdb();
        }
        return mediaFilmes / this.filmes.size();
    }

    public Filme getFilmePeloNome(String nome) {
        for (Filme filme : this.filmes) {
            if (filme.getNome().equals(nome)) return filme;
        }
        return null;
    }
}
