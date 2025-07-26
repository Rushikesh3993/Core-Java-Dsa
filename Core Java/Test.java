public class Test {
    public static void main(String[] args){
        int a = 1; 
        int b = 2;
        String c = "Sum";
        char d = 'd';
        float e = 1.2f;
        // System.out.println(a+b+c);
        System.out.println(c + "of" + a + " & " + b + " : " + (a + b));
        // System.out.print(c + " of " + a + " &  " + b + " : " + (a + b) + "\n");
        // System.out.printf(c + " of " + a + " & " + b + " : " + (a + b) + "\n");
        // System.out.printf("Hello" + "\n"); 
        
        System.out.printf("%s of %d & %d: %d" , c, a, b, a + b);

        System.err.printf("%c %.2f", d , e);
    }
}