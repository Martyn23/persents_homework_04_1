package ru.itpark.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void calculate() {
        BonusService service = new BonusService();
        double[] sales = {12_000, 8_000, 15_000, 8_000};
        double actual = service.calculate(sales);
        assertEquals(350, actual);
    }

    @Test
    void calculateUnderBonusLine() {
        BonusService service = new BonusService();
        double[] sales = {1_000, 8_000, 5_000, 8_000, 9_000};
        double actual = service.calculate(sales);
        assertEquals(0, actual);
    }
    @Test
    void calculateUpperBonusLine() {
        BonusService service = new BonusService();
        double[] sales = {12_000, 18_000, 115_000, 18_000};
        double actual = service.calculate(sales);
        assertEquals(6150, actual);
    }

}