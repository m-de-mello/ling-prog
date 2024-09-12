package school.sptech;

public class Main {
    public static void main(String[] args) {
        Contato c1 = new Contato("Murillo", "987364578");
        Contato c2 = new Contato("Manoel", "9827473829");

        Grupo g1 = new Grupo("SPTECH");

        g1.adicionar(c1);
        g1.adicionar(c2);

        System.out.println(g1.getContatos());

        System.out.println(g1.getContatos().toString());
    }
}