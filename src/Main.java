import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1(2021);
        int currentYear = LocalDate.now().getYear();
        task2(0,currentYear);
        int daysOfDelivery = task3(25);
        if (daysOfDelivery > 0) {
            System.out.println("Потребуется дней: " + daysOfDelivery);
        } else{
            System.out.println("Доставки нет!");
        }
    }

    private static int task3(int deliveryDistance) {
        System.out.println("Задача 3");
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
        return daysOfDelivery;
    }

    private static void task2(int clientOS, int yearOS) {
        System.out.println("Задача 2");
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

    private static void task1(int year) {
        System.out.println("Задача 1");
        if ((year%100!=0 && year%4==0) || year%400==0){
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

    }
}