import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    private static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char var;
        for (int i = 0; i < reverseFullName.length/2; i++) {
            var = reverseFullName[i];
            reverseFullName[i]=reverseFullName[reverseFullName.length-1-i];
            reverseFullName[reverseFullName.length-1-i]=var;
        }
        System.out.println(Arrays.toString(reverseFullName));
    }
    private static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        int sum = 0;
        float fSum = 0.0f;
        for (int i : arr) {
            sum += i;
        }
        fSum=sum;
        System.out.println("Средняя сумма трат за месяц составила "+ fSum/arr.length +" рублей");
    }
    private static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int max = arr[0];
        int min = arr[0];
        for (int i : arr) {
            if (i > max) max = i;
            if (i < min) min = i;
        }
        System.out.println("Минимальная сумма трат за день составила "+ min +" рублей. Максимальная сумма трат за день составила " + max +" рублей");
    }

    private static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила "+ sum +" рублей");
    }
}