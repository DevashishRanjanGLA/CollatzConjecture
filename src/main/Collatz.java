package main;

import java.util.ArrayList;
import java.util.List;

public class Collatz {
    public List<Integer> getCollatzStringForNumber(int n) {
        double t1;
        List<Integer> list = new ArrayList<Integer>();
        for (int i = n; i <= n; ++i) {
            if (i % 2 == 0) {
                t1 = 0.5 * i;
            } else {
                t1 = (i * 3) + 1;
            }
            list.add((int) t1);
        }
        return list;
    }
}
