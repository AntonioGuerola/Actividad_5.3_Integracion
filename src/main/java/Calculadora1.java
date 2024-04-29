public class Calculadora1 {
    double raizCuadrada(double radicando){
        double resultado;
        if (radicando == 1){
            resultado = 1;
        }else{
            resultado = Math.sqrt(radicando);
        }
        return resultado;
    }
}
