/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colorada;

import java.util.Scanner;

/**
 *
 * @author ET20
 */
public class Colorada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // EJERCICIO CON FOR
         for (int tabla = 1; tabla <= 10; tabla++) {
            System.out.println("Tabla del " + tabla);
            System.out.println("----------------");
            for (int i = 1; i <= 10; i++) {
                System.out.println(tabla + " x " + i + " = " + (tabla * i));
        }
            System.out.println();
        }
    }
}
        //EJERCICIO CON DO WHILE
          //int tabla = 1;

        //do {
           // System.out.println("Tabla del " + tabla);
           // System.out.println("----------------");
            //int i = 1;
            //do {
             //   System.out.println(tabla + " x " + i + " = " + (tabla * i));
            //    i++;
          //  } while (i <= 10);
        //    System.out.println();
      //      tabla++;
    //    } while (tabla <= 10);
  //  }
//}
        //EJERCICIO 5 CON WHILE
         //int tabla = 1;

        //while (tabla <= 10) {
            //System.out.println("Tabla del " + tabla);
            //System.out.println("----------------");
            //int i = 1;
            //while (i <= 10) {
              //  System.out.println(tabla + " x " + i + " = " + (tabla * i));
            //    i++;
          //  }
        //    System.out.println();
      //      tabla++;
    //    }
  //  }
//}
        //ejercicio con FOR
       // for (int i = 100; i >= 0; i -= 23) {
           // System.out.println(i);
      //  }
   // }
//}
        //EJERCICIO DO WHILE 
          // int i = 100;

      //  do {
          //  System.out.println(i);
          //  i -= 23;
     //   } while (i >= 0);
   // }
        //EJERCICIO 4 CON WHILE
              //  int i = 100;
       /// while (i >= 0) {
           // System.out.println(i);
        //    i -= 23;
    //    }
  //  }
//}

        //EJERCICIO CON FOR
       //  System.out.print("Pago inicial (€): ");
       // double pagoInicial = sc.nextDouble();
       // System.out.print("Número de meses: ");
       // int meses = sc.nextInt();

    //    double pago = pagoInicial;
       // double total = 0;

       // for (int mes = 1; mes <= meses; mes++) {
       //     System.out.println("Mes " + mes + ": " + pago + " €");
         //   total += pago;
       //     pago *= 2;
       // }

      //  System.out.println("Total a pagar: " + total + " €");
      //  sc.close();
  //  }
//}
        //EJERCICIO CON DO WHILE
         //  System.out.print("Pago inicial (€): ");
       // double pagoInicial = sc.nextDouble();
     //   System.out.print("Número de meses: ");
      //  int meses = sc.nextInt();

      //  double pago = pagoInicial;
       // double total = 0;
    //    int mes = 1;

     //   do {
         //   System.out.println("Mes " + mes + ": " + pago + " €");
          //  total += pago;
          //  pago *= 2;
       //     mes++;
       // } while (mes <= meses);

        //System.out.println("Total a pagar: " + total + " €");
      //  sc.close();
   // }
//}
//EJERCICIO 3 CON WHILE
           // System.out.print("Pago inicial (€): ");
       // double pagoInicial = sc.nextDouble();
       // System.out.print("Número de meses: ");
        //int meses = sc.nextInt();

       // double pago = pagoInicial;
       // double total = 0;
      //  int mes = 1;

       // while (mes <= meses) {
            //System.out.println("Mes " + mes + ": " + pago + " €");
           // total += pago;
         //   pago *= 2;
           // mes++;
      //  }

       // System.out.println("Total a pagar: " + total + " €");
      //  sc.close();
    //}
   // }
        //EJERCICO CON FOR
      //System.out.print("Base (real): ");
      //  double base = sc.nextDouble();
       // System.out.print("Exponente (entero positivo): ");
      //  int exponente = sc.nextInt();

       // double resultado = 1;

       // for (int i = 0; i < exponente; i++) {
          //  resultado *= base;
     //   }

        //System.out.println("Resultado: " + resultado);
       // sc.close();
 //   }
