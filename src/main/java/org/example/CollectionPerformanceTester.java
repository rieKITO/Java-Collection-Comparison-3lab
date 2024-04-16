package org.example;

import java.util.List;

public class CollectionPerformanceTester {
    private List<Integer> list;
    private long elapsedTime;

    public CollectionPerformanceTester(List<Integer> list) {
        this.list = list;
    }

    public void testAdd(int numElements) {
        long startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            list.add(i);
        }
        elapsedTime = (System.nanoTime() - startTime) / numElements;
        System.out.println("Add operation: " + elapsedTime + " ns");
        list.clear();
    }
}
