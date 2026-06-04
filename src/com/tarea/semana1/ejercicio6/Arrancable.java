package com.tarea.semana1.ejercicio6;

import java.util.ArrayList;

interface Arrancable {
    void arrancar();
    void detener();
}

abstract class Vehiculo implements Arrancable {
    protected String marca;
    protected String modelo;
    protected int anio;

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public abstract String tipoVehiculo();

    public String info() {
        return tipoVehiculo() + ": " + marca + " "
                + modelo + " (" + anio + ")";
    }
}

class Auto extends Vehiculo {
    private int numPuertas;

    public Auto(String marca, String modelo, int anio, int numPuertas) {
        super(marca, modelo, anio);
        this.numPuertas = numPuertas;
    }

    @Override
    public String tipoVehiculo() { return "Auto"; }

    @Override
    public void arrancar() {
        System.out.println("  El auto " + marca + " "
                + modelo + " arranca el motor...");
    }

    @Override
    public void detener() {
        System.out.println("  El auto " + marca + " "
                + modelo + " se detiene.");
    }

    @Override
    public String toString() {
        return info() + " - " + numPuertas + " puertas";
    }
}

class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, int anio, int cilindrada) {
        super(marca, modelo, anio);
        this.cilindrada = cilindrada;
    }

    @Override
    public String tipoVehiculo() { return "Moto"; }

    @Override
    public void arrancar() {
        System.out.println("  La moto " + marca + " " + modelo
                + " ruge con " + cilindrada + "cc...");
    }

    @Override
    public void detener() {
        System.out.println("  La moto " + marca + " "
                + modelo + " se detiene.");
    }

    @Override
    public String toString() {
        return info() + " - " + cilindrada + "cc";
    }
}

class VehiculoElectrico extends Auto {
    private int autonomiaKm;

    public VehiculoElectrico(String marca, String modelo,
                             int anio, int numPuertas,
                             int autonomiaKm) {
        super(marca, modelo, anio, numPuertas);
        this.autonomiaKm = autonomiaKm;
    }

    @Override
    public String tipoVehiculo() { return "Vehiculo Electrico"; }

    @Override
    public void arrancar() {
        System.out.println("  El vehiculo electrico " + marca
                + " " + modelo + " arranca silenciosamente... "
                + "(autonomia: " + autonomiaKm + " km)");
    }

    @Override
    public String toString() {
        return info() + " - autonomia " + autonomiaKm + " km";
    }
}

