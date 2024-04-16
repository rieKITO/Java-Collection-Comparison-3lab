package org.example;

import java.util.List;

public class CollectionPerformanceTester {
    private final List<Integer> list;

    public CollectionPerformanceTester(List<Integer> list) {
        this.list = list;
    }

    public double testAdd(int numElements, int numIterations) {
        double totalElapsedTime = 0;
        for (int j = 0; j < numIterations; j++) {
            long startTime = System.currentTimeMillis();
            for (int i = 0; i < numElements; i++) {
                list.add(i);
            }
            totalElapsedTime += (System.currentTimeMillis() - startTime);
            list.clear();
        }
        return totalElapsedTime;
    }

    public double testDelete(int numElements, int numIterations) {
        double totalElapsedTime = 0;
        for (int j = 0; j < numIterations; j++) {
            for (int i = 0; i < numElements; i++) {
                list.add(i);
            }
            long startTime = System.currentTimeMillis();
            while (!list.isEmpty()) {
                list.remove(0);
            }
            totalElapsedTime += (System.currentTimeMillis() - startTime);
            list.clear();
        }
        return totalElapsedTime;
    }

    public double testGet(int numElements, int numIterations) {
        for (int i = 0; i < numElements; i++) {
            list.add(i);
        }
        double totalElapsedTime = 0;
        for (int j = 0; j < numIterations; j++) {
            long startTime = System.currentTimeMillis();
            for (int i = 0; i < numElements; i++) {
                int element = list.get(i);
            }
            totalElapsedTime += (System.currentTimeMillis() - startTime);
        }
        return totalElapsedTime;
    }
}
