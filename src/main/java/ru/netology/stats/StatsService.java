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
        int average = 0;
        int sum = 0;

        for (int item : salesAmount) {
            sum += item;
            average = sum / salesAmount.length;
        }
        return average;
    }

    // объявление метода
    public int calculateMonthNumMaxSales2(int[] salesAmount, int monthNumMaxSales1, int monthNumMaxSales2) {

//        берем за точку отсчета первый элемент массива
        int maxMonthlySales1 = salesAmount[0];

//        int arrayItem - тип переменной и имя переменной
//        salesAmount - элементы, по которым собираемся ходить
//        перебрать переменой arrayItem все значения, что лежат
//        в массиве salesAmount и для каждого значения выполнить код в {}
        for (int arrayItem : salesAmount) {
            if (maxMonthlySales1 <= arrayItem) {
                maxMonthlySales1 = arrayItem;

                monthNumMaxSales1 = monthNumMaxSales1 + 1;
            }
        }

        int maxMonthlySales2 = salesAmount[monthNumMaxSales1];

        for (int arrayItem : salesAmount) {
            if (maxMonthlySales2 <= arrayItem) {
                maxMonthlySales2 = arrayItem;

                monthNumMaxSales2 = monthNumMaxSales2 + 1;
            }
        }
        return monthNumMaxSales2;
    }

    public int calculateMonthNumMinSales(int[] salesAmount, int monthNumMinSales) {

        int minMonthlySales = salesAmount[0];

        for (int arrayItem : salesAmount) {

            if (minMonthlySales <= arrayItem) {
                minMonthlySales = minMonthlySales;
                monthNumMinSales = monthNumMinSales + 1;

            }
            if (minMonthlySales >= arrayItem) {
                minMonthlySales = arrayItem;
                monthNumMinSales = monthNumMinSales + 1;
            }
//            else  {
//                minMonthlySales = arrayItem;
//                monthNumMinSales = monthNumMinSales + 1;
//            }

        }
        return monthNumMinSales;
    }

}



