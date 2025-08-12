package patterns;

public class Character_A_ptrn {
    public static void main(String[] args) {
        int n = 4;
        
        for(int i = 1; i <= n; i++){
            char ch = 'A';  // reset to 'A' for each row
            for(int chars = 1; chars <= i; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
    
