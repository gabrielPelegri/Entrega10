package Entrega10.src;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void Lanzar(Scanner teclado) {

        double numero = 0;
        while (true) {
            System.out.println("Introduce un número");
            try {
                numero = teclado.nextDouble();
            } catch (InputMismatchException e) {
                teclado.next();
            }
            try {
                RaizCuadrada(numero);
            } catch (RaizNegativaException e) {
                System.out.println("La raíz cuadrada no está definida para un número negativo");
            }

        }

    }

    private static void RaizCuadrada(double a) {
        if (a < 0) {
            throw new RaizNegativaException();
        } else {
            double raiz = Math.sqrt(a);
            System.out.println("El resultado es: " + raiz);
        }
    }
}
