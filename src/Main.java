public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");

        int salary = 15000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            total = total + total / 100;
            total = total + salary;
            month += 1;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
        }

        //Задача 2
        System.out.println("Задача 2");
        int start = 1;
        while (start < 10) {
            System.out.print(start);
            start = start + 1;
        }

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        //Задача 3
        System.out.println("Задача 3");

        int population = 12_000_000;
        for (int i = 1; i <= 10; i++) {
            int birthRate = 17 * population / 1000;
            int deathRate = 8 * population / 1000;
            population = population + birthRate - deathRate;
            System.out.println("Год " + i + " численность населения составляет " + population);
        }

        //Задача 4
        System.out.println("Задача 4");

        int save = 12_000_000;
        int deposit = 15000;
        double percent = 0.07;
        int months = 0;

        while (deposit <= save) {
            months++;
            deposit += deposit * percent;
            System.out.println("Месяц " + months + " сумма накоплений " + deposit);
        }

        //Задача 5
        System.out.println("Задача 5");
        int save1 = 12_000_000;
        int deposit1 = 15000;
        double percent1 = 0.07;
        int months1 = 0;

        while (deposit1 <= save1) {
            months1++;
            deposit1 += deposit1 * percent1;
            if (months1 % 6 == 0) {
                System.out.println("месяц " + months1 + " сумма накоплений равна " + deposit1);

            }

        }

        //Задача 6
        System.out.println("Задача 6");

        int deposit2 = 15000;
        double percent2 = 0.07;
        int purpose = 9 * 12;
        int months2 = 1;

        while (months2 <= purpose) {
            deposit2 += deposit2 * percent2;
            if (months2 % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений: %d%n", months2, deposit2);
            }

            months2++;
        }

        //Задача 7
        System.out.println("Задача 7");

        int friday = 5;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + " -е число.Необходимо подготовить отчет");
            friday += 7;
        }

        //Задача 8
        System.out.println("Задача 8");
        int currentYear = 2023;
        for (int i = 0; i < currentYear + 100; i += 79) {
            if (i > currentYear - 200) {
                System.out.println(i);
            }


        }
    }
}