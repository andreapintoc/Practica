/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_2;
import java.util.Scanner;
/**
 *
 * @author Andrea
 */
public class Ejercicios_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println ("BIENVENIDO");
        System.out.println ("1. Fibonacci");
        System.out.println ("2. Palabra en un arreglo");
        System.out.println ("3. Palabra en un arreglo");
        System.out.println ("Escriba opcion a elegir: ");
        String menu ;
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        menu = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
        Arrays arrays = new Arrays();
        if (null != menu)switch (menu) {
            case "1":
                System.out.println ("Escriba limite de la serie: ");
                String numero;
                Scanner entradaEscaner3 = new Scanner (System.in); //Creación de un objeto Scanner
                numero = entradaEscaner3.nextLine (); //Invocamos un método sobre un objeto Scanner
                int maxNumero =  Integer. parseInt(numero);
                Fibonacci fibo = new Fibonacci();
                fibo.calculadoraFibo(maxNumero);
                break;
            case "2":
                arrays.valueCounter();
                break;
            case "3":
                System.out.println("Please enter a word ");
                String word;
                Scanner entradaEscaner4 = new Scanner (System.in); //Creación de un objeto Scanner
                word = entradaEscaner4.nextLine (); //Invocamos un método sobre un objeto Scanner
                arrays.stringToArray(word);
                break;
            default:
                break;
        }
        
    
    }
    
}
