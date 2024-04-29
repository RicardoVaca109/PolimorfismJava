package com.example;
public class Bicicleta extends  Vehiculo{
    private final int numdeGears;

    public Bicicleta(int numdeGears){
        super(2,2);
        this.numdeGears = numdeGears;
    }

    public int getNumdeGears(){
        return  numdeGears;
    }

    @Override
    public void manejar(){
        System.out.println("Cicleando!");
    }

}
