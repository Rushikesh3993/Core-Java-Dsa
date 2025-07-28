package Tasks;

import java.util.*;


public class Even_odd {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter Your Number (0 to exit) : ");
            int n = sc.nextInt();

            if(n == 0) {
                System.out.println("Program Ended");
                break;
            }
            System.out.println((n % 2  == 0) ? "Even Number.." : "Odd Number..");

        }while(true);

    }
}
