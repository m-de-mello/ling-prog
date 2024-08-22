package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        /*
                Listas em Java são Vetores Flexíveis.

            // Equivalente ao Object[], porém Flexível:
            List listaEstranha = new ArrayList<>();

            listaEstranha.add("Murillo Moreira");
            listaEstranha.add(18);
            listaEstranha.add(true);
            listaEstranha.add(1.67);

            for (int i = 0; i < listaEstranha.size(); i++) {
                System.out.println(listaEstranha.get(i));
            }
        */
        // Polimorfismo
        List<String> filmes = new ArrayList<>();

        // add() -> Adiciona um Elemento na Lista.
        System.out.println("--- add() ---");

        filmes.add("Matrix");
        filmes.add(0, "Irmão Urso");
        System.out.println(filmes);

        // remove() -> Remove um Elemento da Lista.
        // remove(int index) -> Remove um Elemento da Lista pelo Índice.
        // remove(Object object) -> Remove um Elemento da Lista por Igualdade.

        System.out.println("\n--- remove() ---");

        // Teste 01
        filmes.remove(0);

        // Teste 02
        filmes.add("Irmão Urso");
        filmes.remove(0);
        filmes.remove("Matrix");

        // Teste 03
        filmes.add("Matrix");
        filmes.add("Matrix 2");
        filmes.add("Matrix 3");

        System.out.println(filmes);
        filmes.remove(1);
        System.out.println(filmes);

        // set() -> Substitui o Valor de um Determinado Índice.
        System.out.println("\n--- set() ---");

        filmes.set(0, "Meu Malvado Favorito");
        System.out.println(filmes);

        // get() -> Recupera o Valor da Posição Especificada.
        System.out.println("\n--- get() ---");

        String filmeDevolvido = filmes.get(0);
        System.out.println(filmeDevolvido);
        System.out.println(filmes.get(0));

        // System.out.println(filmes.get(18));

        // size() -> Número de Elementos.
        // isEmpty() -> Valida se a Lista está Vazia.
        System.out.println("\n--- size() e isEmpty()---");
        System.out.println(filmes.size());

        /*
            if (filmes.size() == 0) System.out.println("Está Vazio!");
            else System.out.println("Não Está Vazio!");
        */

        if (filmes.isEmpty()) System.out.println("Está Vázio!");
        else System.out.println("Não Está Vázio!");
    }
}
