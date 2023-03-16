/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_12;

import java.util.Scanner;

/**
 *
 * @author erwin
 */
public class Ejercicio_12 {

    /*Crea un procedimiento EsMultiplo que reciba los dos números pasados por 
    el usuario, validando que el primer número múltiplo del segundo e imprima 
    si el primer número es múltiplo del segundo, sino informe que no lo son.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Porfavor ingrese 2 numeros para saber si son multiplos.");

        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        System.out.println("---------------------------------------");
        int retorno = EsMultiplo(num1, num2);

    }

    public static int EsMultiplo(int num1, int num2) {

        int resto = num1 % num2;

        if (resto == 0) {
            System.out.println(num1 + " es múltiplo de " + num2);
        } else {
            System.out.println(num1 + " no es múltiplo de " + num2);
        }

        return resto;
    }
}
