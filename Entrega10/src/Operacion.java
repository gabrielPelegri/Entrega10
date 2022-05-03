package Entrega10.src;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.xml.transform.Source;

import org.omg.CORBA.ARG_OUT;

//import javax.naming.ldap.SortKey;
// no es utilizado

import Entrega10.src.excepciones.DesbordaCapacidadException;

public class Operacion {
    public static void Operacion(Scanner teclado) {
        String eleccion = "";
        long a = 0;
        long b = 0;

        while (true) {
            System.out.println("Introduce un número entero");
            try {
                a = teclado.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("No válido");
                teclado.next();

            }
        }
        if (a > 2147483647 || a < -2147483647) {
            throw new DesbordaCapacidadException("Desbordamiento inferior");
        }
        while (true) {
            System.out.println("Introdcue otro número entero");
            try {
                b = teclado.nextLong();
                break;
            } catch (InputMismatchException e) {
                System.out.println("No válido");
                teclado.next();
            }

        }
        int salir=0;
        while (salir==0) {
            System.out.println("Elije una operación: +(suma) | -(resta) | *(multiplicación) | /(división)");
            try {
                eleccion = teclado.next();

            } catch (InputMismatchException e) {
                System.out.println("Introduce una opción válida");
                teclado.next();
            }
            switch (eleccion) {
                int result=0;
                case "+":  
                 result=suma(a, b);
                System.out.println("Resultado: " + result);
                salir=1;
                break;
                case "-":  result=resta(a, b);
                System.out.println("Resultado: " + result);
                salir=2;
                break;
                case "*":  result=multiplicacion(a, b);
                System.out.println("Resultado: " + result);
                salir=2;
                break;
                case "/": result=division(a, b);
                System.out.println("Resultado: " + result);
                salir=2;
                break;
                default: break;
            }
        }

    }

    public static int suma(long a, long b) {
        long result = 0;
        result = a + b;
        if (result > 2147483647 || result < -2147483647) {
            throw new DesbordaCapacidadException("Desboramiento");

        } else {
            return (int) result;
        }
    }

    public static int resta(long a, long b) {
        long result = 0;
        result = a - b;
        if (result > 2147483647 || result < -2147483647) {
            throw new DesbordaCapacidadException("Desboramiento");

        } else {
            return (int) result;
        }
    }

    public static int multiplicacion(long a, long b) {
        long result = 0;
        result = a * b;
        if (result > 2147483647 || result < -2147483647) {
            throw new DesbordaCapacidadException("Desboramiento");

        } else {
            return (int) result;
        }
    }

    public static int division(long a, long b) {
        long result = 0;
        result = a / b;
        if (result > 2147483647 || result < -2147483647) {
            throw new DesbordaCapacidadException("Desboramiento");

        } else {
            return (int) result;
        }
    }
}