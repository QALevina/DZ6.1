package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/SQRService.csv")
    public void testScriptsForSQRService(int miniRangeLimit, int maxiRangeLimit, int expected) {
        SQRService service = new SQRService();
        int actual = service.squareRootOfTheRange(miniRangeLimit, maxiRangeLimit);
        Assertions.assertEquals(expected, actual);
    }

}


