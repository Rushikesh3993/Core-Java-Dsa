public class Dectobin {
    
    public static void dectobin(int n){
        int mynum = n;
        int pow = 0;
        int binNum = 0;
 
        while (n > 0) {
            int ldg = n % 2;
            binNum = binNum + (ldg * (int)Math.pow(10, pow));

            pow++;
            n = n / 2; 
        }
            System.out.println("decimal of " + mynum + " = " + binNum);
    }
    public static void main(String []args) {
        dectobin(9);

    }
}
