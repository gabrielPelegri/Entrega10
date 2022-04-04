package Entrega10.src;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.naming.ldap.SortKey;

import Entrega10.src.excepciones.DesbordaCapacidadException;

public class Operacion {
    public static void Operacion(Scanner teclado) {

        int a = 0;
        int b = 0;
        while (true) {
            System.out.println("Introduzca un número entero");
            try {
                a = teclado.nextInt();
                break;
            } catch (InputMismatchException e) {
                teclado.next();
            }
        }
        if (a > 2147483647 || a < -2147483647) {
            throw new DesbordaCapacidadException(
                    "El valor introducido desborda las capacidades de esta calculadora. Inténtelo de nuevo");
        }
        while (true) {
            System.out.println("Introduzca otro número entero");
            try {
                b = teclado.nextInt();
                break;
            } catch (InputMismatchException e) {
                teclado.next();
            }
        }
        if (b > 2147483647 || b < -2147483647) {
            throw new DesbordaCapacidadException(
                    "El valor introducido desborda las capacidades de esta calculadora. Inténtelo de nuevo");
        }
        String eleccion = "";
        int resultado;
        int salir = 0;
        while (salir == 0) {

            menu();
            eleccion = teclado.nextLine();
            switch (eleccion) {
                case "+":
                    resultado = Suma(a, b);
                    System.out.println("Solución: " + resultado);
                    break;
                case "-":
                    resultado = Resta(a, b);
                    System.out.println("Solución: " + resultado);
                    break;
                case "*":
                    resultado = Multiplicar(a, b);
                    System.out.println("Solución: " + resultado);
                    break;
                case "/":
                    resultado = Dividir(a, b);
                    System.out.println("Solución: " + resultado);
                    break;
                case "d":
                    System.out.println("Saliendo...");
                    salir = 1;
                    break;
                default:
                    break;
            }
        }
    }

    public static int Suma(int a, int b) {
        if (a > 2147483647 || a < -2147483647 || b > 2147483647 || b < -2147483647) {
            throw new DesbordaCapacidadException(
                    "El valor introducido desborda las capacidades de esta calculadora. Inténtelo de nuevo");
        } else {

            return a + b;
        }
    }

    public static int Resta(int a, int b) {
        if (a > 2147483647 || a < -2147483647 || b > 2147483647 || b < -2147483647) {
            throw new DesbordaCapacidadException(
                    "El valor introducido desborda las capacidades de esta calculadora. Inténtelo de nuevo");
        } else {
            return a - b;
        }
    }

    public static int Multiplicar(int a, int b) {
        if (a > 2147483647 || a < -2147483647 || b > 2147483647 || b < -2147483647) {
            throw new DesbordaCapacidadException(
                    "El valor introducido desborda las capacidades de esta calculadora. Inténtelo de nuevo");
        } else {
            return a * b;
        }
    }

    public static int Dividir(int a, int b) {
        if (a > 2147483647 || a < -2147483647 || b > 2147483647 || b < -2147483647) {
            throw new DesbordaCapacidadException(
                    "El valor introducido desborda las capacidades de esta calculadora. Inténtelo de nuevo");
        } else {
            return a / b;
        }
    }

    public static void menu() {
        System.out.println("+: suma | -:resta | *: multimplicación | /: división | d:salir");
    }
}
