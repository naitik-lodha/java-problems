import java.util.*;
public class pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = 0, j = 0;
        boolean flag = true;
        System.out.println("Enter a string or number");
        String s = sc.nextLine();
        len = s.length();
        j = len - 1;
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) == s.charAt(j)) {
                j--;
            } else {
                flag = false;
                break;
            }
        }
        if (flag == false)
            System.out.println("The string entered is not pallindrome");

        else
            System.out.println("The string entered is pallindrome");
    }
}
