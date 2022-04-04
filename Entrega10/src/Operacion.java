package Entrega10.src;

import java.util.InputMismatchException;
import java.util.Scanner;

//import javax.naming.ldap.SortKey;
// no es utilizado

import Entrega10.src.excepciones.DesbordaCapacidadException;

public class Operacion {
    public static void Operacion(Scanner teclado, long a, long b) {

        String eleccion = "";
        int resultado;
        double resuldouble;
        int salir = 0;
        while (salir == 0) {

            menu();
            eleccion = teclado.next();
            switch (eleccion) {
                case "+":
                    resultado = Suma(a, b);
                    System.out.println("Solución: " + resultado);
                    salir = 1;
                    break;
                case "-":
                    resultado = Resta(a, b);
                    System.out.println("Solución: " + resultado);
                    salir = 1;
                    break;
                case "*":
                    resultado = Multiplicar(a, b);
                    System.out.println("Solución: " + resultado);
                    salir = 1;
                    break;
                case "/":
                    try {
                        resuldouble = Dividir(a, b);
                        System.out.println("Solución: " + resuldouble);
                    } catch (ArithmeticException error) {
                        System.out.println("No se puede dividir por 0");
                    }
                    salir = 1;
                    // System.out.println("Solución: " + resuldouble);
                    break;
                case "s":
                    System.out.println("Saliendo...");
                    salir = 1;
                    break;
                default:
                    break;
            }
        }
    }

    public static int Suma(long a, long b) {
        if (a + b > 2147483647 || a + b < -2147483647) {
            throw new DesbordaCapacidadException();
        } else {
            return (int) (a + b);
        }
    }

    public static int Resta(long a, long b) {
        if (a - b > 2147483647 || a - b < -2147483647) {
            throw new DesbordaCapacidadException();
        } else {
            return (int) (a - b);
        }
    }

    public static int Multiplicar(long a, long b) {
        if (a * b > 2147483647 || a * b < -2147483647) {
            throw new DesbordaCapacidadException();
        } else {
            return (int) (a * b);
        }
    }

    public static double Dividir(long a, long b) {
        // try{
        if (a / b > 2147483647 || a / b < -2147483647) {
            throw new DesbordaCapacidadException(
                    "Error por desbordamiento");
        } else {
            // double returner = (double) a/b;
            return (int) a / b;
        }
        // }
        // catch(ArithmeticException error){
        // System.out.println("No se puede dividir por 0");
        // return 0;
        // }
    }

    public static long primerValor(Scanner teclado) { // primer entero

        long a = 0;
        while (true) {
            try {
                a = teclado.nextLong();
                break;
            } catch (InputMismatchException e) {
                teclado.next();
            }
        }
        if (a > 2147483647 || a < -2147483647) {
            throw new DesbordaCapacidadException("Error por desbordamiento");
        } else {

            return a;
        }

    }

    public static long segundoValor(Scanner teclado) { // segundo entero

        long a = 0;
        while (true) {
            try {
                a = teclado.nextLong();
                break;
            } catch (InputMismatchException e) {
                teclado.next();
            }
        }
        if (a > 2147483647 || a < -2147483647) {
            throw new DesbordaCapacidadException("Error por desbordamiento");
        } else {

            return a;
        }

    }

    public static void menu() {
        System.out.println("+: suma | -: resta | *: multiplicación | /: división | s: salir");
    }
}
