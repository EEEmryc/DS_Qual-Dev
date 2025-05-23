import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatriceTest {

    Calculatrice calc = new Calculatrice();

    @Test
    public void testAdd() {
        assertEquals(7.0f, calc.add(4.0f, 3.0f), 0.0001);
    }

    @Test
    public void testMult() {
        assertEquals(8.0f, calc.mult(2.0f, 4.0f), 0.0001);
    }

    @Test
    public void testDiv() {
        assertEquals(2.0f, calc.div(6.0f, 3.0f), 0.0001);
    }

    @Test
    public void testDivZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calc.div(6.0f, 0.0f);
        });
        assertEquals("Div par O", exception.getMessage());
    }
}
