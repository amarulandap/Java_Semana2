package com.andres_marulanda.ejercicios_semana_2;

import java.util.Scanner;
//@author Andres Marulanda
 
public class E1 {
//@param args the command line arguments
     
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        long factorial = 1;
        
        Scanner read = new Scanner(System.in);
        System.out.println();
        numero = read.nextInt();
        
        if (numero == 0 || numero == 1){
            System.out.println(factorial);
        }else{
            for (int i = numero; i > 0; i--){
                factorial *= i;
            }System.out.println(factorial);
        }
    }
    
}
