package recrutamento.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Turma {
    private String nome;
    private List<Aluno> alunos;

    public Turma(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public Turma() {

    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void removerAluno(String ra) {
        for (int i = 0; i < this.alunos.size(); i++) {
            Aluno alunoDaVez = this.alunos.get(i);

            if (alunoDaVez.getRa().equals(ra)) {
                this.alunos.remove(i);
                break;
            }
        }
    }

    public Aluno getAlunoPorRa(String ra) {
        for (Aluno alunoDaVez : this.alunos) {
            if (alunoDaVez.getRa().equals(ra)) return alunoDaVez;
        }
        return null;
    }

    public List<Aluno> getAlunoPorNome(String nome) {
        List<Aluno> resultado = new ArrayList<>();

        for (Aluno aluno : this.alunos) {
            if (aluno.getNome().toLowerCase().contains(nome.toLowerCase())) {
                resultado.add(aluno);
            }
        }
        return resultado;
    }

    public Aluno getAlunoComMaiorMedia() {
        if (this.alunos.isEmpty()) return null;

        Aluno alunoComMaiorMedia = this.alunos.getFirst();

        for (Aluno aluno : this.alunos) {
            if (aluno.calcularMedia() > alunoComMaiorMedia.calcularMedia()) {
                alunoComMaiorMedia = aluno;
            }
        }
        return alunoComMaiorMedia;
    }

    public Aluno getAlunoComMenorMedia() {
        if (this.alunos.isEmpty()) return null;

        Aluno alunoComMenorMedia = this.alunos.getFirst();

        for (Aluno aluno : this.alunos) {
            if (aluno.calcularMedia() < alunoComMenorMedia.calcularMedia()) {
                alunoComMenorMedia = aluno;
            }
        }
        return alunoComMenorMedia;
    }

    public Double calcularMediaDaTurma() {
        Double totalMedias = 0.0;
        if (this.alunos.isEmpty()) return totalMedias;

        for (Aluno aluno : this.alunos) {
            totalMedias += aluno.calcularMedia();
        }
        return totalMedias / this.alunos.size();
    }

    public Double getMediaPorRa(String ra) {
        Aluno aluno = getAlunoPorRa(ra);

        if (aluno == null) return 0.0;

        return aluno.calcularMedia();
    }

    public List<Double> getMediaTurma() {
        List<Double> mediaAlunos = new ArrayList<>();

        for (Aluno aluno : this.alunos) {
            mediaAlunos.add(aluno.calcularMedia());
        }
        Collections.sort(mediaAlunos);

        return mediaAlunos;
    }

    public Double getMediana() {
        List<Double> mediaAlunos = getMediaTurma();
        Integer tamanhoLista = mediaAlunos.size();
        Double mediana;

        if (tamanhoLista % 2 != 0) {
            mediana = mediaAlunos.get(tamanhoLista / 2);
        } else {
            tamanhoLista = tamanhoLista / 2;
            mediana = (mediaAlunos.get(tamanhoLista) + mediaAlunos.get(tamanhoLista - 1)) / 2;
        }

        return mediana;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
}

