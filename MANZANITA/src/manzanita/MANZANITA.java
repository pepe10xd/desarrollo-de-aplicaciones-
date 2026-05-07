package manzanita;
import java.util.Arrays;
import java.util.Scanner;

public class MANZANITA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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

        // Ordenar e imprimir el arreglo completo
        Arrays.sort(pepe);
        System.out.println("Arreglo ordenado:");
        for (int s : pepe) {
            System.out.println(s);
        }
    }
}