import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void sumar() {
        assertAll(
                () -> {
                    assertEquals(3, 1 + 2);
                    assertEquals(2, 1 + 1);
                    assertEquals(4, 2 + 2);
                }
        );
    }

    @Test
    void restar() {
        assertAll(
                () -> {
                    assertEquals(1,2-1);
                    assertEquals(0,1-1);
                    assertEquals(2,4-2);
                }
        );
    }

    @Test
    void multiplicar() {
        assertAll(
                () -> {
                    assertEquals(2,1*2);
                    assertEquals(1,1*1);
                    assertEquals(8,4*2);
                }
        );
    }

    @Test
    void dividir() {
        assertAll(
                () -> {
                    assertEquals(2,2/1);
                    assertEquals(4,8/2);
                    assertEquals(8,16/2);
                }
        );
    }
}