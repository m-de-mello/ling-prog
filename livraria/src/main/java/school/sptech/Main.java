package school.sptech;

import school.sptech.dao.LivroDao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNumero = new Scanner(System.in);
        LivroDao accessTableLivro = new LivroDao();

        Boolean run = true;

        accessTableLivro.createTableLivro();

        while (run) {
            System.out.print("""
                    +-----------------------------+
                    |        Livraria SPTECH      |
                    +-----------------------------+
                    | 1) Cadastrar Livro          |
                    | 2) Exibir Livros            |
                    | 3) Atualizar Livro          |
                    | 4) Remover Livro            |
                    | 5) Buscar por Nome          |
                    | 6) Sair                     |
                    +-----------------------------+
                    """);

            System.out.print("\nSelecione uma Opção: ");
            Integer opcaoEscolhida = leitorNumero.nextInt();

            if (opcaoEscolhida == 1) {
                System.out.print("Digite o Nome do Livro: ");
                String nome = leitor.nextLine();

                System.out.print("Digite o Preço do Livro: ");
                Double preco = leitorNumero.nextDouble();
                Livro livro = new Livro();
                livro.setNome(nome);
                livro.setPreco(preco);

                accessTableLivro.insertLivro(livro);
            }
            else if (opcaoEscolhida == 2) {
                accessTableLivro.selectLivro();
            }

            else if (opcaoEscolhida == 3) {
                System.out.println("Insira o ID do Livro que deseja Alterar:");
                Integer idLivro = leitorNumero.nextInt();
                Livro livro = new Livro();

                if (accessTableLivro.selectLivro(idLivro)) {
                    System.out.println("Preencha os Dados que Deseja Alterar:");

                    System.out.print("Nome: ");
                    String newNome = leitor.nextLine();

                    System.out.print("Preço: ");
                    Double newPreco = leitorNumero.nextDouble();

                    livro.setNome(newNome);
                    livro.setPreco(newPreco);

                    accessTableLivro.updateLivro(livro);
                }
            } else run = false;
        }
    }
}