/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nico.subime.la.nota.porfa;

import java.util.Scanner;

public class NicoSubimeLaNotaPorfa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
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

        for (int a = 0; a <= 9; a++) {
            if (pepe[a] < 0) {
                System.out.print(pepe[a] + " ");
            }
        }
    }
        public class Empleado{
    private String nif;
    private String nombre;
    private double sueldo;
  
                                                                                
}
}
        /*
        //ejercicio 1 con shell
        
       int[] pepe = new int[10];

        System.out.println("Ingrese los numeros del 1 al 10");

        for (int a = 0; a < 10; a++) {
            pepe[a] = sc.nextInt();
        }

        int cantNegativos = 0;

        for (int a = 0; a < 10; a++) {
            if (pepe[a] < 0) {
                cantNegativos++;
            }
        }

        System.out.println("Hay " + cantNegativos + " numeros negativos.");
        System.out.print("Son: ");

        for (int a = 0; a < 10; a++) {
            if (pepe[a] < 0) {
                System.out.print(pepe[a] + " ");
            }
        }

        System.out.println();

    
        shell(pepe);

        System.out.println("Ordenados:");
        for (int a = 0; a < 10; a++) {
            System.out.print(pepe[a] + " ");
        }
    }

    public static void shell(int A[]) {

        int salto, aux, i;
        boolean cambios;

        for (salto = A.length / 2; salto != 0; salto /= 2) {
            cambios = true;

            while (cambios) {
                cambios = false;

                for (i = salto; i < A.length; i++) {
                    if (A[i - salto] > A[i]) {
                        aux = A[i];
                        A[i] = A[i - salto];
                        A[i - salto] = aux;
                        cambios = true;
                    }
                }
            }
        }
    }
}

        /*
  
        //ejercicio 1 con  insercion directa
        int[] pepe = new int[10];

        System.out.println("Ingrese los numeros del 1 al 10");

        for (int a = 0; a < 10; a++) {
            pepe[a] = sc.nextInt();
        }

        int cantNegativos = 0;

        for (int a = 0; a < 10; a++) {
            if (pepe[a] < 0) {
                cantNegativos++;
            }
        }

        System.out.println("Hay " + cantNegativos + " numeros negativos.");
        System.out.print("Son: ");

        for (int a = 0; a < 10; a++) {
            if (pepe[a] < 0) {
                System.out.print(pepe[a] + " ");
            }
        }


        insercionDirecta(pepe);

        System.out.println("\nOrdenados:");
        for (int a = 0; a < 10; a++) {
            System.out.print(pepe[a] + " ");
        }
    }

    public static void insercionDirecta(int A[]) {
        int i, j, aux;

        for (i = 1; i < A.length; i++) {
            aux = A[i];
            j = i - 1;

            while (j >= 0 && aux < A[j]) {
                A[j + 1] = A[j];
                j--;
            }

            A[j + 1] = aux;
        }
    }
}
  */
/*
//ejercicio 1 con burbuja
        int[] pepe = new int[10];

        System.out.println("Ingrese los numeros del 1 al 10:");

        for (int a = 0; a < 10; a++) {
            pepe[a] = sc.nextInt();
        }

        burbuja(pepe);

        System.out.println("Numeros ordenados:");
        for (int a = 0; a < 10; a++) {
            System.out.print(pepe[a] + " ");
        }

        System.out.println();

        int cantNegativos = 0;

        for (int a = 0; a < 10; a++) {
            if (pepe[a] < 0) {
                cantNegativos++;
            }
        }

        System.out.println("Hay " + cantNegativos + " numeros negativos.");

        System.out.print("Son: ");
        for (int a = 0; a < 10; a++) {
            if (pepe[a] < 0) {
                System.out.print(pepe[a] + " ");
            }
        }
    }

    public static void burbuja(int[] A) {

        int i, j, aux;

        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {

                if (A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
    }
}
*/
     
        /*   //ejercicio 1 con arrays
          int[] pepe = new int[10];

        System.out.println("Ingrese los numeros del 1 al 10");
        for (int a = 0; a <= 9; a++) {
            pepe[a] = scanner.nextInt();
        }

        // Contar e imprimir negativos
        int cantNegativos = 0;
        for (int a = 0; a <= 9; a++) {
            if (pepe[a] < 0) {
                cantNegativos++;
            }
        }
        System.out.println("Hay " + cantNegativos + " numeros negativos.");

        System.out.print("Son: ");
        for (int a = 0; a <= 9; a++) {
            if (pepe[a] < 0) {
                System.out.print(pepe[a] + " ");
            }
        }
        System.out.println();


        Arrays.sort(pepe);
        System.out.println("Arreglo ordenado:");
        for (int s : pepe) {
            System.out.println(s);
        }
    }
}
        //ejercicio 1 con merge sort
        */
/*
 int[] numeros = new int[10];

        System.out.println("Ingrese 10 numeros:");

        for (int i = 0; i <= 9; i++) {

            numeros[i] = sc.nextInt();
        }

        int sumaPositivos = 0;
        int sumaNegativos = 0;

        int cantPositivos = 0;
        int cantNegativos = 0;

        for (int i = 0; i <= 9; i++) {

            if (numeros[i] > 0) {

                sumaPositivos = sumaPositivos + numeros[i];
                cantPositivos++;

            } else if (numeros[i] < 0) {

                sumaNegativos = sumaNegativos + numeros[i];
                cantNegativos++;
            }
        }

        System.out.println("Array original:");

        mostrarArray(numeros);

        mergesort(numeros, 0, numeros.length - 1);

        System.out.println("Array ordenado:");

        mostrarArray(numeros);

        if (cantPositivos > 0) {

            double mediaPositivos =
                    (double) sumaPositivos / cantPositivos;

            System.out.println("Media positivos: "
                    + mediaPositivos);
        }

        if (cantNegativos > 0) {

            double mediaNegativos =
                    (double) sumaNegativos / cantNegativos;

            System.out.println("Media negativos: "
                    + mediaNegativos);
        }
    }

    public static void mostrarArray(int[] numeros) {

        for (int i = 0; i < numeros.length; i++) {

            System.out.print(numeros[i] + " ");
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

    public static void merge(int[] a, int izquierda,
            int medio, int derecha) {

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
    */
    

