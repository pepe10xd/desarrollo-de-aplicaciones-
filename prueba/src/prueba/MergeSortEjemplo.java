/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;

/**
 *
 * @author ET20
 */
public class MergeSortEjemplo {

    // Método principal
    public static void main(String[] args) {

        int[] numeros = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Array original:");
        mostrarArray(numeros);

        mergeSort(numeros, 0, numeros.length - 1);

        System.out.println("Array ordenado:");
        mostrarArray(numeros);
    }

    // Método MergeSort
    public static void mergeSort(int[] array, int izquierda, int derecha) {

        if (izquierda < derecha) {

            int medio = (izquierda + derecha) / 2;

            // Divide la mitad izquierda
            mergeSort(array, izquierda, medio);

            // Divide la mitad derecha
            mergeSort(array, medio + 1, derecha);

            // Une las mitades ordenadas
            merge(array, izquierda, medio, derecha);
        }
    }

    // Método para unir arrays
    public static void merge(int[] array, int izquierda, int medio, int derecha) {

        int tamaño1 = medio - izquierda + 1;
        int tamaño2 = derecha - medio;

        int[] izquierdaArray = new int[tamaño1];
        int[] derechaArray = new int[tamaño2];

        // Copiar datos
        for (int i = 0; i < tamaño1; i++) {
            izquierdaArray[i] = array[izquierda + i];
        }

        for (int j = 0; j < tamaño2; j++) {
            derechaArray[j] = array[medio + 1 + j];
        }

        int i = 0, j = 0;
        int k = izquierda;

        // Mezclar arrays
        while (i < tamaño1 && j < tamaño2) {

            if (izquierdaArray[i] <= derechaArray[j]) {
                array[k] = izquierdaArray[i];
                i++;
            } else {
                array[k] = derechaArray[j];
                j++;
            }

            k++;
        }

        // Copiar elementos restantes
        while (i < tamaño1) {
            array[k] = izquierdaArray[i];
            i++;
            k++;
        }

        while (j < tamaño2) {
            array[k] = derechaArray[j];
            j++;
            k++;
        }
    }

    // Mostrar array
    public static void mostrarArray(int[] array) {

        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println();
    }
}
