/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgelse.pkgif.n.pkg2.jejejejeej;
  import java.util.Scanner;    
/**
 *
 * @author ET20
 */
public class ElseIfN2Jejejejeej {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
           System.out.print("¿Queres una pizza vegana? (si/no): ");
        String respuesta = scanner.nextLine().toLowerCase();

        String ingrediente = "";
        String tipoPizza = "";

        if (respuesta.equals("si")) {
            tipoPizza = "Vegana";
            System.out.println("Ingredientes disponibles: ");
            System.out.println("1. Pimiento");
            System.out.println("2. tofu");
            System.out.print("Elegi un ingrediente (1 o 2): ");
            
            int opcion = scanner.nextInt();
            
            if (opcion == 1) {
                ingrediente = "Pimiento";
            } else if (opcion == 2) {
                ingrediente = "Tofu";
            }

        } else {
            tipoPizza = "No vegana";
            System.out.println("Ingredientes disponibles: ");
            System.out.println("1. Peperoni");
            System.out.println("2. Jamón");
            System.out.println("3. Salmón");
            System.out.print("Elegi un ingrediente (1, 2 o 3): ");
            
            int opcion = scanner.nextInt();
            
            if (opcion == 1) {
                ingrediente = "Peperoni";
            } else if (opcion == 2) {
                ingrediente = "Jamón";
            } else if (opcion == 3) {
                ingrediente = "Salmón";
            }
        }

        System.out.println("Resumen de su pizza");
        System.out.println("Tipo: " + tipoPizza);
        System.out.println("Ingredientes: Mozzarella, Tomate, " + ingrediente);

        scanner.close();
    }
}
         //System.out.print("Ingrese la edad del cliente: ");
        //int edad = scanner.nextInt();

        //if (edad < 4) {
          //  System.out.println("entra gratis.");
        //} else if (edad >= 4 && edad <= 18) {
          //  System.out.println("precio de la entrada es 5€.");
        //} else {
        //    System.out.println("precio de la entrada es 10€.");
      //  }

    //    scanner.close();
  //  }
//}
 // System.out.print("Ingrese su puntuación: ");
      //  double puntuacion = scanner.nextDouble();

       // String nivel;
        
       // if (puntuacion == 0.0) {
         //   nivel = "malo";
       // } else if (puntuacion == 0.4) {
      //      nivel = "bueno";
   //     } else if (puntuacion >= 0.6) {
           // nivel = "excelente";
      //  } else {
           // nivel = "Puntuación no válida";
      //  }

        //if (!nivel.equals("Puntuación no válida")) {
       //     double dinero = 2400 * puntuacion;
           // System.out.println("rendimiento: " + nivel);
           // System.out.println("Dinero recibido: " + dinero + "€");
      //  } else {
           // System.out.println(nivel);
      //  }

      //  scanner.close();
  //  }
//}

      //  System.out.print("Ingresa tu edad: ");
       // int edad = scanner.nextInt();

        //System.out.print("Ingresa tus ingresos: ");
      //  double ingresos = scanner.nextDouble();

      //  if (edad > 16 && ingresos >= 1000) {
          //  System.out.println("Resultado a tributar.");
       // } else {
         //   System.out.println("No se puede tributar.");
    //    }

        //scanner.close();
  //  }
//}
       // System.out.print("Ingrese el primer número: ");
       // double num1 = scanner.nextDouble();

       // System.out.print("Ingrese el segundo número: ");
       // double num2 = scanner.nextDouble();

       // if (num2 == 0) {
           // System.out.println(" no se puede dividir por cero.");
      //  } else {
         //   double resultado = num1 / num2;
          //  System.out.println(" la división es: " + resultado);
      //  }
      //  scanner.close();
   // }
//}
    
     // String contrasenaUsuario = scanner.nextLine();

      //  if (contrasenaGuardada.equalsIgnoreCase(contrasenaUsuario)) {
       //     System.out.println("La contraseña es correcta.");
       // } else {
          //  System.out.println("La contraseña es incorrecta.");
      //  }

       // scanner.close();
   // }
//}
    
       // int Edad  = teclado.nextInt();
       // if (Edad<=18){
     //  System.out.println("sos menor");
   // } else {
           // System.out.println("sos mayor");
           //}
  
   // }
//}


            


