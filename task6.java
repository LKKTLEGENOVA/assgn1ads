import java.util.Scanner;
public class task6 {


    // Complexity:  constant - O(1)
    public static int power(int a, int n) {
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            int temp = power(a, n / 2);
            return temp * temp;
        } else {
            return linearPower(a, n);
        }
    }

    // Complexity: linear - O(n)
    private static int linearPower(int a, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= a;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base (a):");
        int a = scanner.nextInt();
        System.out.println("Enter the exponent (n):");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println(a + " raised to the power of " + n + " is: " + power(a, n));
    }
}
