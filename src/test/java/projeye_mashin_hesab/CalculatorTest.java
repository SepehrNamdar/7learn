package projeye_mashin_hesab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// mashin hesab
public class CalculatorTest {

    @Test
    void should_add_numbers() {
        // Given
        int number_1 = 2;
        int number_2 = 5;

        // When
        int result = add(number_1, number_2);

        // Then
        assertEquals(7, result);
    }

    @Test
    void should_multiple_numbers() {
        // Given
        int number_1 = 3;
        int number_2 = 4;

        // When
        int result = multiple(number_1, number_2);

        // Then
        assertEquals(12, result);
    }

    private int multiple(int number_1, int number_2) {
        return number_1 * number_2;
    }

    private int add(int number_1, int number_2) {
        int result = number_1 + number_2;
        return result;
    }
}
