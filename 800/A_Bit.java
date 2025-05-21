import java.util.Scanner;

public class A_Bit
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int X = 0;
        sc.nextLine();
        while(n-- > 0) {
            String x = sc.nextLine();
            switch(x) {
                case "++X":
                    ++X;
                break;
                case "X++":
                    X++;
                break;
                case "--X":
                    --X;
                break;
                case "X--":
                    X--;
                break;
            }
        }
        System.out.println(X);
    }
}