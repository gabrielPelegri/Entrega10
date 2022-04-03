package Entrega10.src;

import java.util.InputMismatchException;
import java.util.Scanner;

import Entrega10.src.excepciones.DesbordaCapacidadException;

public class Operacion {
    public static void Operacion(Scanner teclado) {
        int a = 0;
        try {
            a = teclado.nextInt();
        } catch (InputMismatchException e) {

        } catch (DesbordaCapacidadException e) {

        }
    }

    public static int Suma(int a, int b) throws DesbordaCapacidadException {
        return a + b;
    }

    public int Resta(int a, int b) throws DesbordaCapacidadException {
        return a - b;
    }

    public static int Multiplicar(int a, int b) throws DesbordaCapacidadException {
        return a * b;
    }
    public static int Dividir(int a, int b) throws DesbordaCapacidadException {
        return a/b;
    }
}
