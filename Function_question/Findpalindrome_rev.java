// Write a Java program to check if a number is a palindrome in Java? (121 is a palindrome, 321 is not)
// A number is called a palindrome if the number is equal to the reverse of a number e.g., 121 is a palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a palindrome because the reverse of 321 is 123, which is not equal to 321.

package Function_question;

public class Findpalindrome_rev {
    
    public static void palindrome( int n){
        int temp = n;
        int rev = 0;

        while(n > 0){
            int ldg = n % 10;
            rev = rev * 10 + ldg;
            n = n / 10;
        }

        if(temp == rev){
            System.out.println("This is Palndrome ");
        }else{
            System.out.println("This Not palindrome");
        }

    }
    public static void main(String []args){
            palindrome(121);
    }
}
