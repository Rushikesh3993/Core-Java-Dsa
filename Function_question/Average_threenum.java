

//Write a java mothod to compute the average of three nnumbers
package Function_question;

public class Average_threenum {
    public static void average(int a, int b , int c){
        // int sum = a + b + c;
        double sum = a + b + c;
        sum /= 3;

        System.out.print(sum);

    }

    public static void main(String []args) {
        ;

        average(10,20,50);

    }
    
}
