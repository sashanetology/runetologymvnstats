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
        double averageSale = 0;
        double length = sales.length;
        int i = 0;
        for (long sale : sales) {
            averageSale = averageSale + (sales[i] / length);
            i++;
        }
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
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int lowSales(long[] sales) {
        double length = sales.length;
        double averageSale = 0;
        int lowMonths = 0;
        int i = 0;
        int x = 0;
        for (long sale : sales) {
            averageSale = averageSale + (sales[i] / length);
            i++;
        }

        for (long sale : sales) {
            if (sales[x] < averageSale) {
                lowMonths++;
            }
            x++;
        }
        return lowMonths;
    }

    public int highSales(long[] sales) {
        double length = sales.length;
        double averageSale = 0;
        int highMonths = 0;
        int i = 0;
        int x = 0;
        for (long sale : sales) {
            averageSale = averageSale + (sales[i] / length);
            i++;
        }

        for (long sale : sales) {
            if (sales[x] > averageSale) {
                highMonths++;
            }
            x++;
        }
        return highMonths;
    }
}
