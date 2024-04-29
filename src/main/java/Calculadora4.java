public class Calculadora4 {
    public static short OperacionInvalidaException;

    double raizCuadrada(double radicando) {
        double resultado = 0;
        if (radicando == 1){
            resultado = 1;
        }else if (radicando == 0){
            resultado = 0;
        }else if (radicando < 0){
            new OperacionInvalidaException("El radicando no puede ser negativo");
        }else{
            resultado = Math.sqrt(radicando);
        }
        return resultado;
    }

    public class OperacionInvalidaException extends Throwable {

        public OperacionInvalidaException(String mensaje) {
        }
    }
}