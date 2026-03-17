package hiloslm;

// Clase que tiene el contador compartido
class Contador {

    private int valor = 0;   // variable contador

    // método para incrementar el contador
    public synchronized int incrementar() {
        valor++;             // suma 1
        return valor;        // devuelve el nuevo valor
    }
}


// Tarea que ejecutarán los hilos
class MiRunnable implements Runnable {

    private String[] datos;   // arreglo de datos (colores o comidas)
    private Contador contador; // referencia al contador compartido

    // constructor
    public MiRunnable(String[] datos, Contador contador) {
        this.datos = datos;
        this.contador = contador;
    }

    @Override
    public void run() {

        for (String dato : datos) {   // recorre los datos

            int numero = contador.incrementar(); // aumenta el contador

            System.out.println(numero + " - " + dato); // muestra contador + dato

            try {
                Thread.sleep(1000);   // pausa de 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}


public class Hiloslm {

    public static void main(String[] args) {

        Contador contador = new Contador();  // contador compartido

        String[] colores = {"Rojo", "Azul", "Verde"};
        String[] comidas = {"Pizza", "Pasta", "Hamburguesa"};

        // dos hilos con datos distintos
        Thread hilo1 = new Thread(new MiRunnable(colores, contador));
        Thread hilo2 = new Thread(new MiRunnable(comidas, contador));

        hilo1.start();
        hilo2.start();

    }
}