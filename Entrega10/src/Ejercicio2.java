package Entrega10.src;

import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;

public class Ejercicio2 {
    public void Lanzar(Scanner teclado) {
System.out.println("Introduzca un número entero");
int a=0;

int eleccion = 0;
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
            
            break;
        case 2: //multiplicar
            break;
        case 3: //Dividir
            break;
        case 4:
            System.exit(0);
        default:
            break;
    }
}
    }
}
