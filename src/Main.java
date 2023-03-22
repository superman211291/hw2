public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }



    private static void task8() {
        System.out.println("Задача 8");

    }

    private static void task7() {
        System.out.println("Задача 7");

    }

    private static void task6() {
        System.out.println("Задача 6");
        float percent = 7;
        float money = 15_000;
        float sum = 0;
        float countMounth = 0 ;
        while (countMounth< 9 * 12){
            sum=money + sum + ((money + sum)/100)*(percent/12);
            countMounth++;
            if (countMounth%6==0 || countMounth> 9 * 12 ) {
                System.out.println("Сумма накоплений в " + countMounth + " месяц - " + sum);
            }
        }

    }

    private static void task5() {
        System.out.println("Задача 5");
        float percent = 7;
        float money = 15_000;
        float finishSum = 12_000_000;
        float sum = 0;
        int countMounth =0 ;
        while (sum < finishSum){
            sum=money + sum + ((money + sum)/100)*(percent/12);
            countMounth++;
            if (countMounth%6==0 || sum > finishSum) {
                System.out.println("Сумма накоплений в " + countMounth + " месяц - " + sum);
            }
        }

    }

    private static void task4() {
        System.out.println("Задача 4");
        float percent = 7;
        float money = 15_000;
        float finishSum = 12_000_000;
        float sum = 0;
        int countMounth =0 ;
        while (sum < finishSum){
            sum=money + sum + ((money + sum)/100)*(percent/12);
            countMounth++;
            System.out.println("Сумма накоплений в " + countMounth +" месяц - "+sum);
        }

    }

    private static void task3() {
        System.out.println("Задача 3");
        int humans = 12_000_000;
        int come = 17; //17/1000
        int died = 8; //8/1000
        int sumComeHumans ;
        int sumDiedHumans ;
        for (int i = 1; i <= 10; i++) {
            sumComeHumans = (humans / 1000)*come;
            sumDiedHumans = (humans/1000)*died;
            humans = humans+sumComeHumans-sumDiedHumans;
            System.out.println("Год "+ i +", численность населения составляет "+humans);
        }
    }

    private static void task2() {
        System.out.println("Задача 2");
        int i=1;
        while (i<10){
            System.out.print(i +" ");
            i++;
        }
        System.out.println();
        for (int j = 10; j > 0; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    private static void task1() {
        System.out.println("Задача 1");
        int money = 15_000;
        int summ = 0;
        int mounthCount =0;
        while (summ < 2_459_000){
            summ = summ+money;
            mounthCount++;
            System.out.println("Месяц "+ mounthCount +", сумма накоплений равна "+ summ +" рублей");
        }

    }
}