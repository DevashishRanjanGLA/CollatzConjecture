package main;

import java.util.ArrayList;
import java.util.List;

public class Collatz {
    public List<Integer> getCollatzStringForNumber(int n) {

        List<Integer> list = new ArrayList<Integer>();
        for (int i = n; i <= n; ++i) {
            if (i % 2 == 0) {
                i = i / 2;
            } else {
                i = i * 3 + 1;
            }
            list.add(i);
        }
        return list;
    }
}
