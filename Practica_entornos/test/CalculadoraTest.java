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
}