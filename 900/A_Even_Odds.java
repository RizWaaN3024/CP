import java.util.Scanner;

public class A_Even_Odds
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        
        int pos = 0;
        for (int i = 1; i <= n; i += 2) {
            arr[pos] = i;
            pos++;
        }
        for (int i = 2; i <= n; i += 2) {
            arr[pos] = i;
            pos++;
        }

        System.out.println(arr[k - 1]);
    }
}