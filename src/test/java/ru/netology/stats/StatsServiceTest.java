package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test

    void shouldCalculateSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.calculateSum(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        double expected = 15.0;
        double actual = service.calculateAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldFindMaxMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 6;
        int actual = service.findMaxMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldFindMinMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.findMinMonth(sales);

      Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateBelowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.calculateBelowAverage(sales);

       Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAboveAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.calculateAboveAverage(sales);

     Assertions.assertEquals(expected, actual);
    }

}
