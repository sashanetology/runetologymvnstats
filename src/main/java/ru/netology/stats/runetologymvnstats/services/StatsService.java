package ru.netology.stats.runetologymvnstats.services;

public class StatsService {

    public long sum(long[] sales) {
        long sum = 0;
        int i = 0;
        for (long sale : sales) {
            sum = sum + sales[i];
            i++;
        }
        return sum;
    }

    public double averageSale(long[] sales) {
        long sum = sum(sales);
        double length = sales.length;
        double averageSale = sum / length;
        return averageSale;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int lowSales(long[] sales) {
        double length = sales.length;
        double averageSale = averageSale(sales);
        int lowMonths = 0;
        int i = 0;
        for (long sale : sales) {
            if (sales[i] < averageSale) {
                lowMonths++;
            }
            i++;
        }
        return lowMonths;
    }

    public int highSales(long[] sales) {
        double length = sales.length;
        double averageSale = averageSale(sales);
        int highMonths = 0;
        int i = 0;
        for (long sale : sales) {
            if (sales[i] > averageSale) {
                highMonths++;
            }
            i++;
        }
        return highMonths;
    }
}
