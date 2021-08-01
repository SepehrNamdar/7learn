package kata.sumArrays;

import org.junit.jupiter.api.Test;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumArraysTest {

    @Test
    void if_array_is_empty_then_return_zero() {
        double[] numbers = {};

        double result = sumArrays(numbers);

        assertEquals(0, result);
    }

    @Test
    void if_array_contains_a_number_then_return_number() {
        double[] numbers = {-2.398};

        double result = sumArrays(numbers);

        assertEquals(-2.398, result);
    }

    @Test
    void should_return_sum_of_number_arrays() {
        double[] numbers = {1, 5.2, 4, 0, -1};

        double result = sumArrays(numbers);

        assertEquals(9.2, result);
    }

    private double sumArrays(double[] numbers) {
        if (numbers.length == 0) {
            return 0;
        } else if (numbers.length == 1) {
            return numbers[0];
        } else {
            int index = 0;
            double sum = 0;
            while (index < numbers.length) {
                out.println("Index is : " + index);
                out.println("The value of array is : " + numbers[index]);
                sum = sum + numbers[index];
                out.println("Sum is : " + sum);
                index++;
            }
            return sum;
        }
    }
}
