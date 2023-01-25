package ru.netology.stats.Statistic.services;

public class StatsService {

    public int sumSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int averageSales(int[] sales) {
        int average = 0;
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
            average = sum / sales.length;
        }
        return average;
    }

    public int getMinSales(int[] sales) {
        int minSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minSales]) {
                minSales = i;
            }
        }
        return minSales + 1;
    }

    public int getMaxSales(int[] sales) {
        int maxSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxSales]) {
                maxSales = i;
            }
        }
        return maxSales + 1;
    }

    public int minAverageSales(int[] sales) {
        int average = 0;
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
            average = sum / sales.length;
        }
        int countMin = 0;
        for (int s : sales) {
            if (s < average) {
                countMin++;
            }
        }
        return countMin;
    }

    public int maxAverageSales(int[] sales) {
        int average = 0;
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
            average = sum / sales.length;
        }
        int countMax = 0;
        for (int s : sales) {
            if (s > average) {
                countMax++;
            }
        }
        return countMax;
    }
}