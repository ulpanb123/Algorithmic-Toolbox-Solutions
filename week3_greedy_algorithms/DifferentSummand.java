import java.util.*;
import java.io.*;

public class DifferentSummand {
    public static ArrayList<Integer> findDivisions(int n) {
        int curr = 1;
        int given = 1;
        ArrayList<Integer> divisions = new ArrayList<>();
        divisions.add(curr);
        while(n - given >= curr + 1) {
            curr++;
            given += curr;
            divisions.add(curr);
        }
        if(given != n) {
            divisions.set(divisions.size() - 1, divisions.get(divisions.size() - 1) + (n - given));
        }
        return divisions;
    }

    public static void main (String [] argc) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Integer> result = new ArrayList<>(findDivisions(n));
        System.out.println(result.size());
        for(int i = 0; i < result.size(); ++i) {
            System.out.print(result.get(i) + " ");
        }
    }

}
