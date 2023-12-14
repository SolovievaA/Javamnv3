package ru.netology.stats;
public class StatsService {
    public long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result;
    }

    public long averageSum(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int maxMonthSale(long[] sales) {
        int maxSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxSale]) {
                maxSale = i;
            }
        }
        return maxSale + 1;
    }

    public int minMonthSale(long[] sales) {
        int minSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minSale]) {
                minSale = i;
            }
        }
        return minSale + 1;
    }

    public int monthsSaleBelowAverage(long[] sales){
        int counter = 0;
        long averageSale = averageSum(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public int monthsSaleAboveAverage(long[] sales){
        int counter = 0;
        long averageSale = averageSum(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }
}
