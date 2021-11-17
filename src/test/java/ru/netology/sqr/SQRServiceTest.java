package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    // Диапазон за пределами значений квадратов
    void shouldCalculate1() {
        SQRService service = new SQRService();
        int lower = 40;
        int upper = 90;
        int expected = 0;
        int actual = service.sqrCalculate(lower, upper);
        assertEquals(expected, actual);
    }

    @Test
        // Диапазон в середине значений квадратов
    void shouldCalculate2() {
        SQRService service = new SQRService();
        int lower = 350;
        int upper = 450;
        int expected = 3;
        int actual = service.sqrCalculate(lower, upper);
        assertEquals(expected, actual);
    }
    @Test
        // Граничные значения диапазона
    void shouldCalculate3() {
        SQRService service = new SQRService();
        int lower = 100;
        int upper = 9801;
        int expected = 90;
        int actual = service.sqrCalculate(lower, upper);
        assertEquals(expected, actual);
    }
    @Test
        // Одинаковое значение нижней и верхней границ диапазона
    void shouldCalculate4() {
        SQRService service = new SQRService();
        int lower = 500;
        int upper = 500;
        int expected = 0;
        int actual = service.sqrCalculate(lower, upper);
        assertEquals(expected, actual);
    }
}