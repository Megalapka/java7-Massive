import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        StatsService service = new StatsService();
        int[] dataSales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        System.out.println("1. Сумма всех продаж: " + service.getSumAll(dataSales));
        System.out.println("2. Средняя сумма продаж в месяц: " + service.getMidSum(dataSales));
        System.out.println("3. Номер месяца, в котором был пик продаж: " + service.getMaxMonthSales(dataSales));
        System.out.println("4. Номер месяца, в котором был минимум продаж: " + service.getMinMonthSales(dataSales));
        System.out.println("5. Кол-во месяцев, в которых продажи были ниже среднего: " + service.getCountBelowAverage(dataSales));
        System.out.println("6. Кол-во месяцев, в которых продажи были выше среднего: " + service.getCountAboveAverage(dataSales));
    }
}
