package ru.netology.stats;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSum() {
        int[] salesAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        int actual = service.calculateSum(salesAmount);
        int expected = 180;
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverage() {
        int[] salesAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        int actual = service.calculateAverage(salesAmount);
        int expected = 15;
        assertEquals(expected, actual);
    }

    @Test
//    объявление теста - метод, кот ничего не возвращает и не принимает на вход
    void shouldCalculateMonthNumMaxSales() {
//       объявление и инициализация данных метода теста
        int[] salesAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

//        создание объекта, который описан в классе StatsService
        StatsService service = new StatsService();

//        1.вызваем метод calculateMonthNumMaxSales у объекта service
//        2.чтобы метод сработал, мы должны передать переменную,
//        в которой будут лежать данные для метода
        int actual = service.calculateMonthNumMaxSales(salesAmount);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMonthNumMinSales() {
        int[] salesAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        int actual = service.calculateMonthNumMinSales(salesAmount);
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMonthsUnderAverageSalesAmount() {
        int[] salesAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        int actual = service.calculateMonthsUnderAverageSalesAmount(salesAmount);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMonthsOverAverageSalesAmount() {
        int[] salesAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        int actual = service.calculateMonthsOverAverageSalesAmount(salesAmount);
        int expected = 5;
        assertEquals(expected, actual);
    }
}


