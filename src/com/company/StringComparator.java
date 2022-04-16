package com.company;

import java.util.Comparator;


public  class StringComparator implements Comparator<String> {


    @Override
    public int compare(String o1, String o2) {
        int firstStringLength = o1.length();
        int secondStringLength = o2.length();

        if (firstStringLength > secondStringLength) {
            return 1;

        }
        if (firstStringLength < secondStringLength) {
            return -1;

        }
        return 0;
    }
}
