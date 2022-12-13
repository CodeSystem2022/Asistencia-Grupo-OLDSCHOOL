/* Francisco Tonidandel 

package arreglos_ejercicio_2;

import java.util.Scanner;

public class Arreglos_Ejercicio_2 {
public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
float numeros[] = new float[5];

    System.out.println("Se guardan los datos");
    for(int i = 0; i < 5; i++){
        System.out.println((i+1)+". Digite un numero: ");
        numeros[i] = entrada.nextFloat();
    }
    
    System.out.println("\nImprimimos los datos del arreglo");
    for(int i= 4; i >= 0; i--){
        System.out.println(" "+numeros[i]);
    }
    System.out.println("\n");
}
}*/

/*#########################################################################################################################*/

/* Matias Garcia

package arreglos_ejercicio_1;


public class Arreglos_Ejercicio_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float[] arreglos = new float[5];
        
        System.out.println("Guardando los datos en el arreglo");
        for (int i=0; i<5; i++) {
            System.out.println((i+1)+".Digite un numero: ");
            arreglos[i] = entrada.nextFloat();
        }
        
        System.out.println("\nImprimir los elementos del arreglo");
        for(float i:arreglos) {
            System.out.println(i+" ");
        }
        System.out.println("\n");
    }
}*/

/*#########################################################################################################################*/

/*
Julian Antequera
Ejercicio 3: Crear y cargar una matriz de tamaño 3x3, transponerla y mostrarla.


package Matriz_Ejercicio_3;

import java.util.Scanner;

public class Matriz_Ejercicio_3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[3][3];

        System.out.println("Rellenar la matriz: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Matriz [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        System.out.println();

        System.out.println("Matriz Original: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        
        System.out.println("Matriz transpuesta: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();

        }
        System.out.println();

    }

}*/
/*#########################################################################################################################*/

/*Tomas Cañete

package matriz_ejercicio_4;

import java.util.Scanner;

public class matriz_ejercicio_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int [7][7];
        
        //Llenamos la matriz
        for(int i=0;i<7;i++){
                for(int j=0;j<7;j++){
                        if(i==j){
                                matriz[i][j] = 1;
                        }
                        else{
                                matriz[i][j] = 0;
                        }
                }
        }
        System.out.println("\nMostramos la matriz completa: ");
        for(int i=0;i<7;i++){
                for(int j=0;j<7;j++){
                        System.out.println(matriz[i][j]+" ");
                }
                System.out.println("");         
        }
        System.out.println("");
        
    }
    
    
}*/

/*#########################################################################################################################*/

/*Gustavo Malaniuk
package Arreglos_Ejercicio_1;

import java.util.Scanner;
        
public class Ejercicio1 {
  
    public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in) ;
		float[ ] arreglos = new float [5] ;
	
		System.out.println("Guardando los datos en el arreglo");
		for (int i=0;i<5;i++) {
			System.out.print((i+1)+". Digite un numero:  ") ;
			arreglos[i] = entrada.nextFloat() ;
		}
		
		System.out.println("\nImprimir los elementos del arreglo") ;
		for(float i:arreglos) {
			System.out.print(i+" ") ;
		}
        System.out.println("\n");
    }
}*/

/*#########################################################################################################################*/

