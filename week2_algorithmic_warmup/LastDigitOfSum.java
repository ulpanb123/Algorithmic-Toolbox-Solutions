import java.util.*;

public class LastDigitOfSum {
    public static long pisano(long m)
    {
        long prev = 0;
        long curr = 1;
        long res = 0;

        for(int i = 0; i < m * m; i++)
        {
            long temp = 0;
            temp = curr;
            curr = (prev + curr) % m;
            prev = temp;

            if (prev == 0 && curr == 1)
                res= i + 1;
        }
        return res;
    }

    public static long fibonacciForBigN(long n, int m) {
        long pisano = pisano(m);
        n =  n % pisano;

        if(n == 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        }

        int prev = 0;
        int curr = 1;
        for(int i = 0; i < n - 1 ; i++) {
            int temp = curr;
            curr = (curr+prev) % m;
            prev = temp;
        }
        return curr % m;
    }

    public static long getFibonacciSum(long n) {
        int res = (int) fibonacciForBigN(n + 2, 10);
        if(res == 0) {
            return 9;
        }else {
            return res -1;
        }
    }

    public static void main(String argc[]) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        System.out.println(getFibonacciSum(n));
    }
}

