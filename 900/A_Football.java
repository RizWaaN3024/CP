import java.util.Scanner;

public class A_Football
{
    public static void isDangerous(String team) {
        int onePtr = 0;
        int zeroPtr = 0;
        for (int i = 0; i < team.length(); i++) {
            char c = team.charAt(i);
            if (c == '0') {
                zeroPtr += 1;
                if (zeroPtr >= 7) break;
                onePtr = 0;
            } else {
                onePtr += 1;
                if (onePtr >= 7) break;
                zeroPtr = 0;
            }
        } 
        if (zeroPtr >= 7 || onePtr >= 7) {
            System.out.print("YES");
        } else {
            System.out.println("NO");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        A_Football obj = new A_Football();
        obj.isDangerous(s);
    }
}