/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosPracticos_1;

import java.util.Scanner;

/*Crea una aplicación que le pida dos números al usuario y este pueda elegir 
entre sumar, restar, multiplicar y dividir. La aplicación debe tener una función
para cada operación matemática y deben devolver sus resultados para imprimirlos 
en el main. 

 */
public class EjerciciosPracticos_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Porfavor ingrese 2 numeros.");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        System.out.println("-----------------------------------------");
        
        boolean bucle = true;
      
        
        do{
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
         int opc = leer.nextInt();
        
                switch (opc) {
            case 1:
                int resultadoSuma = suma(num1,num2);
                System.out.println("La suma de:" + num1 + "+" + num2 + "=" + resultadoSuma);
                System.out.println("-----------------------------------------");
                break;
            case 2:
                int resultadoResta = resta(num1,num2);
                System.out.println("La resta de:" + num1 + "-" + num2 + "=" + resultadoResta);
                System.out.println("-----------------------------------------");
                break;
            case 3:
                int resultadoMulti = multi(num1,num2);
                System.out.println("La multiplicacion de:" + num1 + "x" + num2 + "=" + resultadoMulti);
                System.out.println("-----------------------------------------");
                break;
            case 4:
                int resultadoDiv = div(num1,num2);
                System.out.println("La division de:" + num1 + "/" + num2 + "=" + resultadoDiv);
                System.out.println("-----------------------------------------");
                break;
            case 5:
                System.out.println("Estas seguro que quieres salir? (S/N)");
                String salir=leer.next();
                if(salir.equalsIgnoreCase("S")) {
                    System.out.println("Nos vemos en la proxima");
                    bucle = false;
                }
                
            
                
           
        }
               
        }while(bucle);
    
        }
 

    private static int suma(int num1, int num2) {
         int num3 = 0;
        
            num3 = num1 + num2;

        return num3;
    }

    private static int resta(int num1, int num2) {
        int num3 = 0;
                num3 = num1 - num2;
                return num3;
    }

    private static int multi(int num1, int num2) {
        int num3 = 0;
                num3 = num1 * num2;
                return num3;
    }

    private static int div(int num1, int num2) {
        int num3 = 0;
        num3 = num1 / num2;
        return num3;
                
    }
}
