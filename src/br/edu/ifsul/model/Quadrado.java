package br.edu.ifsul.model;

import java.util.Objects;

public class Quadrado {
    private int id;
    private double lado;

    // Construtores

    public Quadrado() {
    }

    public Quadrado(int id, double lado) {
        this.id = id;
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double calculaArea(double lado) {
        return lado * lado;
    }
    public double calculaPerimetro(double lado) {
        return lado * 4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quadrado quadrado = (Quadrado) o;
        return id == quadrado.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "id=" + id +
                ", lado=" + lado +
                '}';
    }
}
