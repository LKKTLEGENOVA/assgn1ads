import java.util.Scanner;
public class task8 {

    // Complexity: linear - O(n)
    public static boolean allDigitsLinear(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    // Complexity: constant - O(1)
    public static boolean allDigitsConstant(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        return s.matches("\\d+");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = scanner.nextLine();
        scanner.close();

        System.out.println("String consists of digits only (linear): " + allDigitsLinear(s));
        System.out.println("String consists of digits only (constant): " + allDigitsConstant(s));
    }
}
