/*
Статистика - очень важный компонент любого бизнеса.
У вас есть набор данных о продажах конкретного предприятия по месяцам:
[8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18].

Вам поручили написать небольшой сервис (программисты все заняты), который умеет по предоставленному ему массиву месячных продаж рассчитывать:

1. Сумму всех продаж
2. Среднюю сумму продаж в месяц
3. Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)*
4. Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)*
5. Кол-во месяцев, в которых продажи были ниже среднего (см. п.2)
6. Кол-во месяцев, в которых продажи были выше среднего (см. п.2)
Примечание:* в вашем задании нужно найти последний месяц, соответствующий условиям.
 */

public class StatsService {
    //1.
    public int getSumAll(int[] dataSales) {
        int sumAll = 0;
        for (int sales : dataSales) {
            sumAll = sumAll + sales;
        }
        return sumAll;
    }

    //2.
    public int getMidSum(int[] dataSales) {
        int midSum = getSumAll(dataSales) / 12;
        return midSum;
    }

    //3.
    public  int getMaxMonthSales(int[] dataSales) {
        int maxMonth = 0;
        int month = 0;
        for (int sales : dataSales) {
            if (sales >= dataSales[maxMonth]) {
                maxMonth = month;
            }
            month++;
        }
        return maxMonth + 1;
    }

    //4.
    public  int getMinMonthSales(int[] dataSales) {
        int minMonth = 0;
        int month = 0;
        for (int sales : dataSales) {
            if (sales <= dataSales[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth + 1;
    }

    //5.
    public int getCountBelowAverage(int[] dataSales) {
        int mid = getMidSum(dataSales);
        int midCountBelowAverage = 0;
        for (int i = 0; i < dataSales.length; i++) {
            if (dataSales[i] < mid) {
                midCountBelowAverage++;
            }
        }
        return midCountBelowAverage;
    }

    //6.
    public int getCountAboveAverage(int[] dataSales) {
        int mid = getMidSum(dataSales);
        int midCountAboveAverage = 0;
        for (int i = 0; i < dataSales.length; i++) {
            if (dataSales[i] > mid) {
                midCountAboveAverage++;
            }
        }
        return midCountAboveAverage;
    }
}
