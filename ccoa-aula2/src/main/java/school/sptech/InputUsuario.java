package school.sptech;

import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class InputUsuario {
    public static void main(String[] args) {
        // Um objeto do Tipo Scanner:
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String valorDigitado = leitor.nextLine(); // -> Realiza a Captura da Informação

        System.out.println("Agora, digite sua idade:");
        Integer idadeDigitada = leitor.nextInt();

        System.out.println("Olá, " + valorDigitado + "! Sua Idade é: " + idadeDigitada);
    }
}
