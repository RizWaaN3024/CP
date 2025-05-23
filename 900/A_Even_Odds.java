import java.util.Scanner;

public class A_Even_Odds
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        if (k < 1 || k > n) {
            return;
        }
        
        long oddCount = (n + 1) / 2;

        if (k <= oddCount) {
            System.out.println(2 * k - 1);
        } else {
            long evenPosition = k - oddCount;
            System.out.println(2 * evenPosition);
        }
    }
}