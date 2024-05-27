package ejemplo3;

public class mainEjemplo3 {
    public static void main(String[] args) {
        int numerador=10;
        int divisor=0;
        double resultado;

        Calculadora calculadora = new Calculadora();
        try {
            resultado = numerador/divisor;
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());;
        }finally {
            System.out.println("cerrar base de datos");
        }
    }
}
