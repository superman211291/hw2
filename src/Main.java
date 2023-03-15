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

    }

    private static void task6() {
        System.out.println("Задача 6");
        System.out.println("Задача 7");
        int our = 102;
        int seat = 60;
        int passengers = 103;
        if (passengers>our){
            System.out.println("Вагон полностью забит!");
        } else if (passengers<our && passengers>seat) {
            System.out.println("В вагоне осталось "+(our-passengers)+" стоячих мест.");
        } else if (passengers<seat) {
            System.out.println("В вагоне осталось "+(our-seat)+" стоячих мест и " + (seat-passengers) + " сидячих мест.");
        }
        passengers = 99;
        if (passengers>our){
            System.out.println("Вагон полностью забит!");
        } else if (passengers<our && passengers>seat) {
            System.out.println("В вагоне осталось "+(our-passengers)+" стоячих мест.");
        } else if (passengers<seat) {
            System.out.println("В вагоне осталось "+(our-seat)+" стоячих мест и " + (seat-passengers) + " сидячих мест.");
        }

        passengers = 38;
        if (passengers>our){
            System.out.println("Вагон полностью забит!");
        } else if (passengers<our && passengers>seat) {
            System.out.println("В вагоне осталось "+(our-passengers)+" стоячих мест.");
        } else if (passengers<seat) {
            System.out.println("В вагоне осталось "+(our-seat)+" стоячих мест и " + (seat-passengers) + " сидячих мест.");
        }
    }

    private static void task5() {
        System.out.println("Задача 5");
        int age = 4;
        if (age<5){
            System.out.println("Если возраст ребенка равен " + age +", то ему нельзя кататься на аттракционе");
        } else if (age>5 && age<14) {
            System.out.println("Если возраст ребенка равен " + age +", то ему можно кататься на аттракционе в сопровождении");
        } else if (age>14) {
            System.out.println("Если возраст ребенка равен " + age +", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        age = 6;
        if (age<4){
            System.out.println("Если возраст ребенка равен " + age +", то ему нельзя кататься на аттракционе");
        } else if (age>5 && age<14) {
            System.out.println("Если возраст ребенка равен " + age +", то ему можно кататься на аттракционе в сопровождении");
        } else if (age>14) {
            System.out.println("Если возраст ребенка равен " + age +", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        age = 15;
        if (age<4){
            System.out.println("Если возраст ребенка равен " + age +", то ему нельзя кататься на аттракционе");
        } else if (age>5 && age<14) {
            System.out.println("Если возраст ребенка равен " + age +", то ему можно кататься на аттракционе в сопровождении");
        } else if (age>14) {
            System.out.println("Если возраст ребенка равен " + age +", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }

    private static void task4() {
        System.out.println("Задача 4");
        int age = 3;
        if(age>=2 && age<=6){
            System.out.println("Если возраст человека равен " + age +", то ему нужно ходить в детский сад");
        } else if (age>=7 && age<=18) {
            System.out.println("Если возраст человека равен " + age +", то ему нужно ходить в школу");
        } else if (age>18 && age<24) {
            System.out.println("Если возраст человека равен " + age +", то ему нужно ходить в университет");
        } else if (age>24) {
            System.out.println("Если возраст человека равен " + age +", то ему нужно ходить на работу.");
        }
        age = 8;
        if(age>=2 && age<=6){
            System.out.println("Если возраст человека равен " + age +", то ему нужно ходить в детский сад");
        } else if (age>=7 && age<=18) {
            System.out.println("Если возраст человека равен " + age +", то ему нужно ходить в школу");
        } else if (age>18 && age<24) {
            System.out.println("Если возраст человека равен " + age +", то ему нужно ходить в университет");
        } else if (age>24) {
            System.out.println("Если возраст человека равен " + age +", то ему нужно ходить на работу.");
        }
        age = 19;
        if(age>=2 && age<=6){
            System.out.println("Если возраст человека равен " + age +", то ему нужно ходить в детский сад");
        } else if (age>=7 && age<=18) {
            System.out.println("Если возраст человека равен " + age +", то ему нужно ходить в школу");
        } else if (age>18 && age<24) {
            System.out.println("Если возраст человека равен " + age +", то ему нужно ходить в университет");
        } else if (age>24) {
            System.out.println("Если возраст человека равен " + age +", то ему нужно ходить на работу.");
        }
        age = 25;
        if(age>=2 && age<=6){
            System.out.println("Если возраст человека равен " + age +", то ему нужно ходить в детский сад");
        } else if (age>=7 && age<=18) {
            System.out.println("Если возраст человека равен " + age +", то ему нужно ходить в школу");
        } else if (age>18 && age<24) {
            System.out.println("Если возраст человека равен " + age +", то ему нужно ходить в университет");
        } else if (age>24) {
            System.out.println("Если возраст человека равен " + age +", то ему нужно ходить на работу.");
        }

    }

    private static void task3() {
        System.out.println("Задача 3");
        int speed = 90;
        int speed2 =45;
        if(speed>60){
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }else{
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        if(speed2>60){
            System.out.println("Если скорость " + speed2 + ", то придется заплатить штраф");
        }else{
            System.out.println("Если скорость " + speed2 + ", то можно ездить спокойно");
        }

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