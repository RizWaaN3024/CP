import java.util.Scanner;

public class A_Team
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int problemCount = 0;
        while (n-- > 0) {
            int petya = sc.nextInt();
            int vatsya = sc.nextInt();
            int tonya = sc.nextInt();

            if (petya == 1 && vatsya == 1) {
                problemCount++;
            } else if (petya == 1 && tonya == 1) {
                problemCount++;
            } else if (vatsya == 1 && tonya == 1) {
                problemCount++;
            }
        }
            System.out.println(problemCount);
    }
}