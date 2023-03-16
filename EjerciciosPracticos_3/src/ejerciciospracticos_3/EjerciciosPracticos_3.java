/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospracticos_3;

import java.util.Scanner;

/**
 *
 * @author erwin
 */
public class EjerciciosPracticos_3 {

 /*Crea una aplicación que a través de una función nos convierta una cantidad
 de euros introducida por teclado a otra moneda, estas pueden ser a dólares, 
 yenes o libras. La función tendrá como parámetros, la cantidad de euros y la
 moneda a convertir que será una cadena, este no devolverá ningún valor y 
 mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        System.out.println("Cuantos euros posee en este mismisimo momento");
        int euro = leer.nextInt();
        int divisas = cambio(euro);
    }
   private static int cambio(int euro){
       int retorno = euro;
       
       double libras = euro * 0.86;
       double dolar = euro * 1.28611;
       double yenes = euro * 129.852;
       
       System.out.println("La cantidad de euros convertido a Libras es de: "+ "₤"+libras);
       System.out.println("La cantidad de euros convertido a Dolar es de: "+ "$"+dolar);
       System.out.println("La cantidad de euros convertido a Yenes es de: "+ "¥"+yenes);
       
       
       
        return retorno;
   } 
}
