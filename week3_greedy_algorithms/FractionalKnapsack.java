import java.util.*;

public class FractionalKnapsack {

    private static TreeMap<Double, Integer> orderedPrices(int[] values, int[] weights, int size) {
        TreeMap<Double, Integer> sorted = new TreeMap<>(Collections.reverseOrder());
        for(int i = 0; i < size; ++i) {
            sorted.put((double) values[i]/weights[i], weights[i]);
        }
       // System.out.println(sorted.get(0) + " " + sorted.get(1));
        return sorted;
    }

    private static double getOptimalValue(int capacity, int[] values, int[] weights, int size) {
        double value = 0;
        //write your code here
        TreeMap < Double, Integer>  prices = orderedPrices(values, weights, size);
        for(Map.Entry m: prices.entrySet()) {
            if(capacity == 0) {
                return value;
            }
            int a = Math.min((int)m.getValue(), capacity);
           // System.out.println("a: "+a);
            value += a*((double)m.getKey());
            capacity -= a;
        }
        return value;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        System.out.println(getOptimalValue(capacity, values, weights, n));
    }
}
