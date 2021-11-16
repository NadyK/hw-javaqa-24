package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
@Test
    void shouldCalculate(){
        SQRService service = new SQRService();
        int lower = 500;
        int upper = 600;
        int expected = 2;
        int actual = service.sqrCalculate(lower, upper);
        assertEquals(expected, actual);
}
}