import java.util.*;

public class A_Twins
{
    public static void twins(int[] coins) 
    {
        Arrays.sort(coins);

        int sum = 0;
        int count = 0;
        for (int i = 0; i < coins.length; i++) {
            sum += coins[i];
        }
        int threshold = sum / 2;
        int sum2 = 0;;
        for (int i = coins.length - 1; i >= 0; i--) {
            sum2 += coins[i];
            count++;
            if (sum2 > threshold) {
                break;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
        twins(coins);
    }
}