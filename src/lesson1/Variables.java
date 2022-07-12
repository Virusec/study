package lesson1;

public class Variables {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        byte a = 12;
        short b = 126;
        int c = 1999;
        long d = 123456789L;
        float e = 1.222f;
        double f = 12.123456;
        char g = 11;
        boolean h = b > 18;
    }

    public static void task2() {
        float boxer1 = 78.2f;
        float boxer2 = 82.7f;
        float sum = boxer1 + boxer2;
        float diff = boxer2 - boxer1;
        System.out.println("Вес двух бойцов: " + sum);
        System.out.println("Разница между весами бойцов.: " + diff);
    }

    public static void task3() {
        int banana = 80;
        int milk = 105;
        int iceCream = 100;
        int egg = 70;
        int sum = banana * 5 + milk * 2 + iceCream * 2 + egg * 4;
        float sumKg = (sum * 1.0f / 1000) ;
        System.out.println(sumKg);
    }

    public static void task4() {
        int weight = 7000;
        int loseWeight1 = 500;
        int loseWeight2 = 250;
        int days1 = weight / loseWeight1;
        int days2 = weight / loseWeight2;
        System.out.println(days1);
        System.out.println(days2);
    }

    public static void task5() {
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKris = 76230;
        int oldSalaryMasha = salaryMasha * 12;
        int oldSalaryDenis = salaryDenis * 12;
        int oldSalaryKris = salaryKris * 12;
        float newSalaryMasha = oldSalaryMasha * 0.1f;
        float newSalaryDenis = oldSalaryDenis * 0.1f;
        float newSalaryKris = oldSalaryKris * 0.1f;
        float diffMasha = newSalaryMasha * 12 - oldSalaryMasha;
        float diffDenis = newSalaryDenis * 12 - oldSalaryDenis;
        float diffKris = newSalaryKris * 12 - oldSalaryKris;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + diffMasha + " рублей");
        System.out.println("Denis теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + diffDenis + " рублей");
        System.out.println("Kris теперь получает " + newSalaryKris + " рублей. Годовой доход вырос на " + diffKris + " рублей");
    }
}