package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] salesAmount) {
        int sum = 0;

        for (int item : salesAmount) {
            sum += item;
        }
        return sum;
    }


    public int calculateAverage(int[] salesAmount) {
        return calculateSum(salesAmount) / salesAmount.length;
    }


    // объявление метода
    public int calculateMonthNumMaxSales(int[] salesAmount) {

//        берем за точку отсчета первый элемент массива
        int maxMonthlySales = salesAmount[0];
        int monthNumMaxSales = 0;
        int count = 0;

//        int item - тип переменной и имя переменной
//        salesAmount - элементы, по которым собираемся ходить
//        перебрать переменой item все значения, что лежат
//        в массиве salesAmount и для каждого значения выполнить код в {}
        for (int item : salesAmount) {
            count++;
            if (maxMonthlySales <= item) {
                maxMonthlySales = item;
                monthNumMaxSales = count;
            }
        }
        return monthNumMaxSales;
    }

    public int calculateMonthNumMinSales(int[] salesAmount) {
        int minMonthlySales = salesAmount[0];
        int monthNumMinSales = 0;
        int count = 0;

        for (int item : salesAmount) {
            count++;
            if (minMonthlySales >= item) {
                minMonthlySales = item;
                monthNumMinSales = count;
            }
        }
        return monthNumMinSales;
    }

    public int calculateMonthsUnderAverageSalesAmount(int[] salesAmount) {
        int salesAverage = calculateAverage(salesAmount);
        int monthsNumUnderAverageSales = 0;
        int count = 0;

        for (int item : salesAmount) {
            if (salesAverage > item) {
                count++;
                monthsNumUnderAverageSales = count;
            }
        }
        return monthsNumUnderAverageSales;
    }

    public int calculateMonthsOverAverageSalesAmount(int[] salesAmount) {
        int salesAverage = calculateAverage(salesAmount);
        int monthsNumOverAverageSales = 0;
        int count = 0;

        for (int item : salesAmount) {
            if (salesAverage > item) {
                count++;
                monthsNumOverAverageSales = count;
            }
        }
        return monthsNumOverAverageSales;
    }
}






