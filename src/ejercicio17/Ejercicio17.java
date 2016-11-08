/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author enric
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Enunciado*/
        System.out.println("El programa te dice si un año es bisiesto.");        
        
        int año; /* Declaro la variables
      
        /* Autorizo el teclado */
        Scanner teclado= new Scanner(System.in);
        
        /* Pido el año*/
        System.out.println("Dime un año.");
        año= teclado.nextInt();
        
        if (año%100 == 0) /* Para que sea bisiesto tiene que ser divisibles por 100. El if lo comprueba.*/
        {
            if (año%400 ==0) /* I ademas tiene que ser divisible por 400, si no no sera bisiesto. El if lo comprueba. */
            {
                System.out.println(año + " Es  bisiesto."); 
            }
            else 
            {
                System.out.println(año + " Es no bisiesto."); /* No sera bisisesto, sino se cumplen las opciones anteririores */
            }
        }
        
        else
        {
          if (año%4 ==0) /* Otra opción es que sea divisible por 4 (con resto 0). El if lo comprueba. */
          {
              System.out.println(año + " Es  bisiesto."); 
          }
          
          else
          {
              System.out.println(año + " Es no bisiesto."); /* No sera bisisesto, sino se cumplen las opciones anteririores */
          }
        }
    
    
    }
    }

