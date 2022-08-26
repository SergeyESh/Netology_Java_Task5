package ru.netology.sqr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class SQRServiceTest {

    @ParameterizedTest
    @CsvSource ({
            "3, 200, 300",
            "2, 200, 300"
    })

    public void shouldCalculateSqrForRange (int expected, int startRange, int endRange) {
        SQRService service = new SQRService();

        int actual = service.calcCountSqr(startRange, endRange);

        Assertions.assertEquals(expected, actual);
    }

}
