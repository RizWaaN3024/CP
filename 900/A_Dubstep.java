import java.util.*;

public class A_Dubstep
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        
        String[] parts = s.split("WUB");

        StringBuilder result = new StringBuilder();

        for (String part : parts) {
            if (!part.isEmpty()) {
                if (result.length() > 0) {
                    result.append(" ");
                }
                result.append(part);
            }
        }
        System.out.println(result.toString());
    }
}