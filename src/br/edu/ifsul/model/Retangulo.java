package br.edu.ifsul.model;

import java.util.Objects;

public class Retangulo {
    private int id;
    private double base;
    private double altura;

    public Retangulo() {
    }

    public Retangulo(int id, double base, double altura) {
        this.id = id;
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double calculaArea(double base, double altura) {
        return base * altura;
    }
    
    public double calculaPerimetro(double base, double altura) {
        return 2 * (base + altura);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Retangulo retangulo = (Retangulo) o;
        return id == retangulo.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "id=" + id +
                ", base=" + base +
                ", altura=" + altura +
                '}';
    }
}
