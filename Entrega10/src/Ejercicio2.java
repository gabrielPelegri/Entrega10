package Entrega10.src;

//import java.util.InputMismatchException;
//no es utilizado
import java.util.Scanner;

import Entrega10.src.excepciones.DesbordaCapacidadException;

public class Ejercicio2 {
    public static void Lanzar(Scanner teclado) {
        while (true) {
            try {
                Operacion.Operacion(teclado);
            } catch (DesbordaCapacidadException e) {
                System.out.println("Desbordamiento");
            }
        }

    }
}
