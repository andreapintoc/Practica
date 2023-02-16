/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_2;

/**
 *
 * @author Andrea
 */
public class Fibonacci {

    public Fibonacci() {
    }
    public void calculadoraFibo (int maxNumero){
        int numero1 = 0;
        int numero2 = 1;
        System.out.println ("La serie Fibonacci es:  ");
        while (numero1 < maxNumero) {
           
            int aux = numero1;
            System.out.print (numero1 + " ");
            numero1 = numero2;
            numero2 += aux;
        }
    }
   
 }

