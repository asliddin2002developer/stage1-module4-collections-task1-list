package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    public int asecndingOrder(String n) {
        int nInt = Integer.parseInt(n);
        return (int)Math.pow(5 * nInt, 2) + 3;
    }

    @Override
    public int compare(String a, String b) {
        if (asecndingOrder(a) == asecndingOrder(b)) {
            return a.compareTo(b);
        } else {
            return asecndingOrder(a) - asecndingOrder(b);
        }
    }
}