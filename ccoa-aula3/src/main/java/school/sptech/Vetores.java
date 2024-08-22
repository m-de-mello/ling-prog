package school.sptech;

import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        /*
            Vetores em JavaScript:
            var meuVetor = [];
            var meuVetor = [1, 2, 3, 4, 5];
            var meuVetor = ["Bom dia", 2];

            São Elásticos.

            No Java, Vetores "suportam" APENAS um TIPO e tem TAMANHO FIXO.
        */

        String[] nomes = new String[5];
        Integer[] numerosInteiros = new Integer[5];

        // PÉSSIMO!!! PÉSSIMO MESMO!!!
        // Objetct[] bizarro = new Objetct[10];

        for (int i = 0; i < nomes.length; i++) {
            // System.out.println(nomes[i]);
            // System.out.println(i);

            nomes[i] = "TESTE";
        }

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        // Exemplo de Vetor Inicializado
        // var nomesFilmes = ["Titanic", "Matrix", "Shrek 2"];
        String[] nomesFilmes = {"Titanic", "Matrix", "Lagoa Azul"}; // Tamanho Fixo [3].
        // String[] nomesFilmes = {"Titanic", "Matrix", "Lagoa Azul", null, null}; // Tamanho Fixo [5].

        Integer[] numerosInteiros2 = {1, 2, 3, 4, 5};

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a Quantidade de Números que Deseja: ");
        int quantidade = in.nextInt();

        Integer[] numerosEscolhidos = new Integer[quantidade];

        for (int i = 0; i < numerosEscolhidos.length; i++) {
            System.out.println("Digite o %d Número: ".formatted(i + 1));
            numerosEscolhidos[i] = in.nextInt();
        }

        // toString() -> Tenta Converter para Text (String/Texto)
        System.out.println(numerosEscolhidos); // Isso irá Exibir a Alocação de Memória (Endereço).

        // for each -> Enhanced For (Aprimorado).
        // Apenas para Exibição -> Não pode Alterar ou Excluir Índices.
        for (Integer inteiroDaVez : numerosEscolhidos) {
            System.out.println(inteiroDaVez);
        }

        for (int i = 0; i < numerosEscolhidos.length; i++) {
            Integer numeroDaVez = numerosEscolhidos[i];
            System.out.println(numeroDaVez);
        }
    }
}