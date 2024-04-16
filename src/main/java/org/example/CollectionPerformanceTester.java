package org.example;

import java.util.List;

public class CollectionPerformanceTester {
    private final List<Integer> list;

    public CollectionPerformanceTester(List<Integer> list) {
        this.list = list;
    }

    public long testAdd(int numElements) {
        long startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            list.add(i);
        }
        long elapsedTime = (System.nanoTime() - startTime) / numElements;
        list.clear();
        return elapsedTime;
    }
}
