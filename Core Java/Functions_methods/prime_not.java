public class prime_not {

    public static boolean isprime(int n) {
        if(n == 2) {
            return true;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) {// completely dividing
                return false;
            }
        }
        return true;
    }

    //if you want to print the range 
    public static void primesInRange(int n) {
        for(int i = 2; i <= n; i++) {
            if(isprime(i)) {//true
                System.out.print(i + " ");

            }
        }
        System.out.println();
    }
    

    public static void main(String []args){
        System.out.println(isprime(7));
        primesInRange(45);
    }
}
