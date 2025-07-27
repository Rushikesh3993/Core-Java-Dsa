package Tasks;

import java.util.*;

public class Multiple_10 {

    public static void main(String[] args) {


        // by for loop  

        // Scanner sc = new Scanner(System.in);
        // for (int i = 1; i <= 5; i++) {
        //     System.out.println("Enter Your Number : ");
        //     int num = sc.nextInt();
        //     if (num % 10 == 0) {
        //         System.out.println("Not Allowed " + num);
        //         continue;
        //     }
        //     System.out.println("Number Was Allowed " + num);
        // }


        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("Enter YOur Numberv : ");
            int n = sc.nextInt();

            if(n % 10 == 0){
                continue;
            }

            System.out.println("Number was : " + n);
        }while(true);


    }
}
