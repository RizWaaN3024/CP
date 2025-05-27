import java.util.Scanner;

public class A_Chewbacca_and_Number
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char num[] = s.toCharArray();
        int f = num[0] - '0';
        if (f == 9) {
            num[0] = '9';
        } else if (f >= 5) {
            num[0] = (char)('0' + (9 - f)); 
        }

        for (int i = 1; i < num.length; i++) {
            f = num[i] - '0';
            if (f < 5 || f == 0) {
                continue;
            } else {
                num[i] = (char)('0' + (9 - f));
            }
        }

        System.out.println(new String(num));
    }
}