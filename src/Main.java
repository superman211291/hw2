public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();



    }

    private static void task4() {
        System.out.println("Задача 4");
        int productivity = 16;
        int min = 2;
        int productivityForOneMin = productivity / min;
        System.out.println("За 20 минут машина произвела " + productivityForOneMin * 20 + " штук бутылок");
        System.out.println("За сутки машина произвела " + productivityForOneMin * 60 * 24 + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + productivityForOneMin * 60 * 24 * 3 + " штук бутылок");
        System.out.println("За месяц машина произвела " + productivityForOneMin * 60 * 24 * 30 + " штук бутылок");
    }

    private static void task3() {
        System.out.println("Задача 3");
        int ludmilaPavlovnaStudents = 23;
        int annaSergeevnaStudents = 27;
        int ekaterinaAndreevnaStudents = 30;
        int sheetsOfPaper = 480;
        int students = ludmilaPavlovnaStudents + annaSergeevnaStudents +ekaterinaAndreevnaStudents;
        int sheetsOfPaperForStudent = sheetsOfPaper / students;
        System.out.println("На каждого ученика рассчитано " + sheetsOfPaperForStudent + " листов бумаги");
    }

    private static void task2() {
        System.out.println("Задача 2");
        float first = 27.12f;
        long second = 987_678_965_549L;
        double third = 2.786d;
        int fourth = 569;
        short fifth = - 159;
        int sixth = 27897;
        byte seventh = 67;
    }

    private static void task1() {
        System.out.println("Задача 1");
        int first = 1;
        byte second = 2;
        short third = 3;
        long fourth = 4;
        float fifth = 5.0F;
        double sixth = 6.0d;
        System.out.println("Значение переменной first с типом int равно " + first );
        System.out.println("Значение переменной second с типом byte равно " + second );
        System.out.println("Значение переменной third с типом short равно " + third );
        System.out.println("Значение переменной fourth с типом long равно " + fourth );
        System.out.println("Значение переменной fifth с типом float равно " + fifth );
        System.out.println("Значение переменной sixth с типом double равно " + sixth );
    }
}