package br.edu.ifsul.model;

// Membros de Classe: Atributos e Métodos (Dois tipos) Subclasses

import java.util.Objects;

public class Circulo { // Toda classe é filha direta de Object()
    private int id;
    private double raio; // Atributo: modifica o estado da variável na memória RAM
    // private: modificador de acesso, estado inacessível em outras classes, encapsula somente na mesma

    // Polimorfismo: Criação de objeto de várias formas

    // Sobrecarga: Dois tipos de construtores no mesmo código ao mesmo tempo

    // (Instâncias) Construtores: criam objetos na memória RAM e devolvem o ponteiro
    public Circulo() { } // Construtor Padrão (Vazio)

    public Circulo(int id, double raio) { // Construtor Parametrizado
        this.id = id;
        this.raio = raio;
    }

    // Métodos Acessores: para acessar a variável privada (encapsulamento: segurança, protegem as variáveis)

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Outros métodos
    
    public double calculaArea(double raio) {
        return Math.PI * (Math.pow(raio,2));
    }
    
    public double calculaPerimetro(double raio) {
        return 2 * Math.PI * raio;
    }

    // Coleções

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circulo circulo = (Circulo) o;
        return id == circulo.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                ", id=" + id +
                '}';
    }
}

