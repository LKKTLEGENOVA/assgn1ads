import java.util.Scanner;

public class task2 {

    public static double calculateAverage(int[] a) {
        if (a.length == 0)
            throw new IllegalArgumentException("Array must not be empty");

        double sum = 0;
        for (int num : a) {
            sum += num;
        }
        return sum / a.length;
    }

    public static double calculateAverageLinear(int[] a) {
        if (a.length == 0)
            throw new IllegalArgumentException("Array must not be empty");

        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum / a.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Average: " + calculateAverage(arr));
        scanner.close();
    }
}
