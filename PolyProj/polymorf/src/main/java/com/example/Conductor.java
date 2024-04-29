package com.example;
public class Conductor {
    private final String nombre;
    private final Vehiculo vehiculo;

    public Conductor(String nombre, Vehiculo vehiculo){
        this.nombre = nombre;
        this.vehiculo = vehiculo;
    }

    public void manejarConductor(){
        System.out.println(nombre + " Esta empezando a conducir ..." );
        vehiculo.manejar();
    }
}
