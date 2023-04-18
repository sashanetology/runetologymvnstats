package ru.netology.stats.runetologymvnstats.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class StatsServiceTest {

    @Test
    public void findSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 180;
        long actualSum = service.sum(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void findAverageSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expectedAverageSale = 15;
        double actualAverageSale = service.averageSale(sales);
        Assertions.assertEquals(expectedAverageSale, actualAverageSale);
    }

    @Test
    public void findMaxMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxMonth = 8;
        int actualMaxMonth = service.maxSales(sales);
        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void findMinMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinMonth = 9;
        int actualMinMonth = service.minSales(sales);
        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void lowSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedLowMonths = 5;
        int actualLowMonths = service.lowSales(sales);
        Assertions.assertEquals(expectedLowMonths, actualLowMonths);
    }

    @Test
    public void highSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedHighMonths = 5;
        int actualHighMonths = service.highSales(sales);
        Assertions.assertEquals(expectedHighMonths, actualHighMonths);
    }
}