/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author pikos
 */
public class EJ1 {
    
}
int[][]matriz= new int[4][4];
        Random numero = new Random();
        for(int i=0;i<matriz.length;i++){
             for(int j=0;j<matriz.length;j++){
                 
                 matriz[i][j]=numero.nextInt(0+10);
             
             }
         } 
       for(int i=0;i<matriz.length;i++){
             for(int j=0;j<matriz.length;j++){
                 
                 System.out.print("("+matriz[i][j]+")");
             
             }
             System.out.println("");
         }  
        System.out.println("-----------------");
       matrizB(matriz);
    }
 }
