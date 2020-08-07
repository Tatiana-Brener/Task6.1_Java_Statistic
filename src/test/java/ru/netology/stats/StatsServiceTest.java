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
    void shouldCalculateMonthNumMaxSales2() {
//       объявление и инициализация данных метода теста
        int[] salesAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
//        начинаем с первого элемента массива
        int monthNumMaxSales1 = 0;
//        начинаем с шестого элемента массива
        int monthNumMaxSales2 = 6;

//        создание объекта, который описан в классе StatsService
        StatsService service = new StatsService();

//        1.вызваем метод calculateMonthNumberPeakSales у объекта service
//        2.чтобы метод сработал, мы должны передать переменную,
//        в которой будут лежать данные для метода
        int actual = service.calculateMonthNumMaxSales2(salesAmount, monthNumMaxSales1, monthNumMaxSales2);
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMonthNumMinSales () {
        int[] salesAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int monthNumMinSales = 0;

        StatsService service = new StatsService();

        int actual = service.calculateMonthNumMinSales(salesAmount, monthNumMinSales);
        int expected = 9;

        assertEquals(expected, actual);
    }
}