package lesson2;

import java.util.Scanner;

public class Conditional {
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
        task10();
    }

    public static void task1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = sc.nextInt();
        System.out.println("Введите второе число: ");
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("Оба числа равны: " + a + " = " + b);
        } else if (a > b) {
            System.out.println("Первое число больше второго: " + a + " > " + b);

        } else {
            System.out.println("Первое число меньше второго: " + a + " < " + b);
        }
        sc.close();
    }

    public static void task2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = sc.nextInt();
        if (num < 9 && num > 2) {
            System.out.println("Число больше 2 и меньше 9");
        } else {
            System.out.println("Неизвестное число");
        }
        sc.close();
    }

    public static void task3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму вклада: ");
        int depositAmount = sc.nextInt();
        if (depositAmount < 100) {
            double amount1 = depositAmount * 1.05;
            System.out.println(amount1);
        } else if (depositAmount >= 100 && depositAmount <= 200) {
            double amount2 = depositAmount * 1.07;
            System.out.println(amount2);
        } else {
            double amount3 = depositAmount * 1.1;
            System.out.println(amount3);
        }
        sc.close();
    }

    public static void task4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер операции: 1.Сложение 2.Вычитание 3.Умножение 4. Деление");
        int operationNum = sc.nextInt();
        switch (operationNum) {
            case 1:
                System.out.println("Сложение");
                break;
            case 2:
                System.out.println("Вычитание");
                break;
            case 3:
                System.out.println("Умножение");
                break;
            case 4:
                System.out.println("Деление");
                break;
            default:
                System.out.println("Операция не определена");
        }
        sc.close();
    }

    public static void task5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        float num1 = sc.nextInt();
        System.out.println("Введите второе число");
        float num2 = sc.nextInt();
        System.out.println("Введите номер операции: 1.Сложение 2.Вычитание 3.Умножение 4. Деление");
        int operation = sc.nextInt();
        switch (operation) {
            case 1:
                System.out.println("Результат операции: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Результат операции: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Результат операции: " + (num1 * num2));
                break;
            case 4:
                System.out.println("Результат операции: " + (num1 / num2));
                break;
            default:
                System.out.println("Операция не определена");
        }
        sc.close();
    }

    public static void task6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите операционную систему. 0 - для iOS. 1 - для Android");
        int clientOS = sc.nextInt();
        switch (clientOS) {
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            default:
                System.out.println("Система не распознана");
        }
        sc.close();
    }

    public static void task7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите операционную систему. 0 - для iOS. 1 - для Android");
        int clientOS = sc.nextInt();
        System.out.println("Укажите год производства телефона");
        int clientDeviceYear = sc.nextInt();
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            System.out.print("Система не распознана");
        }
        sc.close();
    }

    public static void task8() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        sc.close();
    }

    public static void task9() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите расстояние");
        int deliveryDistance = sc.nextInt();
        int deliveryDays = 1;
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryDays++;
        }
        if (deliveryDistance >= 60 && deliveryDistance < 100){
            deliveryDays++;
        }
        System.out.println("Потребуется дней: " + deliveryDays);
        sc.close();
    }

    public static void task10() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер месяца.");
        int monthNumber = sc.nextInt();
        switch (monthNumber) {
            case 12,1,2 -> System.out.println("Зима");
            case 3,4,5 -> System.out.println("Весна");
            case 6,7,8 -> System.out.println("Лето");
            case 9,10,11 -> System.out.println("Осень");
            default -> System.out.println("Такого месяца не существует");
        }
        sc.close();
    }

}
