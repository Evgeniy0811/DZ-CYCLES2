package ru.netology.stats;

public class StatsService {
    /* 1. Сумма всех продаж */
    public int totalSumSale(int[] salesData) {
        int totalSum = 0;
        for (int sale : salesData) {
            totalSum += sale;
        }
        return totalSum;
    }

    /* 2. Средняя сумма продаж в месяц */
    public int averageMonthSales(int[] salesData) {
        int totalSum = totalSumSale(salesData);
        return totalSum / salesData.length;
    }

    /* 3. Номер месяца, в котором был пик продаж */
    public int monthWithMaxSale(int[] salesData) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : salesData) {
            if (sale >= salesData[maxMonth]) {
                maxMonth = month;
            }
            month += 1;
        }
        return maxMonth + 1;
    }

    /* 4. Номер месяца, в котором был минимум продаж */
    public int monthWithMinSale(int[] salesData) {
        int minMonth = 0;
        int month = 0;
        for (int sale : salesData) {
            if (sale <= salesData[minMonth]) {
                minMonth = month;
            }
            month += 1;
        }
        return minMonth + 1;
    }

    /* 5. Кол-во месяцев, в которых продажи были ниже среднего */
    public int salesBelowAverage(int[] salesData) {
        int averageSumSale = averageMonthSales(salesData);
        int minMonth = 0;
        for (int sale : salesData) {
            if (sale < averageSumSale) {
                minMonth += 1;
            }
        }
        return minMonth;
    }

    /* 6. Кол-во месяцев, в которых продажи были выше среднего */
    public int salesAboveAverage(int[] salesData) {
        int averageSumSale = averageMonthSales(salesData);
        int maxMonth = 0;
        for (int sale : salesData) {
            if (sale > averageSumSale) {
                maxMonth += 1;
            }
        }
        return maxMonth;
    }
}
