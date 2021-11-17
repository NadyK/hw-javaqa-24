package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    void shouldCalculate() {
        SQRService service = new SQRService();
        int lower = 40;
        int upper = 90;
        int expected = 0;
        int actual = service.sqrCalculate(lower, upper);
        assertEquals(expected, actual);
    }
}