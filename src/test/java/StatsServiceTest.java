import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    void shouldSumAllData() {
        StatsService service = new StatsService();
        int[] dataSales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 180;
        int actual = service.getSumAll(dataSales);

        Assertions.assertEquals(expected,actual);

    }

    @Test
    void shouldMidSum() {
        StatsService service = new StatsService();
        int[] dataSales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 15;
        int actual = service.getMidSum(dataSales);

        Assertions.assertEquals(expected,actual);

    }

    @Test
    void shouldMaxMonthSales() {
        StatsService service = new StatsService();
        int[] dataSales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 8;
        int actual = service.getMaxMonthSales(dataSales);

        Assertions.assertEquals(expected,actual);

    }

    @Test
    void shouldMinMonthSales() {
        StatsService service = new StatsService();
        int[] dataSales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 9;
        int actual = service.getMinMonthSales(dataSales);

        Assertions.assertEquals(expected,actual);

    }

    @Test
    void shouldCountBelowAverage() {
        StatsService service = new StatsService();
        int[] dataSales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 5;
        int actual = service.getCountBelowAverage(dataSales);

        Assertions.assertEquals(expected,actual);

    }

    @Test
    void shouldCountAboveAverage() {
        StatsService service = new StatsService();
        int[] dataSales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 5;
        int actual = service.getCountAboveAverage(dataSales);

        Assertions.assertEquals(expected,actual);

    }

}
