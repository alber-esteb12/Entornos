import java.util.Scanner;
/**
 * Aqui esta el menu con el que el usuario interactua
 * @author Alberto Esteban
 */
public class Principal {

    public static void main(String[] args) {
        /**
         * Aqui se muestra el menu con el que el usuario seleccionara la operacion
         * y dara los numeros para ello
         *
         * @param int es un numero entero
         * @param double es un numero decimal
         */
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        int opcion;
        double num1, num2, resultado;

        do {
            /**
             * En este bucle tenemos el menu con las distintas opciones que el
             * usuario puede elegir
             */
            System.out.println("Calculadora:");
            System.out.println("1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("3.- Multiplicar");
            System.out.println("4.- Dividir");
            System.out.println("0.- Salir");
            System.out.print("¿Qué opción quieres realizar?: ");
            opcion = scanner.nextInt();
        }while (opcion != 0);
    }
}