package lesson3;

import java.util.Scanner;

public class Cycles {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
    }


    public static void task1() {
        int i = 1;
        while (i <= 10) {
            System.out.printf("%d ", i++);
        }
        System.out.println();
        for (; i >= 1; i--) {
            if (i == 11) {
                continue;
            }
            System.out.printf("%d ", i);
        }
    }

    public static void task2() {
        for (int friday = 5; friday <= 31; friday+=7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }
    }

    public static void task3() {
        for (int year = 1822; year < 2122; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
    }

    public static void task4() {
        /* В стране XYZ население равно 10 миллионов человек. Рождаемость составляет 14 человек на 1000 человек, смертность - 8 человек.
        Рассчитайте, какая численность населения будет через 10 лет, принимая во внимание, что показатели рождаемости и смертности постоянны.*/
        int population = 10_000_000;
        int fertility = 14;
        int mortality = 8;
        int populationIncrease = fertility - mortality;
        for (int year = 1; year <= 10; year++) {
            population += population / 1000 * populationIncrease;
            System.out.println(population);
        }
        System.out.println("Численность населения через 10 лет составит - " + population);
    }

    public static void task5() {
        /* В стране XYZ население равно 10 миллионов человек. Рождаемость составляет 14 человек на 1000 человек, смертность - 8 человек.
        Каждый год рождается и умирает на 1 человек, меньше чем в предыдущий год. Рассчитайте, какая численность населения будет через 10 лет,
        учитывая, что рождаемость не может быть меньше 7 человек на 1000 человек, а смертность не может быть меньше 6 человек на 1000 человек.*/
        int population = 10_000_000;
        int fertility = 14;
        int mortality = 8;
        for (int year = 1; year <= 10; year++) {
//            if (fertility < 7) {
//                fertility = 7;
//            }
//            if (mortality < 6) {
//                mortality = 6;
//            }
            int populationIncrease = fertility - mortality;
            population += population / 1000 * populationIncrease;
            if (fertility>7) fertility -= 1;
            if (mortality>6) mortality -= 1;
//            fertility--;
//            mortality--;
            System.out.println(population);
        }
        System.out.println("Численность населения через 10 лет составит - " + population);
    }

    public static void task6() {
        /* За каждый месяц банк начисляет к сумме вклада 7% от суммы. Напишите консольную программу, в которую пользователь вводит сумму вклада и количество месяцев.
        А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц. Для вычисления суммы с учетом процентов используйте цикл for.
        Пусть сумма вклада будет представлять тип float.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму вклада.");
        float deposit = sc.nextFloat();
        System.out.println("Введите срок вклада в месяцах.");
        int period = sc.nextInt();
        for (int time = 1; time <= period; time++) {
            deposit += deposit * 0.07;
            System.out.println(deposit);
        }
        System.out.printf("После %d месяцев сумма вклада составит %f", period, deposit);
        sc.close();
    }

    public static void task7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму вклада.");
        float deposit = sc.nextFloat();
        System.out.println("Введите срок вклада в месяцах.");
        int period = sc.nextInt();
        int time = 1;
        while (time <= period) {
            time++;
            deposit += deposit * 0.07;
            System.out.println(deposit);
        }
        System.out.printf("После %d месяцев сумма вклада составит %f", period, deposit);
        sc.close();
    }

    public static void task8() {
        for (int i = 1;i<10;i++ ) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d ", i*j);
            }
            System.out.println();
        }
    }

    public static void task9() {
        Scanner sc = new Scanner(System.in);
        int i;
        do {
            System.out.println("Введите первое число");
            int a = sc.nextInt();
            System.out.println("Введите второе число");
            int b = sc.nextInt();
            System.out.printf("%d * %d = %d \n", a, b, a * b);
            System.out.println("Для выхода из программы нажмите цифру 1, для продолжения любую другую цифру");
            i = sc.nextInt();
        }
        while (i != 1);
        sc.close();
    }
}
