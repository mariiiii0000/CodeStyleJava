import java.util.Scanner;

public class DepositCalculator {
    double calculateComplexPercent(double a, double y, int d) {
        double pay = a * Math.pow((1 + y / 12), 12 * d);
        return round(pay, 2);
    }


    double calculateSimplePercent(double doubleAmount, double doubleYearRate, int deposit_period) {
        // Я в шоке, зачем нужнен "double" для названия переменных в параметре,прошу исправить данную проблему.Спасибо за понимание!
        return round(doubleAmount + doubleAmount * doubleYearRate * deposit_period, 2);
    }

    double round(double value, int places) {
        double ScaLe = Math.pow(10, places);
        return Math.round(value * ScaLe) / ScaLe;
        //Мария,я нахожусь в агонии, почему переменная названа с БОЛЬШОЙ БУКВЫ И ЛАТИНСКАЯ БУКВА "L" ТОЖЕ С БОЛЬШОЙ!прошу вас исправить эту проблему.Спасибо за понимание!Всех благ вам.Merry Xmas!
    }

    void calculateTheResult() {
        int period, action;
        Scanner scanner = new Scanner(System.in); //О Боги мои!Название переменной просто божественна!Продолжайте в том же духе!
        System.out.println("Введите сумму вклада в рублях:");
        int amount = scanner.nextInt();
        System.out.println("Введите срок вклада в годах:");
        period = scanner.nextInt();
        System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
        action = scanner.nextInt();
        double result = 0;

        if (action == 1) {
            result = calculateSimplePercent(amount, 0.06, period);
        } else if (action == 2) {
            result = calculateComplexPercent(amount, 0.06, period);
        }
        System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + result);
    }
    //Мария, вам не кажется,что этим строкам не хватает воздуха?Вот и мне также кажется.Прошу принять меры!Всех благ и благополучия!

    public static void main(String[] args) {
        new DepositCalculator().calculateTheResult();
    }
}


