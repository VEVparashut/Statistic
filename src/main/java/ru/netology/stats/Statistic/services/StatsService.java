package ru.netology.stats.Statistic.services;

import static java.lang.Long.sum;

public class StatsService {

    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public long averageSales(long[] sales) {
        long average = sumSales(sales) / sales.length;
        return average;
    }


    public int getMinSales(long[] sales) {
        int minMonth = 0;
        long minSales = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minSales) {
                minMonth = i;
                minSales = sales[i];
            }
        }
        return minMonth + 1;
    }

    public int getMaxSales(long[] sales) {
        int maxMonth = 0;
        long maxSales = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSales) {
                maxMonth = i;
                maxSales = sales[i];
            }
        }
        return maxMonth + 1;
    }

    public int minAverageSales(long[] sales) {
        int countMin = 0;
        for (long sale : sales) {
            if (sale < averageSales((sales))) {
                countMin++;
            }
        }
        return countMin;
    }

    public int maxAverageSales(long[] sales) {
        int countMax = 0;
        for (long sale : sales) {
            if (sale > averageSales((sales))) {
                countMax++;
            }
        }
        return countMax;
    }
}