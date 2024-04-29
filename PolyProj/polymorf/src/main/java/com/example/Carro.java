package com.example;
public class Carro  extends  Vehiculo{
    private final String marca;
    private final String modelo;

    public Carro(String marca, String modelo){
        super(4,5);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca(){
        return  marca;
    }

    public  String getModelo(){
        return  modelo;
    }

    @Override
    public void manejar(){
        System.out.println("Manejando un carro!");
    }
}
