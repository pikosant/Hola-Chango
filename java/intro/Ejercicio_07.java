/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.intro;

import java.util.Scanner;

/**
 *
 * @author pikos
 */
public class Ejercicio_07 {
    
public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una nota");
        int nota = leer.nextInt();
        int nota1 = nota;
        while (nota1 < 1 && nota1 > 10){
            System.out.println("porfavor, ingrese nuevamente la nota");
            nota1 = leer.nextInt();
        }}
        
    }
