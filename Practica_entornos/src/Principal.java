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

            switch (opcion) {
                /**
                 * En este switch haremos que dependiendo del numero que introduzca
                 * el usuario se ejecute un caso u otro
                 *
                 * @param case cuando intriduzcan el numero que le hemos dado se
                 *             ejecutara esa opcion
                 * @param break termina el bucle
                 */
                case 1:
                    System.out.print("Introduce el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Introduce el segundo número: ");
                    num2 = scanner.nextDouble();
                    resultado = calculadora.sumar(num1, num2);
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case 2:
                    System.out.print("Introduce el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Introduce el segundo número: ");
                    num2 = scanner.nextDouble();
                    resultado = calculadora.restar(num1, num2);
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                case 3:
                    System.out.print("Introduce el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Introduce el segundo número: ");
                    num2 = scanner.nextDouble();
                    resultado = calculadora.multiplicar(num1, num2);
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    break;
                case 4:
                    System.out.print("Introduce el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Introduce el segundo número: ");
                    num2 = scanner.nextDouble();
                    resultado = calculadora.dividir(num1, num2);
                    System.out.println("El resultado de la división es: " + resultado);
                    break;
                case 0:
                    System.out.println("Saliendo de la calculadora.");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
                    break;
            }

        }while (opcion != 0);
    }
}