/*
leer 10 numeros enteros, guardarlos en un arreglo.
debemos mostrarlos en el siguiente orden
primero, ultimo, segundo, penultimo,etc
 */
package com.mycompany.numerosintercalado;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arreglo[] = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". Digite un número");
            arreglo[i] = sc.nextInt();
        }

        int primero = 0, ultimo = 9;

        for (int i = 0; i < 5; i++) {
            System.out.print("|"+arreglo[primero]+"|");
            System.out.print("|"+arreglo[ultimo]+"|");
            primero += 1;
            ultimo -= 1;
        }
    }
}
