import java.util.*;
public class factorial {
    public static void main(String[] args) {
        int num = 0, factorial = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + num + " is " + factorial);
    }
}
