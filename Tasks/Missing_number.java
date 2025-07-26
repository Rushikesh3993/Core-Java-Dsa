package Tasks;

public class Missing_number {
    public static void main(String[] args) {
        int n = 10;
        int tsum = n * (n + 1) / 2;
        int missingsum = 0;
        int Missing_number;
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 10 };

        for (int i = 0; i < arr.length; i++) {
            missingsum = missingsum + arr[i];
        }

        System.out.println(tsum);
        System.out.println(missingsum);
        Missing_number = tsum - missingsum;
        System.out.println(Missing_number);

    }
}
