package Entrega10.src;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.xml.transform.Source;

import org.omg.CORBA.ARG_OUT;

//import javax.naming.ldap.SortKey;
// no es utilizado

import Entrega10.src.excepciones.DesbordaCapacidadException;

public class Operacion {
<<<<<<< HEAD
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
=======
    public static void Operacion(Scanner teclado, long a, long b) {

        String eleccion = "";
        int resultado;
        double resuldouble;
        int salir = 0;
        while (salir == 0) {
>>>>>>> 971be3200598b99c1611de2fd28ca55663762e30

            } catch (InputMismatchException e) {
                System.out.println("Introduce una opción válida");
                teclado.next();
            }
            switch (eleccion) {
<<<<<<< HEAD
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
=======
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
>>>>>>> 971be3200598b99c1611de2fd28ca55663762e30
            }
        }

    }

<<<<<<< HEAD
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

=======
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
>>>>>>> 971be3200598b99c1611de2fd28ca55663762e30
        } else {
            return (int) result;
        }
    }

<<<<<<< HEAD
    public static int multiplicacion(long a, long b) {
        long result = 0;
        result = a * b;
        if (result > 2147483647 || result < -2147483647) {
            throw new DesbordaCapacidadException("Desboramiento");

=======
    public static int Multiplicar(long a, long b) {
        if (a * b > 2147483647 || a * b < -2147483647) {
            throw new DesbordaCapacidadException();
>>>>>>> 971be3200598b99c1611de2fd28ca55663762e30
        } else {
            return (int) result;
        }
    }

<<<<<<< HEAD
    public static int division(long a, long b) {
        long result = 0;
        result = a / b;
        if (result > 2147483647 || result < -2147483647) {
            throw new DesbordaCapacidadException("Desboramiento");

        } else {
            return (int) result;
        }
=======
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
>>>>>>> 971be3200598b99c1611de2fd28ca55663762e30
    }
}