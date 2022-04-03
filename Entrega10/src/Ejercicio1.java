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
            if (numero < 0) {
                throw new RaizNegativaException("La raíz cuadrada no está definida para un número negativo");
            } else {
                System.out.println("Resultado: " + numero);
            }

        }

    }
}
