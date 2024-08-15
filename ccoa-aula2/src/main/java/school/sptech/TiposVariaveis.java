package school.sptech;

public class TiposVariaveis {
    public static void main(String[] args) {
        System.out.println("Teste!");
        // Data Types
        /*
            Classes Wrapper:
            String -> Texto (Sempre com Aspas Duplas).
            Integer -> Inteiro.
            Double -> Números com Ponto Flutuante.
            Float -> Números com Ponto Flutuante (Menor Precisão).
            Long -> Inteiro de 64.
            Boolean -> true | false.
            Character -> 'a' (Sempre com Aspas Simples).

            Tipos Primitivos:
            String -> NÃO POSSUI TIPO PRIMITIVO.
            Integer -> int.
            Double - double.
            Float -> float.
            Long -> long.
            Boolean -> boolean.
            Character -> char.

            Os Tipos Primitivos são somente uma representação de valor.

            Classes Wrapper são objetos na Linguagem Java:
                - Possuem Métodos(Função).
                - Possuem Características.
        */

        Integer numeroInteiro1 = 10;
        String string = numeroInteiro1.toString();

        int numeroInteiroPrimitivo = 10;

        String nome = "Murillo Moreira";
        Double altura = 1.67;

        // Boolean é comum iniciar com -> is | has
        Boolean isMaiorDeIdade = true;

        /*
            Java utiliza Tipagem Estática.
            JavaScript utiliza Tipagem Dinâmica.
        */

        String nomeTeste;
        nomeTeste = "Murillo Moreira";
        // var teste; -> Não funciona (Necessita de Atribuição de Valor)
        var teste = "Murillo Moreira";
        // Tipo é definido pelo Valor Inferido.
    }
}
