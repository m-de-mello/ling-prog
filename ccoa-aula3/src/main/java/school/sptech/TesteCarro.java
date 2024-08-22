package school.sptech;

public class TesteCarro {
    public static void main(String[] args) {
        Carro marquinhos = new Carro();

        marquinhos.fabricante = "Mclaren";
        marquinhos. modelo = "F1 GTR";
        marquinhos.cor = "Laranja";
        marquinhos.placa = "123BYE4";

        marquinhos.acelerar();
        marquinhos.acelerar();


        Carro luquinhas = new Carro();

        luquinhas.fabricante = "Ferrari";
        luquinhas.modelo = "F40";
        luquinhas.cor = "Vermelho";
        luquinhas.placa = "678TRY2";

        luquinhas.acelerar();

        marquinhos.exibirInfo();
        luquinhas.exibirInfo();
    }
}
