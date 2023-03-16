/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospracticos_4;

import java.util.Scanner;

/**
 *
 * @author erwin
 */
public class EjerciciosPracticos_4 {

    /*Crea una aplicación que nos pida un número por teclado y con una función 
    se lo pasamos por parámetro para que nos indique si es o no un número primo, 
    debe devolver true si es primo, sino false.
    Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
    Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.

     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        System.out.println("Porfavor ingrese un número para saber si es primo o no.");
        int num = leer.nextInt();
        int retorno = verificador(num);
    }
   public static int verificador(int num){
      
        if (num == 2) {
            System.out.println("El número " + num + " es primo");
       }else if (num < 2 || num % 2 == 0) {
           System.out.println("El número " + num + " no es primo");
       }else{
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                     System.out.println("El número " + num + " no es primo");
                    System.exit(0);
                }
            }
            System.out.println("El número " + num + " es primo");
       }
         
      return num; 
   } 
}
