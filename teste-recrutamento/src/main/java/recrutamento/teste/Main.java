package recrutamento.teste;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Murillo Moreira", "04241024");
        Aluno aluno2 = new Aluno("Felipe Gasparotto", "04241070");
        Aluno aluno3 = new Aluno("Felipe Ferro", "04241014");
        Aluno aluno4 = new Aluno("Gisele Rezende", "04241052");
        Aluno aluno5 = new Aluno("Murilo Martinez", "04241036");
        Aluno aluno6 = new Aluno("Ana Beatriz", "04241022");

        Turma turma1 = new Turma("1º CCOA");

        aluno1.adicionarNota(9.0);
        aluno1.adicionarNota(8.9);
        aluno1.adicionarNota(10.0);

        aluno2.adicionarNota(9.0);
        aluno2.adicionarNota(7.5);
        aluno2.adicionarNota(9.5);

        aluno3.adicionarNota(8.5);
        aluno3.adicionarNota(8.0);
        aluno3.adicionarNota(7.2);

        aluno4.adicionarNota(9.5);
        aluno4.adicionarNota(8.6);
        aluno4.adicionarNota(9.8);

        aluno5.adicionarNota(9.2);
        aluno5.adicionarNota(10.0);
        aluno5.adicionarNota(6.8);

        System.out.printf("""
                ------------------------------ Média dos Alunos ------------------------------
                Aluno 1: %.1f
                Aluno 2: %.1f
                Aluno 3: %.1f
                Aluno 4: %.1f
                Aluno 5: %.1f
                Aluno 6: %.1f
                """, aluno1.calcularMedia(), aluno2.calcularMedia(), aluno3.calcularMedia(), aluno4.calcularMedia(), aluno5.calcularMedia(), aluno6.calcularMedia()
        );

        turma1.adicionarAluno(aluno1);
        turma1.adicionarAluno(aluno2);
        turma1.adicionarAluno(aluno3);
        turma1.adicionarAluno(aluno4);
        turma1.adicionarAluno(aluno5);

        System.out.printf("""
                
                ------------------------------ Buscando Aluno Por RA ------------------------------
                1ª Consulta: %s
                2ª Consulta: %s
                """, turma1.getAlunoPorRa(aluno1.getRa()), turma1.getAlunoPorRa("00000000")
        );

        System.out.printf("""
                
                ------------------------------ Buscando Aluno Por Nome ------------------------------
                1ª Consulta: %s
                2ª Consulta: %s
                3ª Consulta: %s
                """, turma1.getAlunoPorNome("Murillo"), turma1.getAlunoPorNome("Felipe"), turma1.getAlunoPorNome("Gabriel")
        );

        System.out.printf("""
                
                ------------------------------ Buscando Aluno com Maior Média ------------------------------
                Aluno com Maior Média: %s
                """, turma1.getAlunoComMaiorMedia()
        );

        System.out.printf("""
                
                ------------------------------ Buscando Aluno com Menor Média ------------------------------
                Aluno com Maior Média: %s
                """, turma1.getAlunoComMenorMedia()
        );

        System.out.printf("""
                
                ------------------------------ Calculando Média das Médias da Turma ------------------------------
                Média Total da Turma: %.1f
                """, turma1.calcularMediaDaTurma()
        );

        System.out.printf("""
                
                ------------------------------ Buscando Média do Aluno Por RA ------------------------------
                1ª Consulta: %.1f
                2ª Consulta: %.1f
                """, turma1.getMediaPorRa(aluno1.getRa()), turma1.getMediaPorRa("00000000")
        );

        System.out.printf("""
                
                ------------------------------ Buscando Médias dos Alunos ------------------------------
                Média dos Alunos: %s
                """, turma1.getMediaTurma()
        );

        System.out.printf("""
                
                ------------------------------ Calculando Mediana das Médias da Turma ------------------------------
                Mediana das Médias da Turma: %.1f
                """, turma1.getMediana()
        );

        System.out.printf("""
                
                ------------------------------ Notas dos Alunos ------------------------------
                Aluno 1: %s
                Aluno 2: %s
                Aluno 3: %s
                Aluno 4: %s
                Aluno 5: %s
                Aluno 6: %s
                """, aluno1.getNotas(), aluno2.getNotas(), aluno3.getNotas(), aluno4.getNotas(), aluno5.getNotas(), aluno6.getNotas()
        );
    }
}