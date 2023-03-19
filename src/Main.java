public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();


    }





    private static void task5() {
        System.out.println("Задача 5");

    }

    private static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int daysOfDelivery = 0;
        if (deliveryDistance < 20){
            daysOfDelivery = 1;
        } else if (deliveryDistance>=20 && deliveryDistance<60) {
            daysOfDelivery = 2;
        } else if (deliveryDistance>=60 && deliveryDistance <=100) {
            daysOfDelivery = 3;
        } else{
            daysOfDelivery =0;
        }
        if (daysOfDelivery > 0) {
            System.out.println("Потребуется дней: " + daysOfDelivery);
        } else{
            System.out.println("Доставки нет!");
        }

    }

    private static void task3() {
        System.out.println("Задача 3");
        int year = 2021;
        if ((year%100!=0 && year%4==0) || year%400==0){
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }


    }

    private static void task2() {
        System.out.println("Задача 2");
        int clientOS = 0;
        int yearOS = 2014;
        int year = 2015;
        switch (clientOS){
            case 0 :
                if (yearOS>=year) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
                break;
            case 1 :
                if(yearOS>=year) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
                break;
            default:
                System.out.println("Данная ОС не поддерживается!");
        }

    }




    private static void task1() {
        System.out.println("Задача 1");
        int clientOS = 0;
        switch (clientOS){
            case 0 :
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1 :
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Данная ОС не поддерживается!");
        }

    }
}