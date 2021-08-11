package com.andres_marulanda.ejercicios_semana_2;
// @author Andres Marulanda
//import java.util.Scanner;
        
public class E2 {
//@param args the command line arguments
     
    public static void main(String[] args) {
      
    int [] vectorEntrada = {17, 28, 64, 124, -4, -56, -120, 260, 29, 32, 58};
    int resultado = sumarPares(vectorEntrada);
    System.out.println("El resultado de la suma es: "+ resultado);      
    }
        public static int sumarPares(int [] vector){
            int s = 0;
            for (int i=0; i<vector.length; i++){
                if (vector[i] > 0 && vector[i]%2 == 0){
                    s += vector[i];
                }
            }
            return s;   
        }
    
}
