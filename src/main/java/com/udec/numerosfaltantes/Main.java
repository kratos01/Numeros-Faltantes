package com.udec.numerosfaltantes;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David Arias
 */
public class Main {
 /**
  * clase de inicio
  */
    private short vector [];
    private short min,max;
    private short i,j;
    
    /**
     * variables globales que se utilizan en la ejecucion del metodo
     */
 public Main() {
        
    }
 /**
  * costructor de la clase
  */
    public void recorreVector(){
        System.out.printf("digite la dimension del vector: ");
        Scanner teclado = new Scanner(System.in);//clase que captura los valores del teclado
        short recibe =teclado.nextShort();//variable que almacena lo que recibe el teclado
       
        vector = new short [recibe];//inicializacion del verctor 
        //recibe los numeros del vector
         for(i=0; i<vector.length; i++)//blucle para recorrer y llenar el vector 
        {
            System.out.printf("Introduzca número %d: ", i+1);
            vector[i] = teclado.nextShort();
        }
         System.out.print("el vector es: ");
        for(i=0; i<vector.length; i++)//bucle que recorre e imprime el vector
        {
            System.out.print(vector[i] + ",");
        }
        
        
            min = vector[0]; //inicializacion de las variables con el primer valor del vector
            max = vector[0];
        for(i = 0;i < vector.length;i++){
            if(min > vector [i]){
                
                min = vector[i];//variable que almacena el valor minimo del vector
                //System.out.println(min);
            }else if (max < vector[i]){
               
                max = vector[i];//variable que almacena el valor moyor del vector
                //System.out.println(max);
            }
                           
        }
        System.out.println();
            short cont = 0;//variable de control 
            for(i = min; i < max;i++){//bucle que recorre del numero menor al mayor 
                for(j = 0;j < vector.length;j++){//bucle anidado que recorre el verctor 
                    if(i == vector[j]){//compara si el numero contenido en i en igual al del vector 
                        cont ++;//si se cumple la condicion contador aumenta y sigue recorriendo el vector 
                    }
                }
                if (cont == 0){//si el contador es 0 imprime el numero en el que vaya i 
                    System.out.println("numeros faltantes: " + i );
                }
                cont = 0;//se devuelve el contador a 0 para que el bucle siga recorriendo 
            }
    
        }
 public static void main(String args[]) {
    Main principal = new Main();//istanciacion por donde se inicia el programa
    principal.recorreVector();//metodo por donde arranca el programa
}    
}



