package org.example;

import java.util.List;

public class CollectionPerformanceTester {
    private final List<Integer> list;

    public CollectionPerformanceTester(List<Integer> list) {
        this.list = list;
    }

    public long testAdd(int numElements, int numIterations) {
        long totalElapsedTime = 0;
        for (int j = 0; j < numIterations; j++) {
            long startTime = System.nanoTime();
            for (int i = 0; i < numElements; i++) {
                list.add(i);
            }
            totalElapsedTime += (System.nanoTime() - startTime);
            list.clear();
        }
        return totalElapsedTime / numIterations / numElements;
    }
}
