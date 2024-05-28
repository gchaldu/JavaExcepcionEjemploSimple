import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Integer numerador = 10;
        Integer divisor = 0;
        double resultado;
//        resultado = numerador/divisor;
//        System.out.println("resultado = " + resultado);

//        try{
//            resultado = numerador/divisor;
//            System.out.println("resultado = " + resultado);
//        }catch (ArithmeticException arithmeticException){
//            System.out.println("arithmeticException: " + arithmeticException.getMessage());
//        }
//        System.out.println("No interrumpo la ejeccución del programa ");
       try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("ingrese el numero 1");
            numerador = scanner.nextInt();
            System.out.println("ingrese el numero 2");
            divisor = scanner.nextInt();
            resultado = Calculadora.dividir(numerador, divisor);
            System.out.println(resultado);
        }catch (ArithmeticException ae) {
            System.out.println("Error " + ae.getMessage());
        }catch (DivisionZeroException ea) {
            System.out.println(ea.getMessage());
            ea.printStackTrace();
        }finally {
            System.out.println("cerrar base de datos");
        }

        System.out.println("Sigue la normal ejecucion de mi codigo");
    }
}