import java.util.Scanner;

public class MoneyChange {
    private static int getChange(int m) {
        int count = 0;
        int[] small = {10, 5, 1};
        for(int i = 0; i < 3; ++i) {
            while(m >= small[i]) {
                count++;
                m -= small[i];
            }
            if(m == 0) {
                break;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));
    }
}
