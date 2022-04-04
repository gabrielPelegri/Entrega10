package Entrega10.src;

//import java.util.InputMismatchException;
//no es utilizado
import java.util.Scanner;

import Entrega10.src.excepciones.DesbordaCapacidadException;

public class Ejercicio2 {
    public static void Lanzar(Scanner teclado) {
        long a = 0;
        long b = 0;
        while (true) {
            a = 0;
            b = 0;
            System.out.println("Introduce un número entero");
            try {
                a = Operacion.primerValor(teclado);
                break;
            } catch (DesbordaCapacidadException e) {
                
                System.out.println("El valor desborda la capacidad de la calculadora, inténtelo de nuevo");
            }
        }
        while (true) {
            System.out.println("Introduce otro número entero");
            try {
                b = Operacion.segundoValor(teclado);
                break;
            } catch (DesbordaCapacidadException e) {
                teclado.next();
                System.out.println("El valor desborda la capacidad de la calculadora, inténtelo de nuevo");
            }
        }
        while (true) {
            try {
                Operacion.Operacion(teclado, a, b);
                break;
            } catch (DesbordaCapacidadException e) {
                teclado.next();
                System.out.println("El resultado desborda la capacidad de la calculadora, inténtelo de nuevo");
            }

        }
    }
}
