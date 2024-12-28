package ci_cd_github_actions.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExampleControllerTest {

    private ExampleController controller;

    @BeforeEach
    void setUp() {
        controller = new ExampleController();
    }

    @Test
    void divide_100_10() {
        String res = controller.divide(100D, 10D);
        assertEquals("10", res);
    }

    @Test
    void divide_100_null() {
        String res = controller.divide(100D, null);
        assertEquals("NaN", res);
    }

    @Test
    void divide_null_100() {
        String res = controller.divide(100D, null);
        assertEquals("NaN", res);
    }

    @Test
    void divide_100_0() {
        String res = controller.divide(100D, 0D);
        assertEquals("NaN", res);
    }

    @Test
    void divide_0_100() {
        String res = controller.divide(0D, 100D);
        assertEquals("0.0", res);
    }
}