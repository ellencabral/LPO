package br.edu.ifsul.control;

import br.edu.ifsul.model.Circulo;
import br.edu.ifsul.model.Quadrado;
import br.edu.ifsul.model.Retangulo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Circulo x = new Circulo(1,5.0); // Parametrizado
        System.out.println(x.getRaio());
        System.out.println(x);
        x.setRaio(3);
        System.out.println(x);
        System.out.println(x.calculaArea(x.getRaio()));
        System.out.println(x.calculaPerimetro(x.getRaio()));

        Quadrado y = new Quadrado(2, 2);
        y.setLado(3);
        System.out.println(y);
        System.out.println(y.calculaArea(y.getLado()));
        System.out.println(y.calculaPerimetro(y.getLado()));

        Retangulo z = new Retangulo(3, 5, 3);
        z.setBase(4);
        z.setAltura(2);
        System.out.println(z);
        System.out.println(z.calculaArea(z.getAltura(), z.getBase()));
        System.out.println(z.calculaPerimetro(z.getAltura(), z.getBase()));

        /*
            Collection List

         */
        List<Circulo> circulos = new ArrayList<>();
        circulos.add(x);
        System.out.println(circulos);

        Circulo x1 = new Circulo();
        x1.setId(2);
        x1.setRaio(3);
        circulos.add(x1);
        System.out.println(circulos);
        System.out.println("Objetos circulos são iguais: ");
        System.out.println(x.equals(x1));
        System.out.println(x.equals(x));

        System.out.println(circulos.get(0) + " " + circulos.get(1));

        for(Circulo c : circulos) {
            System.out.println(c);
        }

        for(int i = 0; i < circulos.size(); i++) {
            System.out.println(circulos.get(i));
        }

        /*
            Collection Map (Não há repetição de dados)
         */

        Map<Integer, Circulo> circulosMap = new HashMap<>();
        circulosMap.put(x.hashCode(), x);
        circulosMap.put(x1.hashCode(), x1);
        System.out.println("\n\nMap");
        System.out.println(circulosMap);

        System.out.println(circulosMap.get(x1.hashCode()));
    }
}