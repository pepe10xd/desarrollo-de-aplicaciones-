/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercico.pkg1.practica;

import java.util.Scanner;

public class MANZANITA {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       int []pepe =new int [10];
 
  System.out.println("Ingrese los numeros del 1 al 10");

        for (int a = 0; a <= 9; a++) {
            pepe[a] = sc.nextInt();
        }

        int cantNegativos = 0;

        for (int a = 0; a <= 9; a++) {
            if (pepe[a] < 0) {
                cantNegativos++;
            }
        }

        System.out.println("Hay " + cantNegativos + " numeros negativos.");
        System.out.print("Son: ");
                System.out.println("Array original:");
        mostrarArray(pepe);
        
mergesort(pepe, 0, pepe.length - 1);

        System.out.println("Array ordenado:");
        mostrarArray(pepe);
        for (int a = 0; a <= 9; a++) {
            if (pepe[a] < 0) {      

                System.out.print(pepe[a] + " ");
                
      
            }
            
        }
       
    }
public static void mostrarArray(int[] pepe) {

    for (int i = 0; i < pepe.length; i++) {
        System.out.print(pepe[i] + " ");
    }

    System.out.println();
}
public static void mergesort(int[] a, int izquierda, int derecha) {

    if (izquierda < derecha) {

        int medio = (izquierda + derecha) / 2;

        mergesort(a, izquierda, medio);
        mergesort(a, medio + 1, derecha);

        merge(a, izquierda, medio, derecha);
    }
}
public static void merge(int[] a, int izquierda, int medio, int derecha) {

    int n1 = medio - izquierda + 1;
    int n2 = derecha - medio;

    int[] izquierdaArray = new int[n1];
    int[] derechaArray = new int[n2];

    for (int i = 0; i < n1; i++) {
        izquierdaArray[i] = a[izquierda + i];
    }

    for (int j = 0; j < n2; j++) {
        derechaArray[j] = a[medio + 1 + j];
    }

    int i = 0;
    int j = 0;
    int k = izquierda;

    while (i < n1 && j < n2) {

        if (izquierdaArray[i] <= derechaArray[j]) {
            a[k] = izquierdaArray[i];
            i++;
        } else {
            a[k] = derechaArray[j];
            j++;
        }

        k++;
    }

    while (i < n1) {
        a[k] = izquierdaArray[i];
        i++;
        k++;
    }

    while (j < n2) {
        a[k] = derechaArray[j];
        j++;
        k++;
    }
}
}

    

