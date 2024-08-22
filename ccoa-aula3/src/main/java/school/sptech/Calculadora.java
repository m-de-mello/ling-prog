package school.sptech;

public class Calculadora {
    // Métodos e Atributos
    /*
        Uma Classe é uma Receita.
        Dada essa Receita, é possível gerar uma "Instância".
        Calculadora calc = new Calculadora(); -> Instância.

        Atributos são Campos, Propriedades.
        Integer numeroOperações = 0;

        Métodos são Funções.
        function somar(num1, num2) {
            soma = num1 + num2;
            return soma;
        }

        void somar(Integer num1, num2) {
            ...
        }
    */

    Integer quantidadeOperacoes = 0;

    // Assinatura de Métodos -> Tipo, Nome e Argumentos.

    Integer somar(Integer num1, Integer num2, Integer num3) {
        Integer resultado = num1 + num2 + num3;
        quantidadeOperacoes++;
        return resultado;
    }

    // Sobrecarga de Métodos -> Utilizar os mesmos Métodos com Parâmetros Diferentes.
    Double somar(Double num1, Double num2, Double num3) {
        Double resultado = num1 + num2 + num3;
        quantidadeOperacoes++;
        return resultado;
    }

    String saudacao() {
        return "Olá";
    }
}
