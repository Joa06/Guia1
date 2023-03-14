/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3guia1;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Usuario
 */
public class Ej3Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese una frase");
    String frase = leer.next();
    String Frasemay = toUpperCase(frase);
    String Frasemin = toLowerCase(frase); 
    System.out.println(Frasemay);
    System.out.println(Frasemin);
    }
    
}
