package Entrega10.src;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;

public class Ejercicio2 {
    public void Lanzar(Scanner teclado) {
System.out.println("Introduzca un número entero");
int a=0;

int eleccion = 0;
int a = 0;
int b = 0;
int c = 0;
while (true) {
    System.out.println("1: Sumar");
    System.out.println("2: Multiplicar");
    System.out.println("3: Dividir");
    System.out.println("4: Finalizar programa");
    try {
        eleccion = teclado.nextInt();
    } catch (InputMismatchException e) {
        teclado.next();
    }
    switch (eleccion) {
        case 1://sumar
        System.out.println("Introduce un número");
        try {
            a = teclado.nextDouble();
        } catch (InputMismatchException e) {
            teclado.next();
        }
        System.out.println("Introduce otro unnúmero");
            try {
                b = teclado.nextDouble();
            } catch (InputMismatchException e) {
                teclado.next();
            }
            c = Operacion.Suma(a,b);
            System.out.println("Resultado: "+ c);
            break;
        case 2: //multiplicar
        System.out.println("Introduce un número");
        try {
            a = teclado.nextDouble();
        } catch (InputMismatchException e) {
            teclado.next();
        }
        System.out.println("Introduce otro unnúmero");
            try {
                b = teclado.nextDouble();
            } catch (InputMismatchException e) {
                teclado.next();
            }
            c = Operacion.Multiplicar(a,b);
            System.out.println("Resultado: "+ c);
            break;
        case 3: //Dividir
        System.out.println("Introduce un número");
        try {
            a = teclado.nextDouble();
        } catch (InputMismatchException e) {
            teclado.next();
        }
        System.out.println("Introduce otro unnúmero");
            try {
                b = teclado.nextDouble();
            } catch (InputMismatchException e) {
                teclado.next();
            }
            c = Operacion.Dividir(a,b);
            System.out.println("Resultado: "+ c);
            break;
        case 4:
            System.exit(0);
        default:
            break;
    }
}
    }
}
