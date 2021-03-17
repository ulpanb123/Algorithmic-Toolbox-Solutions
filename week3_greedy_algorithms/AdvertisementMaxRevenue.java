import java.util.*;
import java.io.*;

public class AdvertisementMaxRevenue {
    private static long maxDotProduct(int[] a, int[] b) {
        //write your code here
        Vector<Integer> price = new Vector<Integer>(a.length);
        Vector<Integer> click = new Vector<Integer>(b.length);
        for(int i = 0; i < a.length; i++) {
            price.add(a[i]);
            click.add(b[i]);
        }
        Collections.sort(price);
        Collections.sort(click);
        long result = 0;
        for (int i = 0; i < a.length; i++) {
            result += (long)price.elementAt(i) * click.elementAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        System.out.println(maxDotProduct(a, b));
    }
}
