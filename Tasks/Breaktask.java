package Tasks;

import java.util.*;

public class Breaktask {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        

        do{
            System.out.println("Enter Your Number : ");
            int num = sc.nextInt();
            if(num % 10 == 0){
                break;
            }
            System.out.println(num);
        }while(true);
    }
}
