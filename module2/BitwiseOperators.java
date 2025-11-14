import java.util.*;

public class BitwiseOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        System.out.println("Bitwise AND: " + Integer.toBinaryString(a & b));
        System.out.println("Bitwise OR : " + Integer.toBinaryString(a | b));
        System.out.println("Bitwise XOR: " + Integer.toBinaryString(a ^ b));
        sc.close();
    }
}
