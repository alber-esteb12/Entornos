/**
 * Aqui se realizan las operaciones de la calculadora
 * @author Alberto Esteban
 */
public class Calculadora {

    /**
     * Aqui se realizan las operaciones de suma
     * @param num1 es un numero decimal
     * @param num2 es un numero decimal
     * @return devuelve la suma de los numeros que indica el usuario
     */
    public double sumar(double num1, double num2) {
        return num1 + num2;
    }
    /**
     * Aqui se realizan las operaciones de resta
     * @param num1 es un numero decimal
     * @param num2 es un numero decimal
     * @return devuelve la resta de los numeros que indica el usuario
     */
    public double restar(double num1, double num2) {
        return num1 - num2;
    }
    /**
     * Aqui se realizan las operaciones de multiplicar
     * @param num1 es un numero decimal
     * @param num2 es un numero decimal
     * @return devuelve la multiplicacion de los numeros que indica el usuario
     */
    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }
    /**
     * Aqui se realizan las operaciones de dividir
     * @param num1 es un numero decimal
     * @param num2 es un numero decimal
     * @return devuelve la division de los numeros que indica el usuario
     */
    public double dividir(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        } else {
            return num1 / num2;
        }
    }
}
