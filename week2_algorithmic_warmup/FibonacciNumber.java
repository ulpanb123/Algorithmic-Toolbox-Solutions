import java.util.Scanner;

public class FibonacciNumber {
    private static long fibonacci(int n) {
        int [] fibonacciNum = new int[n+1];
        fibonacciNum[0] = 0;
        fibonacciNum[1] = 1;
        for(int i = 2; i < fibonacciNum.length; ++i) {
            fibonacciNum[i] = fibonacciNum[i-1] + fibonacciNum[i-2];
        }
        return fibonacciNum[n];
    }

    public static void main(String argc[]) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        long fibonacci;
        if(input == 0 || input == 1) {
            fibonacci = input;
        } else {
            fibonacci = fibonacci(input);
        }
        System.out.println(fibonacci);
    }
}
