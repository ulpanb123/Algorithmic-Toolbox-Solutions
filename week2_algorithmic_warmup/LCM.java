import java.util.*;

public class LCM {

    private static int gcd(int a, int b) {
        int foo;
        while(b != 0) {
            foo = a;
            a = b;
            b = foo%b;
        }
        foo = a;
        return foo;
    }

    private static long lcm(int a, int b) {

        int gcd = gcd(a, b);
        int new_a = a/gcd;
        int new_b = b/gcd;
        long lcm = (long) a*new_b;
        return lcm;
    }

    public static void main(String argc[]) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        long lcm = lcm(a, b);
        System.out.println(lcm);
    }
}
