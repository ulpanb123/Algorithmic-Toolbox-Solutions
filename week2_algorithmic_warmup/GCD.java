import java.util.Scanner;

public class GCD {
    private static int euclidean(int a, int b) {
        int foo;
        while(b != 0) {
            //System.out.println(a + " "+ b);
            foo = a;
            a = b;
            b = foo%b;
        }
        foo = a;
        return foo;
    }

    public static void main(String arc[]) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int denom = s.nextInt();
        int gcd = euclidean(num, denom);
        System.out.println(euclidean(num, denom));
    }
}
