package school.sptech;

public class InterpolacaoTexto {
    public static void main(String[] args) {
        String filme = "Titanic";
        Integer anoLancamento = 1998;
        Double bilheteria = 10.125;

        // Concatenação (+):
        String frase1 = "Nome filme: " + filme + " | Ano de Lançamento: " + anoLancamento;
        System.out.println(frase1);

        // Interpolação:
        String frase2 = String.format("Nome filme: %s | Ano de Lançamento: %d | Bilheteria: %.3f", filme, anoLancamento, bilheteria);
        System.out.println(frase2);

        String frase3 = "Nome filme: %s | Ano de Lançamento: %d | Bilheteria: %.3f".formatted(filme, anoLancamento, bilheteria);
        System.out.println(frase3);

        String textoMaior = """
                    Filme: %s
                    Ano de Lançamento: %d
                    Bilheteria: %.3f
                """.formatted(filme, anoLancamento, bilheteria);

        System.out.println(textoMaior);
    }
}
