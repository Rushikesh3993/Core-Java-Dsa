//  Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise. Also write a program to test your method

package Function_question;

public class Even_odd {
    

    public static boolean isEven(int n){
        if(n % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String []args){

        System.out.println(isEven(4));
    }
}

// ## Shorter version of this

// public class Even_odd {
//     public static boolean isEven(int n){
//         return n % 2 == 0;
//     }

//     public static void main(String[] args){
//         System.out.println(isEven(4));  // Output: true
//         System.out.println(isEven(7));  // Output: false
//     }
// }

