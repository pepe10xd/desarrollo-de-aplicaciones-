/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercico.pkg1.practica;

import java.util.Scanner;

public class MANZANITA {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
  

/*
        //Ejercicio 5

     
          int[] numeros = new int[10];

        System.out.println("Ingrese 10 numeros:");

        for (int i = 0; i <= 9; i++) {

            numeros[i] = sc.nextInt();
        }

        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        for (int i = 0; i <= 9; i++) {

            if (numeros[i] > 0) {

                positivos++;

            } else if (numeros[i] < 0) {

                negativos++;

            } else {

                ceros++;
            }
        }

        System.out.println("Array original:");

        mostrarArray(numeros);

        mergesort(numeros, 0, numeros.length - 1);

        System.out.println("Array ordenado:");

        mostrarArray(numeros);

        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
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
        //Ejercicio 4
        /*
          int[] pares = new int[20];

        int numero = 2;

        for (int i = 0; i < 20; i++) {

            pares[i] = numero;

            numero = numero + 2;
        }

        System.out.println("Array original:");

        mostrarArray(pares);

        mergesort(pares, 0, pares.length - 1);

        System.out.println("Array ordenado:");

        mostrarArray(pares);
    }

    public static void mostrarArray(int[] pares) {

        for (int i = 0; i < pares.length; i++) {

            System.out.print(pares[i] + " ");
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
        //Ejercicio 3
      /*
       .out.println("Ingrese cantidad de alumnos:");

        int cantidad = sc.nextInt();

        double[] notas = new double[cantidad];

        for (int a = 0; a < cantidad; a++) {

            System.out.println("Ingrese la nota:");

            notas[a] = sc.nextDouble();
        }

        double suma = 0;

        for (int a = 0; a < cantidad; a++) {

            suma = suma + notas[a];
        }

        double media = suma / cantidad;

        System.out.println("Array original:");

        mostrarArray(notas);

        mergesort(notas, 0, notas.length - 1);

        System.out.println("Array ordenado:");

        mostrarArray(notas);

        System.out.println("La media es: " + media);

        System.out.println("Notas mayores a la media:");

        for (int a = 0; a < cantidad; a++) {

            if (notas[a] > media) {

                System.out.print(notas[a] + " ");
            }
        }
    }

    public static void mostrarArray(double[] notas) {

        for (int i = 0; i < notas.length; i++) {

            System.out.print(notas[i] + " ");
        }

        System.out.println();
    }

    public static void mergesort(double[] a,
            int izquierda, int derecha) {

        if (izquierda < derecha) {

            int medio = (izquierda + derecha) / 2;

            mergesort(a, izquierda, medio);

            mergesort(a, medio + 1, derecha);

            merge(a, izquierda, medio, derecha);
        }
    }

    public static void merge(double[] a,
            int izquierda, int medio, int derecha) {

        int n1 = medio - izquierda + 1;
        int n2 = derecha - medio;

        double[] izquierdaArray = new double[n1];
        double[] derechaArray = new double[n2];

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
//Ejercicio 2
     /*
        int[] numeros = new int[10];

        System.out.println("Ingrese 10 numeros:");

        for (int i = 0; i <= 9; i++) {

            numeros[i] = sc.nextInt();
        }

        System.out.println("Array original:");

        mostrarArray(numeros);

        mergesort(numeros, 0, numeros.length - 1);

        System.out.println("Array ordenado:");

        mostrarArray(numeros);

        int suma = 0;
        int contador = 0;

        for (int i = 0; i <= 9; i += 2) {

            suma = suma + numeros[i];
            contador++;
        }

        double media = (double) suma / contador;

        System.out.println("La media es: " + media);
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
//Ejercicio 1 
        /*
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

    /*

