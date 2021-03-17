/*import java.util.*;
import java.io.*;

public class CollectingSignatures {
    private static Segment[] sortSegments(Segment[] segments) {
        Vector<Integer> sorted =
    }
    private static int[] optimalPoints(ArrayList<Segment> segments) {
        //write your code here
        int[] points = new int[2 * segments.size()];
        for (int i = 0; i < segments.size(); i++) {
            points[2 * i] = segments.get(i).start;
            points[2 * i + 1] = segments.get(i).end;
        }
        return points;
    }

    private static class Segment {
        int start, end;

        Segment(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Segment> segments = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            int start, end;
            start = scanner.nextInt();
            end = scanner.nextInt();
            segments.add(new Segment(start, end));
        }
        Collections.sort(segments);
        int[] points = optimalPoints(segments);
        System.out.println(points.length);
        for (int point : points) {
            System.out.print(point + " ");
        }
    }
}*/
