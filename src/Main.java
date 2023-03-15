public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }



    private static void task7() {
        System.out.println("Задача 7");

    }

    private static void task6() {
        System.out.println("Задача 6");
    }

    private static void task5() {
        System.out.println("Задача 5");
    }

    private static void task4() {
        System.out.println("Задача 4");

    }

    private static void task3() {
        System.out.println("Задача 3");

    }

    private static void task2() {
        System.out.println("Задача 2");
        float temperature1 = 12.5f;
        float temperature2 =4.7f;
        if (temperature1 < 5.0f) {
            System.out.println("На улице " + temperature1 +" градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature1 +" градусов, можно идти без шапки");
        }
        if (temperature2 < 5.0f) {
            System.out.println("На улице " + temperature2 +" градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature2 +" градусов, можно идти без шапки");
        }


    }

    private static void task1() {
        System.out.println("Задача 1");
        int age1 = 17;
        int age2 = 19;
        if (age1 >= 18) {
            System.out.println("Если возраст человека равен " + age1 + ", он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age1 + ", он не достиг совершеннолетия, нужно немного подождать»");
        }
        if (age2>=18) {
            System.out.println("Если возраст человека равен " + age2 + ", он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age2 + ", он не достиг совершеннолетия, нужно немного подождать»");
        }
    }
}