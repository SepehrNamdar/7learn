package kata.summation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SummationTest {

    @Test
    void should_return_3_when_num_is_2() {
        int num = 2;

        int result = summation(num);

        assertEquals(3, result);
    }

    @Test
    void should_return_36_when_num_is_8() {
        int num = 8;

        int result = summation(num);

        assertEquals(36, result);
    }

    @Test
    void should_return_0_when_num_is_zero() {
        int num = 0;

        int result = summation(num);

        assertEquals(0, result);
    }

    private int summation(int num) {
        int sum = 0;
        for (int neshaneGar = 1; neshaneGar <= num; neshaneGar++) {
            sum = sum + neshaneGar;
        }
        return sum;
    }
}
