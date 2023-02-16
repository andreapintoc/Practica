package ejercicios_2;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrea
 */
public class Arrays {

    public Arrays() {
    }
        public void valueCounter() {
            int[] array;
            int contPositive;
            int contNegative;
            int contZeros;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Please enter the array size");
            int size = sc.nextInt();
            array = new int[size];
            contPositive = 0;
            contNegative = 0;
            contZeros = 0;
            for (int i = 0; i < array.length; i++) {
                System.out.println("Please enter the value number "+(i+1)+":");
                int number = sc.nextInt();
                array[i] = number;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            if (array[i] == 0){
                contZeros++;
            } else if (array[i] > 0) {
                contPositive++;
            } else {
                contNegative++;
            }
        }
        System.out.println("We have "+contZeros+" 0");
        System.out.println("We have "+contPositive+" positives");
        System.out.println("We have "+contNegative+" negatives");
    }
    
    public void stringToArray(String word) {
        String[] stringArray = new String[word.length()];
        for (int i = 0; i < word.length(); i++) {
            stringArray[i] = String.valueOf(word.charAt(i));
        }
        for (String stringArray1 : stringArray) {
            System.out.print("[" + stringArray1 + "]");
        }
    }
}
