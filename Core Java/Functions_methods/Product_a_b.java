public class Product_a_b {

    public static int multiply(int n1, int n2) {
        int product = n1 * n2;
        return product;

    }

    public static void main(String[] args) {

        int a = 3;
        int b = 5;
        int prod = multiply(a, b);
        System.out.println(prod);
        prod = multiply(12 , 12);
        System.out.println(prod);

    }
}
