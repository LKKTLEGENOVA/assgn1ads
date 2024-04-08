import java.util.Scanner;

public class Main {
    // Complexity: constant - O(1)
    public static int findMinimum(int a, int b) {
        return Math.min(a, b);
    }

    // Complexity: linear - O(N)
    public static int findMinimum(int[] a) {
        if (a.length == 0)
            throw new IllegalArgumentException("Array must not be empty");

        int minVal = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < minVal) {
                minVal = a[i];
            }
        }
        return minVal;
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

        System.out.println("The minimum element is: " + findMinimum(arr));
        scanner.close();
    }
}
