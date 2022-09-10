package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    StatsService service = new StatsService();
    long[] arr  = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


    @Test
    public void minSalesTest(){
        int expectedMin = 9;
        int actualMin = service.minSales(arr);

        Assertions.assertEquals(expectedMin, actualMin);
    }
    @Test
    public void sumSalesTest(){
        long expectedSum = 180;
        long actualSum = service.sumSales(arr);

        Assertions.assertEquals(expectedSum, actualSum);
    }
    @Test
    public void middleSalesTest(){
        long expectedMiddle = 15;
        long actualMiddle = service.middleSales(arr);

        Assertions.assertEquals(expectedMiddle, actualMiddle);
    }
    @Test
    public void lessThenMiddleSalesTest(){
       int expectedLessThenMiddle = 5;
       int actualLessThenMiddle = service.lessThenMiddle(arr);

        Assertions.assertEquals(expectedLessThenMiddle, actualLessThenMiddle);
    }
    @Test
    public void moreThenMiddleSalesTest(){
        int expectedMoreThenMiddle = 5;
        int actualMoreThenMiddle = service.moreThenMiddle(arr);

        Assertions.assertEquals(expectedMoreThenMiddle, actualMoreThenMiddle);
    }
}
