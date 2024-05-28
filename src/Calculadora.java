public class Calculadora {

    public static double dividir (int numerador, int divisor) throws DivisionZeroException {
        if(divisor==0)
        {
            throw new DivisionZeroException("No se puede dividir por cero");
        }
        return numerador/divisor;
    }
}
