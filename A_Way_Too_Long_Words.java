import java.util.Scanner;

public class A_Way_Too_Long_Words
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while (n-- > 0) {
            String s = sc.nextLine();
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                count++;
            }
            if (s.length() > 10) {
                String result = s.charAt(0) + Integer.toString(count - 2) + s.charAt(s.length() - 1);
                System.out.println(result);
            } else {
                System.out.println(s);
            }
        }
    }
}