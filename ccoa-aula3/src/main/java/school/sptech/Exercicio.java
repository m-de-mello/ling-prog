package school.sptech;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> listaNumeros = new ArrayList<>();
        Integer numeroDigitado;

        List<Integer> numerosPares = new ArrayList<>();
        List<Integer> numerosImpares = new ArrayList<>();
        Integer soma = 0;
        Integer menorNumero = Integer.MAX_VALUE;
        Integer maiorNumero = Integer.MIN_VALUE;

        do {
            System.out.println("Digite um Número para inserí-lo na Lista");
            numeroDigitado = in.nextInt();
            if (numeroDigitado != 0) {
                listaNumeros.add(numeroDigitado);

                // Exibições:
                if (numeroDigitado % 2 == 0)
                    numerosPares.add(numeroDigitado); // Verifica se é Par -> Adiciona na Lista de Pares.
                else numerosImpares.add(numeroDigitado); // Se não for Par, Adiciona na Lista de Ímpares.
                soma += numeroDigitado; // Soma Todos os Números da Lista.
                if (numeroDigitado < menorNumero)
                    menorNumero = numeroDigitado; // Compara o Número Atual com o Menor Número Armazenado.
                if (numeroDigitado > maiorNumero)
                    maiorNumero = numeroDigitado; // Compara o Número Atual com o Maior Número Armazenado.
            }
        } while (numeroDigitado != 0);

        System.out.println("Números da Lista: "+ listaNumeros);
        System.out.println("Números Pares: "+ numerosPares);
        System.out.println("Números Ímpares: "+ numerosImpares);
        System.out.println("Soma dos Números da Lista: "+ soma);
        System.out.println("Menor Número da Lista: " + menorNumero);
        System.out.println("Maior Número da Lista: " + maiorNumero);
    }
}
