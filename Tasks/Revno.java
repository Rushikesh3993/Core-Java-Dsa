package Tasks;

public class Revno {
    public static void main(String[] args) {
        // int n = 1221;
        int n = 10899;
        int temp = n;
        int rev = 0;

        while( n > 0){
        int lastDigit = n % 10;
        rev = rev * 10 + lastDigit;
        n = n / 10;
        }

        System.out.println(rev);

        if (temp == rev) {
        System.out.println("This is palndorme");
        }
        else {
        System.out.println("THis is not palndorme");
        }


        // int n = 122971;

        // String str = String.valueOf(n);
        // String rev = "";
        // for (int i = str.length()-1; i >=0; i--) {
        //     rev += str.charAt(i);
        // }
        //  System.out.println(rev);
    }
}
