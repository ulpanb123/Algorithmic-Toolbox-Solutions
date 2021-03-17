import java.util.*;
import java.io.*;

public class CarFueling {
    static int computeMinRefills(int dist, int tank, int n,  Vector<Integer> stops) {
        int numRefill = 0;
        int currRefill = 0;
        //if(tank >= dist) return 0;
        while(currRefill <= n) {
            int lastRefill = currRefill;
            while(currRefill <= n && stops.elementAt(currRefill+1)-stops.elementAt(lastRefill) <= tank) {
                currRefill++;
            }
            if(currRefill == lastRefill) {
                return -1;
            }
            if(currRefill <= n) {
                numRefill++;
            }
         }
        return numRefill;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dist = scanner.nextInt();
        int tank = scanner.nextInt();
        int n = scanner.nextInt();
        Vector<Integer> stops = new Vector<Integer>();
        stops.add(0);
        for (int i = 0; i < n; i++) {
            stops.add(scanner.nextInt());
        }
        stops.add(dist);
        System.out.println(computeMinRefills(dist, tank, n, stops));
    }
}
