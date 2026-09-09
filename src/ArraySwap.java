import java.util.Scanner;

public class ArraySwap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(numbers[i] + " ");
        }

        int temp = numbers[0];

        numbers[0] = numbers[4];
        numbers[4] = temp;

        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.print(numbers[i] + " ");
        }

    }
}