
public class Function_overloading {

    // function overloading using parameters

    // public static int sum(int a, int b) {
    //     return a + b;
    // }

    // function overloading using parameters
    // public static int sum(int a, int b, int c) {
    //     return a + b + c;
    // }

    // function overloading using data Types
    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(float a, float b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(sum(4, 5));
        // System.out.println(sum(3, 4, 7));
        System.out.println(sum(3.4f, 2.3f));
    }

}
