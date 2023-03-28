import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    private static void task4() {
        System.out.println("Задача 4");
        int[] first = new int[3];
        for (int i = 0; i < 3; i++) {
            first[i] = i + 1;
        }
        System.out.println(Arrays.toString(first));
        for (int i = 0; i < first.length; i++) {
            if (first[i]%2!=0){
                first[i]=first[i]+1;
            }
        }
        System.out.println(Arrays.toString(first));


    }

    private static void task3() {
        System.out.println("Задача 3");
        int[] first = new int[3];
        for (int i = 0; i < 3; i++) {
            first[i] = i + 1;
        }
        double[] second = {1.57, 7.654, 9.986};
        char[] third = {1055, 1056, 1048, 1042, 1045, 1058};

        for (int i = first.length-1; i >= 0; i--) {
            System.out.print(first[i]);
            if (i>  0){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = second.length-1; i >= 0; i--) {
            System.out.print(second[i]);
            if (i>  0){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = third.length-1; i >=0; i--) {
            System.out.print(third[i]);
            if (i>  0){
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    private static void task2() {
        System.out.println("Задача 2");
        int[] first = new int[3];
        for (int i = 0; i < 3; i++) {
            first[i] = i + 1;
        }
        double[] second = {1.57, 7.654, 9.986};
        char[] third = {1055, 1056, 1048, 1042, 1045, 1058};

        for (int i = 0; i < first.length; i++) {
            System.out.print(first[i]);
            if (i< first.length -1){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < second.length; i++) {
            System.out.print(second[i]);
            if (i< second.length -1){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < third.length; i++) {
            System.out.print(third[i]);
            if (i< third.length -1){
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    private static void task1() {
        System.out.println("Задача 1");
        int[] first = new int[3];
        for (int i = 0; i < 3; i++) {
            first[i] = i + 1;
        }
        double[] second = {1.57, 7.654, 9.986};
        char[] third = {1055, 1056, 1048, 1042, 1045, 1058};
    }
}