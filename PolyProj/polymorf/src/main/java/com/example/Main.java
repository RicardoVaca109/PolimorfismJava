package com.example;

class Main {
    public static void main(String[] args) {

        Vehiculo vehiculo1 = new Bicicleta(3);
        Vehiculo vehiculo2 = new Carro("Toyota","Corolla");

        Conductor conductor1 = new Conductor("Martha", vehiculo1);
        Conductor conductor2 = new Conductor("Leon",vehiculo2);

        conductor1.manejarConductor();
        conductor2.manejarConductor();

    }
}
