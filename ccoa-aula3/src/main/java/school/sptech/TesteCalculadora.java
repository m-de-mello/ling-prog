package school.sptech;

import org.w3c.dom.DOMImplementation;

import java.util.ArrayList;
import java.util.List;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        Integer numerito1 = 2;
        Integer numerito2 = 4;
        Integer numerito3 = 6;

        Integer batata = calc.somar(numerito1, numerito2, numerito3);


        Double banana = calc.somar(1.1, 2.2, 3.3);

        System.out.println(batata);
        System.out.println(banana);

        Calculadora dizerOla = new Calculadora();

        System.out.println(dizerOla.saudacao());
    }
}
