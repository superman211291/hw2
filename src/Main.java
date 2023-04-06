public class Main {
    public static void main(String[] args) {
        task1(2021);
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