//}
        //EJERCICIO CON DO WHILE
     //    System.out.print("Base (real): ");
      //  double base = sc.nextDouble();
       // System.out.print("Exponente (entero positivo): ");
     //   int exponente = sc.nextInt();

      //  double resultado = 1;
      //  int i = 0;

        //if (exponente > 0) {
          //  do {
            //    resultado *= base;
           //     i++;
           // } while (i < exponente);
       // }

       // System.out.println("Resultado: " + resultado);
       // sc.close();
    //}
//}
        //EJERCICIO 2 CON WHILE 
       //  System.out.print("Base (real): ");
       // double base = sc.nextDouble();
       // System.out.print("Exponente (entero positivo): ");
       // int exponente = sc.nextInt();

      //  double resultado = 1;
      //  int i = 0;

     //   while (i < exponente) {
      //      resultado *= base;
       //     i++;
     //   }

       // System.out.println("Resultado: " + resultado);
        //sc.close();
   // }
//}
        //EJERCICO CON FOR
      //           String linea = sc.nextLine();

     //   for (int i = 0; i < linea.length() && linea.charAt(i) != ' '; i++) {
          //  char c = Character.toLowerCase(linea.charAt(i));
        //    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
             //   System.out.println("VOCAL");
          //  } else {
            //    System.out.println("NO VOCAL");
 //   }
//}
        //EJERCICIO CON DO WHILE
        //  String linea = sc.nextLine();
      //  int i = 0;

      //  if (linea.length() > 0 && linea.charAt(0) != ' ') {
           // do {
              //  char c = Character.toLowerCase(linea.charAt(i));
              //  if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
               //     System.out.println("VOCAL");
               // } else {
                //   System.out.println("NO VOCAL");
             //   }
             //   i++;
        //    } while (i < linea.length() && linea.charAt(i) != ' ');
     //   }

      
        //EJERCICO WHILE 2 
        
    // String linea = sc.nextLine();
    //    int i = 0;

     //   while (i < linea.length() && linea.charAt(i) != ' ') {
          //  char c = Character.toLowerCase(linea.charAt(i));
         //   if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
             //   System.out.println("VOCAL");
           // } else {
             //   System.out.println("NO VOCAL");
        //    }
          //  i++;
      //  }

       //   double millas, km;

        //for (;;) { 
           // System.out.print("Ingresa millas (0 para salir): ");
           // millas = sc.nextDouble();

        //    if (millas == 0) {
              //  break;
         // }

           // km = millas * 1.6093;
            //System.out.printf("Equivale a: %.2f\n", km);
      // }

      //  System.out.println("Programa finalizado.");
 //   }
//}
 //ejercicio do while        
//  double millas, km;

        //do {
            //System.out.print("Ingrese millas (0 para salir): ");
            //millas = sc.nextDouble();

           // if (millas != 0) {
          //      km = millas * 1.6093;
        //        System.out.printf("Equivalente en KM: %.2f\n", km);
      //      }

    //    } while (millas != 0);

  //      System.out.println("Programa finalizado.");
   // }
//}
       //ejercicio 7
      //  double millas;

        //System.out.print("Ingrese millas (o ingrese 0 para salir): ");
        //millas = sc.nextDouble();

     //   while (millas != 0) {
       //     double km = millas * 1.6093;
         //   System.out.printf("Kilometros: %.2f\n", km);

           // System.out.print("Ingrese millas (o ingrese 0 para salir): ");
            //millas = sc.nextDouble(); 
        //}

        //System.out.println("Fin del programa");
    //}
//}
        
  //     int N, M;

//do {
  //  N = sc.nextInt();
  //  M = sc.nextInt();
//} while (N <= 0 || M <= 0 || N >= M);

//int i = 1;

//if (i <= M) {
    //do {
       // if (i % N == 0)
      //      System.out.println(i);
    //    i++;
  //  } while (i <= M);
//}
    //}
    //}
      //ejecicio con for
    
    //   int num1 =sc.nextInt();
  //     int num2= sc.nextInt();
