import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTests {
    @Test
    public void addTest() {
        Calculator calculator = new Calculator();
        int result = calculator.add(8,2);
        Assertions.assertEquals(10, result);

        Assertions.tit
    }

    @Test
    public void subTest() {
        Calculator calculator = new Calculator();
        int res = calculator.sub(10,5);
        Assertions.assertEquals(5, res);
    }
}
