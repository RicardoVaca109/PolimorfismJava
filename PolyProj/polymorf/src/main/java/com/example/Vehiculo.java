package com.example;

public abstract class Vehiculo {
    private final int numerodeRuedas;
    private final int numerodePersonas;

    public Vehiculo(int numerodeRuedas, int numerodePersonas){
        this.numerodeRuedas = numerodeRuedas;
        this.numerodePersonas = numerodePersonas;
    }

    public int getNumerodeRuedas(){
        return  numerodeRuedas;
    }
    public  int getNumerodePersonas(){
        return  numerodePersonas;
    }

    public abstract  void manejar();

}

