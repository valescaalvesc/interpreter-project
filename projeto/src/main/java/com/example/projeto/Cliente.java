package com.example.projeto;

public class Cliente {

    private double juros1;
    private double juros2;

    public double getJuros1() {
        return juros1;
    }

    public void setJuros1(double juros1) {
        this.juros1 = juros1;
    }

    public double getJuros2() {
        return juros2;
    }

    public void setJuros2(double juros2) {
        this.juros2 = juros2;
    }

    public double calcularJuros() {
        return Banco.calcularJuros(this.juros1, this.juros2);
    }
}
