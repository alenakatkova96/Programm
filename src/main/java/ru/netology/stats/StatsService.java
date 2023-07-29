package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public double calculateAverage(int[] sales) {
        int sum = calculateSum(sales);
        return (double) sum / sales.length;
    }

    public int findMaxMonth(int[] sales) {
        int maxSale = sales[0];
        int maxMonth = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > maxSale) {
                maxSale = sales[i];
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int findMinMonth(int[] sales) {
        int minSale = sales[0];
        int minMonth = 0;
        for (int i = 1; i < sales.length; i++) {

            if (sales[i] < minSale) {
                minSale = sales[i];
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int calculateBelowAverage(int[] sales) {
        double average = calculateAverage(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    public int calculateAboveAverage(int[] sales) {
        double average = calculateAverage(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }
}
