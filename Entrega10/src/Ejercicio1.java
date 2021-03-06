package Entrega10.src;

import java.util.InputMismatchException;
import java.util.Scanner;

import Entrega10.src.excepciones.RaizNegativaException;

public class Ejercicio1 {
    public static void Lanzar(Scanner teclado) {

        double numero = 0;
        do {
            System.out.println("Introduce un número o -1 para finalizar");
            try {
                numero = teclado.nextDouble();
            } catch (InputMismatchException e) {
                teclado.next();
            }
            try {
                RaizCuadrada(numero);
            } catch (RaizNegativaException e) { // control de la excepción en tiempo de ejecución
                System.out.println("La raíz cuadrada no está definida para un número negativo");
            }

        } while (numero != -1);

    }

    private static void RaizCuadrada(double a) { // creación del método que lanza la excepción
        if (a < 0) {
            throw new RaizNegativaException();
        } else {
            double raiz = Math.sqrt(a);
            System.out.println("El resultado es: " + raiz);
        }
    }
}
