/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package larenga;

import java.util.Random;

public class Main {

    static int[] llenarArray(int desde, int hasta, int tamanio) {
        Random rand = new Random();
        int[] array = new int[tamanio];

        for (int i = 0; i < tamanio; i++) {
            int numero;
            do {
                numero = rand.nextInt(hasta - desde + 1) + desde;
            } while (comprobarSiContiene(array, i, numero));
            array[i] = numero;
        }

        return array;
    }

    static boolean comprobarSiContiene(int[] array, int posActual, int numero) {
        for (int i = 0; i < posActual; i++) {
            if (array[i] == numero) {
                return true;
            } 
        }
        return false;
    }

    public static void main(String[] args) {
        int[] resultado = llenarArray(1, 50, 10);

        for (int i = 0; i < resultado.length; i++) {
            System.out.println("resultado[" + i + "] = " + resultado[i]);
        }
    }
}
 //EJERCICIO 8
  /*   String[] nombres = new String[20];
        double[] sueldos = new double[20];

        for (int i = 0; i < 20; i++) {
            System.out.print("Nombre del empleado " + (i + 1) + ": ");
            nombres[i] = sc.next();
            System.out.print("Sueldo de " + nombres[i] + ": ");
            sueldos[i] = sc.nextDouble();
        }

        // tomamos el primero como mayor
        int indiceMayor = 0;

        for (int i = 1; i < 20; i++) {
            if (sueldos[i] > sueldos[indiceMayor]) {
                indiceMayor = i;
            }
        }

        System.out.println("\nEmpleado que mas gana:");
        System.out.println("Nombre: " + nombres[indiceMayor]);
        System.out.println("Sueldo: " + sueldos[indiceMayor]);
    }
}*/
  //EJERCICIO 7
 /* int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int sumaPositivos = 0;
        int cantPositivos = 0;
        int sumaNegativos = 0;
        int cantNegativos = 0;

        for (int i = 0; i < 10; i++) {
            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
                cantPositivos++;
            } else if (numeros[i] < 0) {
                sumaNegativos += numeros[i];
                cantNegativos++;
            }
        }

        if (cantPositivos > 0) {
            double mediaPos = (double) sumaPositivos / cantPositivos;
            System.out.println("Media de positivos: " + mediaPos);
        } else {
            System.out.println("No hay numeros positivos.");
        }

        if (cantNegativos > 0) {
            double mediaNeg = (double) sumaNegativos / cantNegativos;
            System.out.println("Media de negativos: " + mediaNeg);
        } else {
            System.out.println("No hay numeros negativos.");
        }
    }
}*/
 //EJERCICIO 6
/* int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int sumaPositivos = 0;
        int cantPositivos = 0;
        int sumaNegativos = 0;
        int cantNegativos = 0;

        for (int i = 0; i < 10; i++) {
            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
                cantPositivos++;
            } else if (numeros[i] < 0) {
                sumaNegativos += numeros[i];
                cantNegativos++;
            }
        }

        if (cantPositivos > 0) {
            double mediaPos = (double) sumaPositivos / cantPositivos;
            System.out.println("Media de positivos: " + mediaPos);
        } else {
            System.out.println("No hay numeros positivos.");
        }

        if (cantNegativos > 0) {
            double mediaNeg = (double) sumaNegativos / cantNegativos;
            System.out.println("Media de negativos: " + mediaNeg);
        } else {
            System.out.println("No hay numeros negativos.");
        }
    }
}*/
//EJERCICIO 5
/* int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        for (int i = 0; i < 10; i++) {
            if (numeros[i] > 0) {
                positivos++;
            } else if (numeros[i] < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        System.out.println("\nPositivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: "     + ceros);
    }
}*/
//EJERCICIO 4
  /*   int[] pares = new int[20];

        for (int i = 0; i < 20; i++) {
            pares[i] = (i + 1) * 2;
        }

        for (int i = 0; i < 20; i++) {
            System.out.println("pares[" + i + "] = " + pares[i]);
        }
    }
}*/
  //EJERCICIO 3
  
     /*   System.out.print("Ingrese el numero de alumnos: ");
        int cantAlumnos = sc.nextInt();

        double[] notas = new double[cantAlumnos];
        for (int i = 0; i < cantAlumnos; i++) {
            System.out.print("Nota del alumno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }
        double suma = 0;
        for (int i = 0; i < cantAlumnos; i++) {
            suma += notas[i];
        }
        double media = suma / cantAlumnos;
        System.out.println("\nMedia del grupo: " + media);
        System.out.println("Alumnos con nota superior a la media:");
        for (int i = 0; i < cantAlumnos; i++) {
            if (notas[i] > media) {
                System.out.println("Alumno " + (i + 1) + " -> nota: " + notas[i]);
            }
        }
    }
}*/
     //EJERCICIO 2
      /*  int[] numeros = new int[10];

        System.out.println("Ingrese 10 numeros:");

        for (int i = 0; i <= 9; i++) {
            numeros[i] = sc.nextInt();
        }

        int suma = 0;
        int cant = 0;

        for (int i = 0; i <= 9; i++) {
            if (i % 2 == 0) {
                suma += numeros[i];
                cant++;
            }
        }

        double media = (double) suma / cant;
        System.out.println("Media de posiciones pares: " + media);
    }
}*/
      //EJERCICIO 1
/* int []pepe =new int [10];
 
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
*/
