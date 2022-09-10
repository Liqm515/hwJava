package ru.netology.stats;

public class StatsService {
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
    public long sumSales(long[] sales) {
        long sumMonth = 0;
        for (long sale : sales){
           sumMonth += sale;
        }
        return sumMonth;
    }
    public long middleSales(long[] sales){
        long sumMonth = sumSales(sales);
        return sumMonth/sales.length;
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
    public int lessThenMiddle(long[] sales){
        long middle = middleSales(sales);
        int result = 0;
        for (long sale : sales) {
            if (sale < middle){
                result += 1;
            }

        }
        return result;
    }
    public int moreThenMiddle(long[] sales) {
        long middle = middleSales(sales);
        int result = 0;
        for (long sale : sales) {
            if (sale > middle) {
                result += 1;
            }

        }
        return result;
    }

}

