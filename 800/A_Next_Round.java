import java.util.Scanner;

public class A_Next_Round
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int scores[] = new int[n];
        int qualifyCount = 0;

        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (scores[i] >= scores[k - 1] && scores[i] > 0) {
                qualifyCount++;
            }
        }

        System.out.println(qualifyCount);
    }
}