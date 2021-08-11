package com.andres_marulanda.ejercicios_semana_2;
//@author Andres Marulanda

import java.util.Scanner;
public class E5 {
//@param args the command line arguments
     
    public static void main(String[] args) {
        byte longitud;
        
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la longitud del vector: ");
        longitud = read.nextByte();
        
        int [] v1 = new int [longitud];
        int [] v2 = new int [longitud];
        int [] s  = new int [longitud];
        
        for (int i=0; i<v1.length; i++){
            System.out.println("Ingrese un número entero: ");
            v1[i] = read.nextInt();
        }
        System.out.println();
        for (int i=0; i<v1.length; i++){
            System.out.println("Ingrese un número entero: ");
            v2[i] = read.nextInt();
        }
        s = sumaVectorial(v1, v2);
        System.out.println();
        for (int i=0; i<v1.length; i++){
            System.out.print(v1[i] + " ");
        }
        System.out.println();
        for (int i=0; i<v1.length; i++){
            System.out.print(v2[i] + " ");
        } 
        System.out.println();
        for (int i=0; i<v1.length; i++){
            System.out.print(s[i] + " ");
        }        
    }
    public static int [] sumaVectorial (int [] v1, int [] v2){
        int [] s = new int [v1.length];
        
        for (int i=0; i<v1.length; i++){
            s[i] = v1[i] + v2[i];
        }
        return s;
    }    
}
