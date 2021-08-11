package com.andres_marulanda.ejercicios_semana_2;
//@author Andres Marulanda

import java.util.Scanner;

public class E4 {
//@param args the command line arguments

    public static void main(String[] args) {
        int tamagnoVector;
        

        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector: ");
        tamagnoVector = read.nextInt();

        int[] vectorEntrada = new int[tamagnoVector];
        
        if (tamagnoVector%2 == 0){
            for (int i = 0; i < vectorEntrada.length; i++) {
                System.out.println("Ingrese un número entero: ");
                vectorEntrada[i] = read.nextInt();
            }
            ordenamientoPersonalizado(vectorEntrada);
            for (int i = 0; i < vectorEntrada.length; i++) {
                System.out.println(vectorEntrada[i]);
            }
        }else{
            System.out.println("Tamaño invalido");
        }
    }
    public static int [] ordenamientoPersonalizado (int [] vectorEntrada){ 
        int mayor = 0;
        int [] vectorOrdenado = new int [vectorEntrada.length];
        
        // ordenar ascendentemente entre Vo y Vo/2 - 1.
        for (int i=0; i<vectorEntrada.length/2; i++){
            int k = i;
            for (int j=i+1; j<vectorEntrada.length/2; j++){
                if (vectorEntrada[j] < vectorEntrada[k]){
                    k=j;
                }
            }
            intercambiar(vectorEntrada, i, k);
        }
        //Ordenar descendentemente entre Vo/2 + 1 y Vo.
        for (int i = vectorEntrada.length/2; i<vectorEntrada.length; i++){
            int k = i;
            for (int j=i+1; j < vectorEntrada.length; j++){
                if (vectorEntrada[j] > vectorEntrada[k]){
                    k=j;
                }
            }
            intercambiar(vectorEntrada, i, k);
        }
        vectorOrdenado = vectorEntrada;
        return vectorOrdenado;
    }
    public static void intercambiar(int[] vector, int a, int b) {
        int aux;
        aux = vector[b];
        vector[b] = vector[a];
        vector[a] = aux;
    }
}