/*Yair Mathez

package matriz_ejercicio_5;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Matriz_Ejercicio_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][], nFilas, nCol, sumaFilas, sumaCol;
        int posFila, posCol;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas: "));
        nCol =  Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas: "));
        
        matriz = new int [nFilas][nCol];
        int filas[] = new int[nFilas];
        int columnas[] = new int[nCol];
        
        System.out.println("Rellenando la matriz: ") ;
        for(int i=0;<nFilas;i++) {
            for(int j=0;<nCol;j++) {
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        System.out.println("\nMatriz Original: ");
        for(int i=0;<nFilas;i++) {
            for(int j=0;<nCol;j++) {
                System.out.print(matriz[i][j]+" " );
            }
            System.out.println("");  
            
             //Sumando las filas
             posFila=0;
             for(int i=0;i<nFilas;i++){
                  sumaFilas = 0;
                  for(int j=0;j<nCol;j++){
                    sumaFilas += matriz[i][j];
                  }
                  filas[posFila] = sumaFilas;
                  posFila++;
             }
             
             //Sumando las columnas
             posCol = 0;
             for(int j=0;j<nCol;i++){
                     sumaCol = 0;
                     for(int i=0;i<nFilas;i++){
                             sumaCol += matriz[i][j];
                }
                columnas[posCol] = sumaCol;
                posCol++;
        }
             
        System.out.println("\nLa suma de las filas es: ");
        for(int i=0;i<nFilas;i++){ 
                System.out.println(filas[i]+" - ");  
        } 
        System.out.println("");
            
        System.out.println("\nLa suma de las columnas es: ");
        for(int i=0;i<nCol;i++){
                System.out.println([i]+" - ");
        }
        System.out.println("");
                    
    }
*/
/*#########################################################################################################################*/

/*Yessica Reynoso

package Arreglos.newpackage;

import java.util.Scanner;


public class Arreglos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float[] arreglos = new float [5];
        
        System.out.println("Guardadno los datos en el arreglo");
        for(int i=0;i<5;i++){
            System.out.println((i+1)+" Digite un numero: ");
            arreglos[i] = entrada.nextFloat();
        }
        
        System.out.println("\n Imprimir los elementos del arreglo");
        for(float i:arreglos){
            System.out.println(i+" "); 
        }
        System.out.println("\n");

*/

/*#########################################################################################################################*/

/*Andrea Reynoso

package arreglos_ejercicio_3;

import java.util.Scanner;


public class Arreglos_Ejercicio_3 {
    public static void main(String[] args) {
           Scanner entrada = new Scanner(System.in);
           float numeros[] = new float[5];
           float negativos = 0, positivos = 0, mediaNegativos, mediaPositivos;
           int conteo0 = 0, conteo_negativos = 0, conteo_positivos = 0;
           
           System.out.println("Guardamos los lementos del arreglo: ");
           for (int i = 0; i < 5; i++) {
                    System.out.println((i+1)+". Digite un numero: ");
                    numeros[i] = entrada.nextFloat();
                    if(numeros[i] > 0 ) {
                          positivos += numeros[i];
                          conteo_positivos++;
                    }
                    else if(numeros[i] < 0 ) {
                          negativos += numeros[i];
                          conteo_negativos++;
                    }
                    else{
                          conteo0++;
                    }
            }
            if(conteo_positivos == 0) {
                  System.out.println("\nNo se puede sacar la media de los numeros positivos");
            }
            else{
                  mediaPositivos = positivos/conteo_positivos;
                  System.out.println("\nLa media de los numeros positivos es: "+mediaPositivos);
            }
            if(conteo_negativos == 0) {
                  System.out.println("\nNo se puede sacar la media de los numeros negativos");
            }
            else{
                  mediaNegativos = negativos/conteo_negativos;
                  System.out.println("\nLa media de los numeros nagativos es: "+mediaNegativos); 
            }
            
            System.out.println("La cantidad de ceros es: "+conteo0);
    }
}

/* Francisco Tonidandel
    Ejericicio arreglos



package Areglos_Ejercicio_1;

import java.util.Scanner;


public class arreglos_ejercicio_1 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       float[] arreglos = new float[5];
        System.out.println("guardando los datos en el arreglo");
        for (int i = 0; i < 5; i++) {
            System.out.println((i+1)+". digite un numero: ");
            arreglos[i]=entrada.nextFloat();
        }
        System.out.println("\nImprimir los elementos del arreglo");
        for(float i:arreglos){
            System.out.println(i+" ");

        }
        System.out.println("\n");
    }

}

