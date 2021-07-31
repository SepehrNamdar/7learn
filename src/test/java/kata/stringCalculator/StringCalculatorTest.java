package kata.stringCalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {

    @Test
    void should_return_zero_when_numbers_is_empty() {
        String numbers = "";

        int result = add(numbers);

        assertEquals(0, result);
    }

    @Test
    void should_return_the_number_if_any_commas() {
        String numbers = "1";

        int result = add(numbers);

        assertEquals(1, result);
    }

    @Test
    void should_add_two_numbers() {
        String numbers = "1,2";

        int result = add(numbers);

        assertEquals(3, result);
    }

    private int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        if (! numbers.contains(",")) {
            return Integer.valueOf(numbers);
        }
        String[] split = numbers.split(",");    // ["1"] ["2"]
        int sum = Integer.valueOf(split[0]) + Integer.valueOf(split[1]);
        return sum;
    }
}
