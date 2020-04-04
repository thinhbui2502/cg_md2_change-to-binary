import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int decimalNumber = sc.nextInt();
        String result = "";

        Stack<Integer> binaryNumber = new Stack<>();
        while (decimalNumber / 2 != 0) {
            int remainder = decimalNumber % 2;
            decimalNumber = decimalNumber / 2;
            binaryNumber.push(remainder);
        }

        for (Integer value : binaryNumber) {
            result += value;
        }

        System.out.println("Number after converting to binary: ");
        System.out.println(result);
    }
}
