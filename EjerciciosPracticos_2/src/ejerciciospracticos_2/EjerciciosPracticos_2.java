/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospracticos_2;

import java.util.Scanner;

/*Diseñe una función que pida el nombre y la edad de N personas e imprima los 
datos de las personas ingresadas por teclado e indique si son mayores o menores 
de edad. Después de cada persona, el programa debe preguntarle al usuario si 
quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
public class EjerciciosPracticos_2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        boolean bucle = true;

        do {
            for (int i = 1; i < 1000; i++) {
                System.out.println("Porfavor ingrese el nombre da la persona:");
                String nombre = leer.next();
                System.out.println("Cual es la edad de " + nombre);
                int edad = leer.nextInt();
                if (edad >= 18) {
                    System.out.println(nombre + " con edad de " + edad + " es Mayor segun el codigo civil Argentino.");

                } else {
                    System.out.println(nombre + " con edad de " + edad + " es Menor segun el codigo civil Argentino.");
                }
                break;
            }
            System.out.println("-----------------------------------------------------");
            System.out.println("Quiere seguir mostrando personas?(NO)para salir");
            String salir = leer.next();
            if (salir.equalsIgnoreCase("NO")) {
                System.out.println("Nos vemos en la proxima");
                bucle = false;
            }
        } while (bucle);

    }

}
