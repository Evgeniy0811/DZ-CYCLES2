package ru.netology.stats;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {
    int[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    @DisplayName("Total sum sales")
    void totalSumSale() {
        StatsService service = new StatsService();
        int expected = 180;
        int actual = service.totalSumSale(salesData);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Average sales per month")
    void averageMonthSales() {
        StatsService service = new StatsService();
        int expected = 15;
        int actual = service.averageMonthSales(salesData);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Month number with maximum sales")
    void monthWithMaxSale() {
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.monthWithMaxSale(salesData);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Month number with minimum sales")
    void monthWithMinSale() {
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.monthWithMinSale(salesData);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Number of months with sales below average")
    void salesBelowAverage() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.salesBelowAverage(salesData);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Number of months with sales above average")
    void salesAboveAverage() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.salesAboveAverage(salesData);
        assertEquals(expected, actual);
    }
}
