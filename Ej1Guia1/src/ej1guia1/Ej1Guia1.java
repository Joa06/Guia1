/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1guia1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej1Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        int num1 = Integer.parseInt(leer.next());
        int num2 = Integer.parseInt(leer.next());
        int suma = num1 + num2;
        System.out.println("La suma de " + num1 + " + " + num2 + " es igual a: " + suma);
    }
    
}
