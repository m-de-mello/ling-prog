package school.sptech;

public class Condicionais {
    // Projetos Java têm pelo menos um Método Main (Entrypoint).

    // Geralmente utiliza-se em projetos reais apenas 1 main().

    public static void main(String[] args) {
        Integer idade = 31;
        Boolean isMaiorDeIdade = idade >= 18;

        /*
            = -> Atribuição.
            == -> Igualdade.
            != -> Diferente / Desigualdade.
            > -> Maior.
            >= -> Maior ou Igual.
            < -> Menor.
            <= -> Menor ou Igual.

            && -> AND.
            || OR.
            !isMaiorDeIdade -> NOT.

            + -> Soma.
            - -> Subtração.
            * -> Multiplicação.
            / -> Divisão.
            % -> Resto.
            ++ -> Incremento (+1).
            -- -> Decremento (-1).
        */

        // Expressão que resulte em Boolean
        // Operador Ternário (Condicional de Linha Única):
        String resultadoFormatado = isMaiorDeIdade ? "É maior de idade!" : "Não é maior de idade";

        System.out.println(resultadoFormatado);

        // (isMaiorDeIdade == true) -> Redundância.
        // (isMaiorDeIdade) -> Recomendado.
        // (!isMaiorDeIdade) -> false.

        // SWITCH CASE
        Integer opcao = 1;

        switch (opcao) {
            case 1:
                System.out.println("Opção 1");
                break;
            case 2:
                System.out.println("Opção 2");
                break;
            case 3:
                System.out.println("Opção 3");
                break;
            default:
                System.out.println("Opção Inválida!");
        }


    }
}
