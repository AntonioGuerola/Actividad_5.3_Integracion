import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RaizCuadradaTest {

    // Definimos el objeto para usarlo en todos los tests
    static Calculadora1 calculadora1;
    static Calculadora2 calculadora2;
    static Calculadora3 calculadora3;
    static Calculadora4 calculadora4;

    @BeforeAll
    public static void setUpClass(){
        calculadora1 = new Calculadora1();
        calculadora2 = new Calculadora2();
        calculadora3 = new Calculadora3();
        calculadora4 = new Calculadora4();
    }

    @Test
    @DisplayName("Raíz cuadrada enteras")
    void testRaizCuadrada() throws Exception {
        assertEquals(1, calculadora1.raizCuadrada(1));
        assertEquals(0, calculadora2.raizCuadrada(0));
        assertEquals(2, calculadora3.raizCuadrada(4));
        assertEquals(Calculadora4.OperacionInvalidaException, calculadora4.raizCuadrada(-4));
    }
}