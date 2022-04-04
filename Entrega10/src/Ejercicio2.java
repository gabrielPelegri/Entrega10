package Entrega10.src;

//import java.util.InputMismatchException;
//no es utilizado
import java.util.Scanner;

import Entrega10.src.excepciones.DesbordaCapacidadException;

public class Ejercicio2 {
    public static void Lanzar(Scanner teclado) {
        while(true){
        long a = 0;
        long b = 0;
        System.out.println("Introduce un número entero");
        a = Operacion.primerValor(teclado);
        System.out.println("Introduce otro número entero");
        b = Operacion.segundoValor(teclado);
        Operacion.Operacion(teclado, a, b);

    }
}
