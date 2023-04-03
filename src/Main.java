public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task3() {
        System.out.println("Задача 3");
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё', 'e');
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }

    private static void task2() {
        System.out.println("Задача 2");
        String fullName = "Ivanov Ivan Ivanovich";
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);
    }

    private static void task1() {
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "ФИО сотрудника — " + lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);
    }
}