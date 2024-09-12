package livros.exercicio;

public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("123", "Harry Potter e a Pedra Filosofal", "J. K. Rowling", 105);
        Livro l2 = new Livro("124", "Harry Potter e o Prisioneiro de Azkaban", "J. K. Rowling", 208);

        Prateleira p1 = new Prateleira(10, 105.50);

        p1.adicionarLivro(l1);
        p1.adicionarLivro(l2);

        System.out.println(p1.quantidadeLivros());

        System.out.println(p1.getLivros());

        System.out.println(p1.getLivroPorNome("Harry Potter e a Pedra Filosofal"));

    }
}
