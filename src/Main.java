public class Main {
    public static void main(String[] args) {
        task1(2021);
        task2(0,2014);
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