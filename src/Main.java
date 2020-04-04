import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int decimalNumber = sc.nextInt();
        String result = "";

        Stack<Integer> binaryNumber = new Stack<>();
        while (decimalNumber != 0) {
            int remainder = decimalNumber % 2;
            decimalNumber = decimalNumber / 2;
            binaryNumber.push(remainder);
        }

        System.out.println("Number after converting to binary: ");
        while (!binaryNumber.isEmpty()) {
            System.out.print(binaryNumber.pop());
        }
    }
}
