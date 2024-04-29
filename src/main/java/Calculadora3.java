public class Calculadora3 {
    double raizCuadrada(double radicando){
        double resultado;
        if (radicando == 1){
            resultado = 1;
        }else if (radicando == 0){
            resultado = 0;
        }else{
            resultado = Math.sqrt(radicando);
        }
        return resultado;
    }
}
