package school.sptech;

import java.util.Scanner;

public class ComparacaoTexto {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // String = ['M', 'u', 'r', 'i', 'l', 'l', 'o']
        System.out.println("Digite seu Nome: ");
        String nome1 = leitor.nextLine();
        String nome2 = "Murillo";

        // if (nome1 == nome2) -> Erro, tenta comparar os Endereços de Memória.

        // .equals() -> Case Sensitive.
        // .equalsIgnoreCase() -> Despreza Case Sensitive.

        if (nome1.equals(nome2)) {
            System.out.println("É Igual!");
        }
        else {
            System.out.println("É Diferente!");
        }
    }
}
