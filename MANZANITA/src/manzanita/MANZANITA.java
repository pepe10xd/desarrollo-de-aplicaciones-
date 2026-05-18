package manzanita;

import java.util.Arrays;
import java.util.Scanner;

public class MANZANITA {

    public static void main(String[] args) {
        
        
        
        
        
       // Scanner scanner = new Scanner(System.in);
        //ejercicio 8 con mergesort
        /*
         String[] nombres = new String[20];
        double[] sueldos = new double[20];

        for (int i = 0; i < 20; i++) {
            System.out.print("Nombre del empleado " + (i + 1) + ": ");
            nombres[i] = scanner.next();
            System.out.print("Sueldo de " + nombres[i] + ": ");
            sueldos[i] = scanner.nextDouble();
        }


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
    public static void mergesort(int A[],int izq, int der){
    if (izq < der){
            int m=(izq+der)/2;
            mergesort(A,izq, m);
            mergesort(A,m+1, der);                                                                                
            merge(A,izq, m, der);                                                                                 
    }
}
}
        //ejercicio 8 con quicksort
        /*
            String[] nombres = new String[20];
        double[] sueldos = new double[20];

        for (int i = 0; i < 20; i++) {
            System.out.print("Nombre del empleado " + (i + 1) + ": ");
            nombres[i] = scanner.next();
            System.out.print("Sueldo de " + nombres[i] + ": ");
            sueldos[i] = scanner.nextDouble();
        }


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
public static void quicksort(int A[], int izq, int der) {

  int pivote=A[izq]; 
  int i=izq;      
  int j=der;       
  int aux;
 
  while(i < j){                                                       
     while(A[i] <= pivote && i < j) i++;
     while(A[j] > pivote) j--;     
     if (i < j) {                                       
         aux= A[i];                
         A[i]=A[j];
         A[j]=aux;
     }
   }
   
   A[izq]=A[j];                                
   A[j]=pivote;     
   
   if(izq < j-1)
      quicksort(A,izq,j-1);         
   if(j+1 < der)
      quicksort(A,j+1,der);            
}
}
        //ejercicio 8 con  ordenacion 
        /*
         String[] nombres = new String[20];
        double[] sueldos = new double[20];

        for (int i = 0; i < 20; i++) {
            System.out.print("Nombre del empleado " + (i + 1) + ": ");
            nombres[i] = scanner.next();
            System.out.print("Sueldo de " + nombres[i] + ": ");
            sueldos[i] = scanner.nextDouble();
        }


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
    public static void seleccion(int A[]) {
          int i, j, menor, pos, tmp;
          for (i = 0; i < A.length - 1; i++) {    
                menor = A[i];                                        
                pos = i;                           
                for (j = i + 1; j < A.length; j++){ 
                      if (A[j] < menor) {          
                          menor = A[j];            
                          pos = j;
                      }
                }
                if (pos != i){                                      
                    tmp = A[i];
                    A[i] = A[pos];
                    A[pos] = tmp;
                }
          }
}
        //ejercicio 8 con comparable
        /*
          String[] nombres = new String[20];
        double[] sueldos = new double[20];

        for (int i = 0; i < 20; i++) {
            System.out.print("Nombre del empleado " + (i + 1) + ": ");
            nombres[i] = scanner.next();
            System.out.print("Sueldo de " + nombres[i] + ": ");
            sueldos[i] = scanner.nextDouble();
        }


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
    public class Empleado{
    private String nif;
    private String nombre;
    private double sueldo;
  
                                                                                      
}
}
        //ejercicio 8 con shell 
        /*
         String[] nombres = new String[20];
        double[] sueldos = new double[20];

        for (int i = 0; i < 20; i++) {
            System.out.print("Nombre del empleado " + (i + 1) + ": ");
            nombres[i] = scanner.next();
            System.out.print("Sueldo de " + nombres[i] + ": ");
            sueldos[i] = scanner.nextDouble();
        }


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
    public static void shell(int A[]) {

        int salto, aux, i;
        boolean cambios;
  
        for (salto = A.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {                                         
                cambios = false;
                for (i = salto; i < A.length; i++)   
                {
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
        //ejercicio 8 con insercion 
        /*
                String[] nombres = new String[20];
        double[] sueldos = new double[20];

        for (int i = 0; i < 20; i++) {
            System.out.print("Nombre del empleado " + (i + 1) + ": ");
            nombres[i] = scanner.next();
            System.out.print("Sueldo de " + nombres[i] + ": ");
            sueldos[i] = scanner.nextDouble();
        }


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
     public static void insercionDirecta(int A[]){                                            
    int p, j;
    int aux;
    for (p = 1; p < A.length; p++){ 
              aux = A[p];       
              j = p - 1;          
              while ((j >= 0) && (aux < A[j])){                         
                                             
                             A[j + 1] = A[j];   
                             j--;               
              }
              A[j + 1] = aux;       
    }
}
}
        //ejercicio 8 con burbuja 
        /*
        String[] nombres = new String[20];
        double[] sueldos = new double[20];

        for (int i = 0; i < 20; i++) {
            System.out.print("Nombre del empleado " + (i + 1) + ": ");
            nombres[i] = scanner.next();
            System.out.print("Sueldo de " + nombres[i] + ": ");
            sueldos[i] = scanner.nextDouble();
        }


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
        //ejercicio 7 con mergesort
        /*
          int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
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
    public static void mergesort(int A[],int izq, int der){
    if (izq < der){
            int m=(izq+der)/2;
            mergesort(A,izq, m);
            mergesort(A,m+1, der);                                                                                
            merge(A,izq, m, der);                                                                                 
    }
}
}
        //ejercicio 7 con quicksort
        /*
         int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
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
  public static void quicksort(int A[], int izq, int der) {

  int pivote=A[izq]; 
  int i=izq;       
  int j=der;        
  int aux;
 
  while(i < j){                                                        
     while(A[i] <= pivote && i < j) i++; 
     while(A[j] > pivote) j--;          
     if (i < j) {                                       
         aux= A[i];                  
         A[i]=A[j];
         A[j]=aux;
     }
   }
   
   A[izq]=A[j];                                   
   A[j]=pivote;    
   
   if(izq < j-1)
      quicksort(A,izq,j-1);          
   if(j+1 < der)
      quicksort(A,j+1,der);        
   
}
}
        //ejercicio 7 con ordenacion
        /*
              int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
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
  
public static void seleccion(int A[]) {
          int i, j, menor, pos, tmp;
          for (i = 0; i < A.length - 1; i++) {    
                menor = A[i];                                        
                pos = i;                            
                for (j = i + 1; j < A.length; j++){ 
                      if (A[j] < menor) {          
                          menor = A[j];           
                          pos = j;
                      }
                }
                if (pos != i){                                         
                    tmp = A[i];
                    A[i] = A[pos];
                    A[pos] = tmp;
                }
          }
}
}
        // ejercicio 7 con  comparable 
        /*
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
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
    public class Empleado{
    private String nif;
    private String nombre;
    private double sueldo;
  
                                                                                       
}
}

        //ejercicio 7 con shell
      
        /*
             int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
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
    public static void shell(int A[]) {

        int salto, aux, i;
        boolean cambios;
  
        for (salto = A.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {                                       
                cambios = false;
                for (i = salto; i < A.length; i++)   
                {
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
        //ejercicio 7 con insercion directa
        /*
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
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
 public static void insercionDirecta(int A[]){                                            
    int p, j;
    int aux;
    for (p = 1; p < A.length; p++){ 
              aux = A[p];           
              j = p - 1;           
              while ((j >= 0) && (aux < A[j])){                              
                                                
                             A[j + 1] = A[j];   
                             j--;              
              }
              A[j + 1] = aux;      
    }
}
}
        //jericio 7 con burbuja
        /*
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
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
        //ejercicio 6 con mergesprt
        /*
         int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
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
    }public static void mergesort(int A[],int izq, int der){
    if (izq < der){
            int m=(izq+der)/2;
            mergesort(A,izq, m);
            mergesort(A,m+1, der);                                                                                
            merge(A,izq, m, der);                                                                                 
    }
}
}
        //ejercicio 6 con quicksort
        /*
         int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
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
    public static void quicksort(int A[], int izq, int der) {

  int pivote=A[izq]; 
  int i=izq;        
  int j=der;        
  int aux;
 
  while(i < j){                                                    
     while(A[i] <= pivote && i < j) i++; 
     while(A[j] > pivote) j--;          
     if (i < j) {                                
         aux= A[i];                    
         A[i]=A[j];
         A[j]=aux;
     }
   }
   
   A[izq]=A[j];                                 
   A[j]=pivote;    
   
   if(izq < j-1)
      quicksort(A,izq,j-1);         
   if(j+1 < der)
      quicksort(A,j+1,der);      
   
}
}
        //ejercicio 6 con ordenacion
        /*
          int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
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
    public static void seleccion(int A[]) {
          int i, j, menor, pos, tmp;
          for (i = 0; i < A.length - 1; i++) {      
                menor = A[i];                                   
                pos = i;                          
                for (j = i + 1; j < A.length; j++){ 
                      if (A[j] < menor) {          
                          menor = A[j];            
                          pos = j;
                      }
                }
                if (pos != i){                                              
                    tmp = A[i];
                    A[i] = A[pos];
                    A[pos] = tmp;
                }
          }
}
}
        //ejercicio 6 con comparable 
        /*
         int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
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
    public class Empleado{
    private String nif;
    private String nombre;
    private double sueldo;
  
                                                                               
}
}
        //ejercicio 6 con shell 
        /*
         int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
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
    public static void shell(int A[]) {

        int salto, aux, i;
        boolean cambios;
  
        for (salto = A.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {   // Mientras se intercambie algún elemento                                         
                cambios = false;
                for (i = salto; i < A.length; i++)   // se da una pasada
                {
                    if (A[i - salto] > A[i]) {       // y si están desordenados
                        aux = A[i];                  // se reordenan
                        A[i] = A[i - salto];
                        A[i - salto] = aux;
                        cambios = true;              // y se marca como cambio.                                   
                    }
                }
            }
        }
}
}
        //ejercicio 6 con insercion
        /*
         int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
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
     public static void insercionDirecta(int A[]){                                            
    int p, j;
    int aux;
    for (p = 1; p < A.length; p++){ // desde el segundo elemento hasta
              aux = A[p];           // el final, guardamos el elemento y
              j = p - 1;            // empezamos a comprobar con el anterior
              while ((j >= 0) && (aux < A[j])){ // mientras queden posiciones y el                                
                                                // valor de aux sea menor que los
                             A[j + 1] = A[j];   // de la izquierda, se desplaza a
                             j--;               // la derecha
              }
              A[j + 1] = aux;       // colocamos aux en su sitio
    }
}
}
        //ejercicio 6 con burbuja}
        /*
         int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
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
        //ejercicio 5 con mergesort
        /*
          int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
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
        System.out.println("Ceros: " + ceros);
    }
    public static void mergesort(int A[],int izq, int der){
    if (izq < der){
            int m=(izq+der)/2;
            mergesort(A,izq, m);
            mergesort(A,m+1, der);                                                                                
            merge(A,izq, m, der);                                                                                 
    }
}
}
        //ejercicio 5 con quicksort
        /*
                   int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
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
        System.out.println("Ceros: " + ceros);
    }
    public static void quicksort(int A[], int izq, int der) {

  int pivote=A[izq];
  int i=izq;        
  int j=der;      
  int aux;
 
  while(i < j){                                                        
     while(A[i] <= pivote && i < j) i++; 
     while(A[j] > pivote) j--;           
     if (i < j) {                                    
         aux= A[i];                     
         A[i]=A[j];
         A[j]=aux;
     }
   }
   
   A[izq]=A[j];                              
   A[j]=pivote;   
   
   if(izq < j-1)
      quicksort(A,izq,j-1);         
   if(j+1 < der)
      quicksort(A,j+1,der);         
   
}
        //ejercicio 5 con ordenacion
        /*
           int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
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
        System.out.println("Ceros: " + ceros);
    }
    public class Empleado{
    private String nif;
    private String nombre;
    private double sueldo;
  
                                                                                        
}
}
        //ejercicio 5 con shell 
        /*
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
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
        System.out.println("Ceros: " + ceros);
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
    //ejercicio 5 con isercion 
     /*
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
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
     public static void insercionDirecta(int A[]){                                            
    int p, j;
    int aux;
    for (p = 1; p < A.length; p++){ 
              aux = A[p];           
              j = p - 1;            
              while ((j >= 0) && (aux < A[j])){                                
                                               
                             A[j + 1] = A[j];   
                             j--;               
              A[j + 1] = aux;      
}
}
     }
}
     //ejercio 5 con arrays
     /*
     int[] numeros = new int[10];

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
     //ejercio 4 con mergesort
     /*
       int[] pares = new int[20];

        for (int i = 0; i < 20; i++) {
            pares[i] = (i + 1) * 2;
        }

        for (int i = 0; i < 20; i++) {
            System.out.println("pares[" + i + "] = " + pares[i]);
        }
        public static void mergesort(int A[],int izq, int der){
    if (izq < der){
            int m=(izq+der)/2;
            mergesort(A,izq, m);
            mergesort(A,m+1, der);                                                                                
            merge(A,izq, m, der);                                                                                 
    }
}
}
     //ejercio 4 con quicksort
     /*
     int[] pares = new int[20];

        for (int i = 0; i < 20; i++) {
            pares[i] = (i + 1) * 2;
        }

        for (int i = 0; i < 20; i++) {
            System.out.println("pares[" + i + "] = " + pares[i]);
        }
        public static void quicksort(int A[], int izq, int der) {

  int pivote=A[izq]; 
  int i=izq;     
  int j=der;        
  int aux;
 
  while(i < j){                                                       
     while(A[i] <= pivote && i < j) i++; 
     while(A[j] > pivote) j--;         
     if (i < j) {                     
         aux= A[i];                     
         A[i]=A[j];
         A[j]=aux;
     }
   }
   
   A[izq]=A[j];                                     
   A[j]=pivote;     
   if(izq < j-1)
      quicksort(A,izq,j-1);       
   if(j+1 < der)
      quicksort(A,j+1,der);         
   
}
     //ejercicio 4  ordenacion 
     /*
      int[] pares = new int[20];

        for (int i = 0; i < 20; i++) {
            pares[i] = (i + 1) * 2;
        }

        for (int i = 0; i < 20; i++) {
            System.out.println("pares[" + i + "] = " + pares[i]);
        }
        public static void seleccion(int A[]) {
          int i, j, menor, pos, tmp;
          for (i = 0; i < A.length - 1; i++) {     
                menor = A[i];                                     
                pos = i;                           
                for (j = i + 1; j < A.length; j++){
                      if (A[j] < menor) {        
                          menor = A[j];          
                          pos = j;
                      }
                }
                if (pos != i){                                
                    tmp = A[i];
                    A[i] = A[pos];
                    A[pos] = tmp;
                }
          }
}

     //ejercicio 4 con comparble 
     /*
        int[] pares = new int[20];

        for (int i = 0; i < 20; i++) {
            pares[i] = (i + 1) * 2;
        }

        for (int i = 0; i < 20; i++) {
            System.out.println("pares[" + i + "] = " + pares[i]);
        }
        public class Empleado{
    private String nif;
    private String nombre;
    private double sueldo;
  
                                                                                     
}
}
     //ejercio 4 con shell
     /*
       int[] pares = new int[20];

        for (int i = 0; i < 20; i++) {
            pares[i] = (i + 1) * 2;
        }

        for (int i = 0; i < 20; i++) {
            System.out.println("pares[" + i + "] = " + pares[i]);
        }
        public static void shell(int A[]) {

        int salto, aux, i;
        boolean cambios;
  
        for (salto = A.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {                                       
                cambios = false;
                for (i = salto; i < A.length; i++) 
                {
                    if (A[i - salto] > A[i]) {       
                        aux = A[i];                  
                        A[i] = A[i - salto];
                        A[i - salto] = aux;
                        cambios = true;            
                }
            }
        }
}
     //ejercio 4 con insercion directa 
     /*
      int[] pares = new int[20];

        for (int i = 0; i < 20; i++) {
            pares[i] = (i + 1) * 2;
        }

        for (int i = 0; i < 20; i++) {
            System.out.println("pares[" + i + "] = " + pares[i]);
        }
         public static void insercionDirecta(int A[]){                                            
    int p, j;
    int aux;
    for (p = 1; p < A.length; p++){ // desde el segundo elemento hasta
              aux = A[p];           // el final, guardamos el elemento y
              j = p - 1;            // empezamos a comprobar con el anterior
              while ((j >= 0) && (aux < A[j])){ // mientras queden posiciones y el                                
                                                // valor de aux sea menor que los
                             A[j + 1] = A[j];   // de la izquierda, se desplaza a
                             j--;               // la derecha
              }
              A[j + 1] = aux;       // colocamos aux en su sitio
    }
}
}
     //ejercio 4 con burbuja 
     /*
        int[] pares = new int[20];

        for (int i = 0; i < 20; i++) {
            pares[i] = (i + 1) * 2;
        }

        for (int i = 0; i < 20; i++) {
            System.out.println("pares[" + i + "] = " + pares[i]);
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

     
     //ejercicio 4 con oenada de arrays
     /*
    int[] pares = new int[20];

        for (int i = 0; i < 20; i++) {
            pares[i] = (i + 1) * 2;
        }

        for (int i = 0; i < 20; i++) {
            System.out.println("pares[" + i + "] = " + pares[i]);
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

    
        //ejercicio 3 con mergesort
        /*
    }
          Scanner scanner = new Scanner(System.in);
    
        System.out.print("Ingrese el numero de alumnos: ");
        int cantAlumnos = scanner.nextInt();

        double[] notas = new double[cantAlumnos];
        for (int i = 0; i < cantAlumnos; i++) {
            System.out.print("Nota del alumno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
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
        public static void mergesort(int A[],int izq, int der){
    if (izq < der){
            int m=(izq+der)/2;
            mergesort(A,izq, m);
            mergesort(A,m+1, der);                                                                                
            merge(A,izq, m, der);                                                                                 
    }
}
}
    //ejercio 3 con quciksort
    /*
          System.out.print("Ingrese el numero de alumnos: ");
        int cantAlumnos = Scanner.nextInt();

        double[] notas = new double[cantAlumnos];
        for (int i = 0; i < cantAlumnos; i++) {
            System.out.print("Nota del alumno " + (i + 1) + ": ");
            notas[i] = Scanner.nextDouble();
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
        public static void quicksort(int A[], int izq, int der) {

  int pivote=A[izq]; // tomamos primer elemento como pivote
  int i=izq;         // i realiza la búsqueda de izquierda a derecha
  int j=der;         // j realiza la búsqueda de derecha a izquierda
  int aux;
 
  while(i < j){                          // mientras no se crucen las búsquedas                                   
     while(A[i] <= pivote && i < j) i++; // busca elemento mayor que pivote
     while(A[j] > pivote) j--;           // busca elemento menor que pivote
     if (i < j) {                        // si no se han cruzado                      
         aux= A[i];                      // los intercambia
         A[i]=A[j];
         A[j]=aux;
     }
   }
   
   A[izq]=A[j];      // se coloca el pivote en su lugar de forma que tendremos                                    
   A[j]=pivote;      // los menores a su izquierda y los mayores a su derecha
   
   if(izq < j-1)
      quicksort(A,izq,j-1);          // ordenamos subarray izquierdo
   if(j+1 < der)
      quicksort(A,j+1,der);          // ordenamos subarray derecho
   
}
}
    //ejercio 3 con ordenacion 
    /*
          System.out.print("Ingrese el numero de alumnos: ");
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
        public static void seleccion(int A[]) {
          int i, j, menor, pos, tmp;
          for (i = 0; i < A.length - 1; i++) {      // tomamos como menor el primero
                menor = A[i];                       // de los elementos que quedan por ordenar                    
                pos = i;                            // y guardamos su posición
                for (j = i + 1; j < A.length; j++){ // buscamos en el resto
                      if (A[j] < menor) {           // del array algún elemento
                          menor = A[j];             // menor que el actual
                          pos = j;
                      }
                }
                if (pos != i){                      // si hay alguno menor se intercambia                         
                    tmp = A[i];
                    A[i] = A[pos];
                    A[pos] = tmp;
                }
          }
}
}
    //ejercio 3 con comparable 
    /*
        System.out.print("Ingrese el numero de alumnos: ");
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
        public class Empleado{
    private String nif;
    private String nombre;
    private double sueldo;
  
        }
}

    //ejercio 3 con shell 
    /*
          System.out.print("Ingrese el numero de alumnos: ");
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
            ublic static void shell(int A[]) {

        int salto, aux, i;
        boolean cambios;
  
        for (salto = A.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {   // Mientras se intercambie algún elemento                                         
                cambios = false;
                for (i = salto; i < A.length; i++)   // se da una pasada
                {
                    if (A[i - salto] > A[i]) {       // y si están desordenados
                        aux = A[i];                  // se reordenan
                        A[i] = A[i - salto];
                        A[i - salto] = aux;
                        cambios = true;              // y se marca como cambio.                                   
                    }
                }
            }
        }
}
}
    
       //ejercicio 3 metodo con insercion directa
        /*
        System.out.print("Ingrese el numero de alumnos: ");
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
             public static void insercionDirecta(int A[]){                                            
    int p, j;
    int aux;
    for (p = 1; p < A.length; p++){ // desde el segundo elemento hasta
              aux = A[p];           // el final, guardamos el elemento y
              j = p - 1;            // empezamos a comprobar con el anterior
              while ((j >= 0) && (aux < A[j])){ // mientras queden posiciones y el                                
                                                // valor de aux sea menor que los
                             A[j + 1] = A[j];   // de la izquierda, se desplaza a
                             j--;               // la derecha
              }
              A[j + 1] = aux;       // colocamos aux en su sitio
    }
}
}
        //ejercio 3 cn burbuja
    
        /*
          System.out.print("Ingrese el numero de alumnos: ");
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
    //ejercico 3 con ordenada de arrays
        /*
        System.out.print("Ingrese el numero de alumnos: ");
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
               System.out.println("Hay " + cantNegativos + " numeros negativos.");
        System.out.print("Son: ");

        for (int a = 0; a <= 9; a++) {
            if (pepe[a] < 0) {
                System.out.print(pepe[a] + " ");
            }
        }
    }
}
    
        //ejercicio 2 con mergesort
        /*
            Scanner scanner = new Scanner(System.in);

      int[] numeros = new int[10];

        System.out.println("Ingrese 10 numeros:");

        for (int i = 0; i <= 9; i++) {
            numeros[i] = scanner.nextInt();
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
    public static void mergesort(int A[],int izq, int der){
    if (izq < der){
            int m=(izq+der)/2;
            mergesort(A,izq, m);
            mergesort(A,m+1, der);                                                                                
            merge(A,izq, m, der);                                                                                 
    }
}
}
        
    //ejercicio 2 con quicksort
        /*
         Scanner scanner = new Scanner(System.in);

      int[] numeros = new int[10];

        System.out.println("Ingrese 10 numeros:");

        for (int i = 0; i <= 9; i++) {
            numeros[i] = scanner.nextInt();
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
public static void quicksort(int A[], int izq, int der) {

  int pivote=A[izq]; // tomamos primer elemento como pivote
  int i=izq;         // i realiza la búsqueda de izquierda a derecha
  int j=der;         // j realiza la búsqueda de derecha a izquierda
  int aux;
 
  while(i < j){                          // mientras no se crucen las búsquedas                                   
     while(A[i] <= pivote && i < j) i++; // busca elemento mayor que pivote
     while(A[j] > pivote) j--;           // busca elemento menor que pivote
     if (i < j) {                        // si no se han cruzado                      
         aux= A[i];                      // los intercambia
         A[i]=A[j];
         A[j]=aux;
     }
   }
   
   A[izq]=A[j];      // se coloca el pivote en su lugar de forma que tendremos                                    
   A[j]=pivote;      // los menores a su izquierda y los mayores a su derecha
   
   if(izq < j-1)
      quicksort(A,izq,j-1);     
   if(j+1 < der)
      quicksort(A,j+1,der);        
   
}
}
    //ejercicio 2 con seleccion
        /*
        Scanner scanner = new Scanner(System.in);

      int[] numeros = new int[10];

        System.out.println("Ingrese 10 numeros:");

        for (int i = 0; i <= 9; i++) {
            numeros[i] = scanner.nextInt();
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

 public static void seleccion(int A[]) {
          int i, j, menor, pos, tmp;
          for (i = 0; i < A.length - 1; i++) {  
                menor = A[i];                                      
                pos = i;                        
                for (j = i + 1; j < A.length; j++){ 
                      if (A[j] < menor) {          
                          menor = A[j];          
                          pos = j;
                      }
                }
                if (pos != i){                                   
                    tmp = A[i];
                    A[i] = A[pos];
                    A[pos] = tmp;
                }
          }

 }
}

    //ejercicio 2 con comparable comparador
        /*
          Scanner scanner = new Scanner(System.in);

      int[] numeros = new int[10];

        System.out.println("Ingrese 10 numeros:");

        for (int i = 0; i <= 9; i++) {
            numeros[i] = scanner.nextInt();
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
}
 

public class Empleado{
    private String nif;
    private String nombre;
    private double sueldo;
                                                                                  
}
    //ejercicio 2 con insercion 
        /*
    }
              Scanner scanner = new Scanner(System.in);

      int[] numeros = new int[10];

        System.out.println("Ingrese 10 numeros:");

        for (int i = 0; i <= 9; i++) {
            numeros[i] = scanner.nextInt();
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

    

//ejercicio 2 usando algoritmo burbuja
    /*
         Scanner scanner = new Scanner(System.in);
      int[] numeros = new int[10];

        System.out.println("Ingrese 10 numeros:");

        for (int i = 0; i <= 9; i++) {
            numeros[i] = scanner.nextInt();
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

/*
   
    //ejercicio 2 usando ordenada de arrays
        /*
            Scanner scanner = new Scanner(System.in);
      int[] numeros = new int[10];

        System.out.println("Ingrese 10 numeros:");

        for (int i = 0; i <= 9; i++) {
            numeros[i] = scanner.nextInt();
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
    
            Arrays.sort(numeros);
        System.out.println("Arreglo ordenado:");
        for (int s : numeros) {
            System.out.println(s);
        }
    }
}


      //ejercio 1 mergesort
        /*
        Scanner scanner = new Scanner(System.in);

        int[] pepe = new int[10];

        System.out.println("Ingrese los numeros del 1 al 10");

        for (int a = 0; a <= 9; a++) {
            pepe[a] = scanner.nextInt();
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
    public static void mergesort(int A[],int izq, int der){
    if (izq < der){
            int m=(izq+der)/2;
            mergesort(A,izq, m);
            mergesort(A,m+1, der);                                                                                
            merge(A,izq, m, der);                                                                                 
    }
    }
}
        
    //ejercicio  1 java quicksort
        /*
         Scanner scanner = new Scanner(System.in);

        int[] pepe = new int[10];

        System.out.println("Ingrese los numeros del 1 al 10");

        for (int a = 0; a <= 9; a++) {
            pepe[a] = scanner.nextInt();
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
    public static void quicksort(int A[], int izq, int der) {

  int pivote=A[izq]; 
  int i=izq;       
  int j=der;       
  int aux;
 
  while(i < j){                                                         
     while(A[i] <= pivote && i < j) i++; 
     while(A[j] > pivote) j--;           
     if (i < j) {                                       
         aux= A[i];                 
         A[i]=A[j];
         A[j]=aux;
     }
   }
   
   A[izq]=A[j];                                   
   A[j]=pivote;    
   
   if(izq < j-1)
      quicksort(A,izq,j-1);       
   if(j+1 < der)
      quicksort(A,j+1,der);         
   
}
}
    //ejercicio 1 metodo de ordenacion a seleccion
        /*
          Scanner scanner = new Scanner(System.in);

        int[] pepe = new int[10];

        System.out.println("Ingrese los numeros del 1 al 10");

        for (int a = 0; a <= 9; a++) {
            pepe[a] = scanner.nextInt();
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
    public static void seleccion(int A[]) {
          int i, j, menor, pos, tmp;
          for (i = 0; i < A.length - 1; i++) {      
                menor = A[i];                                       
                pos = i;                            
                for (j = i + 1; j < A.length; j++){ 
                      if (A[j] < menor) {          
                          menor = A[j];             
                          pos = j;
                      }
                }
                if (pos != i){                                         
                    tmp = A[i];
                    A[i] = A[pos];
                    A[pos] = tmp;
                }
          }
}
}
    
        //ejercicio 1  comparable comparador
    
        /*
          Scanner scanner = new Scanner(System.in);

        int[] pepe = new int[10];

        System.out.println("Ingrese los numeros del 1 al 10");

        for (int a = 0; a <= 9; a++) {
            pepe[a] = scanner.nextInt();
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
    //ejercicio 1 shell de ordenacion
        /*
        Scanner scanner = new Scanner(System.in);

        int[] pepe = new int[10];

        System.out.println("Ingrese los numeros del 1 al 10");

        for (int a = 0; a <= 9; a++) {
            pepe[a] = scanner.nextInt();
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

    public static void shell(int A[]) {

        int salto, aux, i;
        boolean cambios;

        for (salto = A.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {   // Mientras se intercambie algún elemento                                         
                cambios = false;
                for (i = salto; i < A.length; i++) // se da una pasada
                {
                    if (A[i - salto] > A[i]) {       // y si están desordenados
                        aux = A[i];                  // se reordenan
                        A[i] = A[i - salto];
                        A[i - salto] = aux;
                        cambios = true;              // y se marca como cambio.                                   
                    }
                }
            }
        }
    }
}

    
        //ejercicio 1 con ordenada directa
   
        /*
        Scanner scanner = new Scanner(System.in);
        int[] pepe = new int[10];

        System.out.println("Ingrese los numeros del 1 al 10");

        for (int a = 0; a <= 9; a++) {
            pepe[a] = scanner.nextInt();
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

    public static void insercionDirecta(int A[]) {
        int p, j;
        int aux;
        for (p = 1; p < A.length; p++) {
            aux = A[p];
            j = p - 1;
            while ((j >= 0) && (aux < A[j])) {

                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = aux;
        }
    }
}
//ejercicio 1 algoritmo burbuja

/*
        Scanner scanner = new Scanner(System.in);

        int[] pepe = new int[10];

        System.out.println("Ingrese los numeros del 1 al 10");

        for (int a = 0; a <= 9; a++) {
            pepe[a] = scanner.nextInt();
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
    //ejercicio 1 ordenada de arrays
}*/
 /*  int[] pepe = new int[10];

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
 */
