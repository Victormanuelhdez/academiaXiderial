package com.tarea.semana1.ejercicio1;
import java.util.Scanner;
public class HolaMundoMejorado {
    public static void main(String[] args) {
        // TODO: Declarar variables
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuál es tu nombre? ");
        String nombre = scanner.next();
        System.out.println("¿Cuál es tu edad? ");
        int edad = scanner.nextInt();
        System.out.println("¿Cuál es tu estatura? ");
        double altura = scanner.nextDouble();
        System.out.println("¿Estás activo? true/false ");
        boolean esActivo = scanner.nextBoolean();

        // TODO: Concatenacion con +
        String mensaje1 = "Me llamo " + nombre + ", tengo " + edad
                + " anios, mido " + altura + "m y estoy "
                + (esActivo ? "activo" : "inactivo") + ".";
        System.out.println(mensaje1);

        // TODO: Usando String.format()
        String mensaje2 = String.format(
                "Me llamo %s, tengo %d anios, mido %.2f m y estoy %s.",
                nombre, edad, altura, esActivo ? "activo" : "inactivo"
        );
        System.out.println(mensaje2);
    }
}