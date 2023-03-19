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


    }

    private static void task3() {
        System.out.println("Задача 3");


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