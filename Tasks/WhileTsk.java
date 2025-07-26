package Tasks;
import java.util.*;

public class WhileTsk {
    
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;

        while (count <= n) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println("Your Enter Number List");
    }
}
