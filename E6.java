
package com.andres_marulanda.ejercicios_semana_2;
//@author Andres Marulanda
 
public class E6 {
//@param args the command line arguments
     
    public static void main(String[] args) {
       
       char [] vectorEntrada = {' ', 'P', 'r', 'o', ' ', 'g', 'r', 'a', ' ', 'm', 'a', 'r'};
       String vectorConcatenado = null;
       
       vectorConcatenado = join(vectorEntrada);
       System.out.println(vectorConcatenado);
    }   
    public static String join (char [] vector){   
        
       String vectorConcatenado = "";
        
       for (int i=0; i<vector.length; i++){
           vectorConcatenado += vector[i];
       }
    return vectorConcatenado;    
    }
    
}
