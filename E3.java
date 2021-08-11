package com.andres_marulanda.ejercicios_semana_2;
//@author Andres Marulanda
 
public class E3 {
//@param args the command line arguments
     
    public static void main(String[] args) {
        
        int [] vectorEntrada = {-8, 11, 13, 79, -2, 1};
        double promedio = mean(vectorEntrada);
        System.out.println("El promedio de los valores es: "+ promedio);
    }        
        public static double mean(int [] vector){
          double suma = 0.0;
          double promedio;
          
          for (int i=0; i<vector.length; i++){
              suma += vector[i];
        }
          promedio = suma / vector.length;
          return promedio;
    }
    
}
