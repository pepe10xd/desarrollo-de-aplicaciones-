/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package larenga;

import java.util.Scanner;

/**
 *
 * @author ET20
 */
public class Larenga {

    /**
     * @param args the command line arguments
     */
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
}
