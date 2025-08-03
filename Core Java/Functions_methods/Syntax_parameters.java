import java.util.Scanner;

public class Syntax_parameters {

    // here we pass the parameters

    public static int calculateSum(int num1, int num2) {// formal parameters

        int sum = num1 + num2;
        // System.out.println("sum Is : " + sum);

        return sum; // we call return for int

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a, b);//arguments or actual paramters
        System.out.println("sum Is : " + sum);

    }
}
