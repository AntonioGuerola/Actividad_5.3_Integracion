import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    // Definimos el objeto para usarlo en todos los tests
    static Calculadora miCalculadora;

    @BeforeAll
    public static void setUpClass(){
        miCalculadora = new Calculadora();
    }

    @Test
    @DisplayName("Suma dos números")
    void testSumar() {
        assertEquals(4, miCalculadora.suma(2,2));
        assertEquals(5, miCalculadora.suma(5,0));
        assertEquals(1, miCalculadora.suma(-5,6));
        assertEquals(34, miCalculadora.suma(28,6));
        assertEquals(-9, miCalculadora.suma(-15,6));
        assertEquals(-17, miCalculadora.suma(-12,-5));
        assertEquals(-21, miCalculadora.suma(-11,-10));
    }

    @Test
    @DisplayName("Resta dos números")
    void testRestar() {
        assertEquals(6, miCalculadora.resta(8,2));
        assertEquals(5, miCalculadora.resta(5,0));
        assertEquals(-10, miCalculadora.resta(-4,6));
        assertEquals(12, miCalculadora.resta(15,3));
        assertEquals(16, miCalculadora.resta(10,-6));
        assertEquals(-16, miCalculadora.resta(-6,10));
        assertEquals(-11, miCalculadora.resta(-16,-5));
        assertEquals(-7, miCalculadora.resta(-19,-12));
    }

    @Test
    @DisplayName("Multiplica dos números")
    void testMultiplicar() {
        assertEquals(16, miCalculadora.multiplica(8,2));
        assertEquals(0, miCalculadora.multiplica(5,0));
        assertEquals(0, miCalculadora.multiplica(-3,0));
        assertEquals(-24, miCalculadora.multiplica(-4,6));
        assertEquals(45, miCalculadora.multiplica(15,3));
        assertEquals(-60, miCalculadora.multiplica(10,-6));
        assertEquals(-60, miCalculadora.multiplica(-6,10));
        assertEquals(80, miCalculadora.multiplica(-16,-5));
        assertEquals(228, miCalculadora.multiplica(-19,-12));
    }

    @Test
    @DisplayName("Divisiones enteras y reales")
    void testDivisionesEnterasYReales() throws Exception {
        assertEquals(2, miCalculadora.divide(4,2));
        assertEquals(2.5, miCalculadora.divide(10,4));
        assertEquals(4, miCalculadora.divide(10,2.5));
        assertEquals(3.2, miCalculadora.divide(8,2.5));
        assertEquals(0.5, miCalculadora.divide(2,4));
    }

    @Test
    @DisplayName("Divisiones positivos y negativos")
    void testDivisionesPositivosYNegativos() throws Exception {
        assertTrue(miCalculadora.divide(4,2) > 0);
        assertTrue(miCalculadora.divide(4,-2)< 0);
        assertTrue(miCalculadora.divide(-4,2) < 0);
        assertTrue(miCalculadora.divide(-4,-2) > 0);
    }

    @Test
    @DisplayName("División por cero causa excepción")
    void testDivisionPorCero() {
        Exception thrown = assertThrows(Exception.class, () -> {
            miCalculadora.divide(5,0);
        });

        assertEquals("El divisor es 0", thrown.getMessage());
    }

    @Test
    @DisplayName("Potencias de número enteros y reales")
    void testPotencias() throws Exception {
        assertEquals(16, miCalculadora.potencia(4,2));
        assertEquals(10000, miCalculadora.potencia(10,4));
        assertEquals(6.25, miCalculadora.potencia(2.5,2));
        assertEquals(6.25, miCalculadora.divide(10,1.6));
        assertEquals(0.375, miCalculadora.divide(1.5,4));
    }
}