//while (num1 <= 0 || num2 <= 0) {
    //num1 = sc.nextInt();
  //  num2 = sc.nextInt();
//}

//while (num1 >= num2) {
    //num1 = sc.nextInt();
  //  num2 = sc.nextInt();
//}

//for (int i = 1; i <= num2; i++) {
    //if (i % num1 == 0)
  //      System.out.println(i);
//}
  //  }
//}
//ejercicio numero 6 con while  
       //int num1 = sc.nextInt();
//int num2 = sc.nextInt();

//while (num1 <= 0 || num2 <= 0) {
  //  num1 = sc.nextInt();
    //num2 = sc.nextInt();
//}

//while (num1 >= num2) {
    
    //num1 = sc.nextInt();
  //  num2 = sc.nextInt();
//}

//int i = 1;
//while (i <= num2) {
  //  if (i % num1 == 0)
    //    System.out.println(i);
    //i++;
//}
    //}
//}
    
       //jercicio con for
            // int a = 0, b = 0;

      //  for (; a == b;) {
          //  a = sc.nextInt();
         //   b = sc.nextInt();
           // if (a == b) {
           //     System.out.println("Son iguales, ingrese de nuevo");
         //  }
      //  }

       // int menor = (a < b) ? a : b;
        //int mayor = (a > b) ? a : b;

       //for (int i = menor; i <= mayor; i++) {
         //  System.out.println(i);
        //}
    //}
    //}
       
    //ejercicio con while
        //int a = 0, b = 0;

    //    while (a == b) {
          //  a = sc.nextInt();
          //  b = sc.nextInt();
         //   if (a == b) {
             //   System.out.println("Son iguales, ingrese de nuevo");
          //  }
      //  }

      //  int menor = (a < b) ? a : b;
       // int mayor = (a > b) ? a : b;

      //  int i = menor;
     //   while (i <= mayor) {
          //  System.out.println(i);
         //   i++;
       // }
    //}
//}
       //ejercicio 4 con do while
   //int a, b;

      //  do {
         //   a = sc.nextInt();
           // b = sc.nextInt();
      //  } while (a == b);

       // int menor = a < b ? a : b;
       // int mayor = a > b ? a : b;

     //   for (int i = menor; i <= mayor; i++) {
          //  System.out.println(i);
      //  }
  //  }
//}
       // Scanner Scanner = new Scanner(System.in);
        
       //con do while
       //    int N = sc.nextInt();

      //  do {
         //   System.out.println(N);
        //    N--;
     //   } while (N >= 1);
  //  }
//}
 //con while
        //int N = sc.nextInt();

      //  while (N >= 1) {
           // System.out.println(N);
          //  N--;
     //   }
    //}
//}
       
       //ejercicio 3
      //  int N = sc.nextInt();

      //  for (int i = N; i >= 1; i--) {
           // System.out.println(i);
       // }
    //}
//}
        
  //con while      
 //System.out.print("Ingrese un número: ");
   //     int N = sc.nextInt();

     //   int i = 1;
       // while (i <= N) {
         //   System.out.println(i);
          //  i++;
        //}
    //}
//}



//ejercicio con for
             //System.out.print("Ingrese un número: ");
        //int N = sc.nextInt();

        //for (int i = 1; i <= N; i++) {
      //      System.out.println(i);
    //    }
  //  }
//}
//ejercicio 2
        //System.out.print("Ingrese un número: ");
        //int N = sc.nextInt();

        //int i = 1;
        //do {
        //    System.out.println(i);
      //      i++;
    //    } while (i <= N);
  //  }
//}
    

  //ejercicio con do while
//int c = 1;
//do {
//System.out.println(c); c++;
//}
//while ( c <=100 );


 //ejercicio con while
//int b = 1;
   //while(b <= 100){
       //System.out.println(b);
     //  b++;}
               
       
 //ejercicio 1
  // for(int a=1;a<=100;a++){
 // System.out.println(a);
   
   
   
    

    

