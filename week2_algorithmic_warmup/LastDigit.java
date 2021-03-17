import java.util.Scanner;

public class LastDigit {
    private static int lastDigit(int n) {
        int [] fibonacciNum = new int [n+1];
        fibonacciNum[0] = 0;
        fibonacciNum[1] = 1;
        for( int i = 2; i < fibonacciNum.length; ++i) {
            fibonacciNum[i] = (fibonacciNum[i-1] + fibonacciNum[i-2])%10;
        }
        return fibonacciNum[n];
    }

    public static void main(String argc[]) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        int lastDigit;
        if(input == 0 || input == 1) {
            lastDigit =  input;
        } else {
            lastDigit = lastDigit(input);
        }
        System.out.println(lastDigit);
    }
}

