package ru.netology.javaqa.JoCoCo1.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.JoCoCo1.services.StatisticService;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticService service = new StatisticService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;
        long actual = service.findMax(incomesInBillions);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxIfOne() {
        StatisticService service = new StatisticService();
        long[] incomesInBillions = {5, 12, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;
        long actual = service.findMax(incomesInBillions);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxIfNear() {
        StatisticService service = new StatisticService();
        long[] incomesInBillions = {5, 5, 8, 4, 12, 12, 8, 6, 11, 11, 3};
        long expected = 12;
        long actual = service.findMax(incomesInBillions);
        Assertions.assertEquals(expected, actual);
    }
}
