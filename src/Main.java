import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        task1();
    }

    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    ///zadacha 1
    public static void task1() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {
            sum = sum + arr[index];
        }
        System.out.println(sum);


        //zadacha 2
        int[] arr2 = generateRandomArray();
        int maxSum = 99_000;
        int minSum = 200_001;

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < minSum) {
                minSum = arr2[i];
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] > maxSum) {
                maxSum = arr2[i];
            }
        }
        System.out.println(" Максимальная сумма трат за день составила " + maxSum + " рублей");

        System.out.println(" Минимальная сумма трат за день составила " + minSum + " рублей");


//        //zadacha 3

        int[] arr3 = generateRandomArray();
        int sum3 = 0;
        for (int e= 0; e < arr3.length; e++ ){
            sum3 = sum3 + arr3[e];
        }
        double srednee = (double) sum3/arr3.length;
        System.out.println(" Средняя сумма трат за месяц составила "+ srednee + "рублей");


        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int y = reverseFullName.length- 1; y >=0; y-- ){
            System.out.println(reverseFullName[y]);
        }


    }
}