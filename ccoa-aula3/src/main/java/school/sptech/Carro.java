package school.sptech;

public class Carro {
    String fabricante;
    String modelo;
    String cor;
    String placa;
    Double velocidade = 0.0;
    Boolean quebrado = false;

    void acelerar() {
        System.out.println("VRUMMMMMMMMMM!!!");
        velocidade += 10.0;
    }

    void frear() {
        System.out.println("IIHRRRRRRRHHHH!!!");
        velocidade -= 10.0;
    }

    void colidir() {
        System.out.println("BUUUM!!!");
        quebrado = true;
    }

    void exibirInfo() {
        String texto = """
                Fabricante: %s
                Modelo: %s
                Cor: %s
                Placa: %s
                Velocidade: %.2f
                Quebrado: %s
                """.formatted(fabricante, modelo, cor, placa, velocidade, quebrado);
        System.out.println(texto);
    }
}
