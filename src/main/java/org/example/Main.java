package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int numIterations = 1000;
        int numElements = 10000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        CollectionPerformanceTester arrayListTester = new CollectionPerformanceTester(arrayList);
        CollectionPerformanceTester linkedListTester = new CollectionPerformanceTester(linkedList);

        System.out.println("Add method total execution time (ms):\n" +
                "Number of iterations: " + numIterations);
        System.out.println("ArrayList: " + arrayListTester.testAdd(numElements, numIterations) + " ms");
        System.out.println("LinkedList: " + linkedListTester.testAdd(numElements, numIterations) + " ms");

        System.out.println("\nDelete total method execution time (ms):\n" +
                "Number of iterations: " + numIterations);
        System.out.println("ArrayList: " + arrayListTester.testDelete(numElements, numIterations) + " ms");
        System.out.println("LinkedList: " + linkedListTester.testDelete(numElements, numIterations) + " ms");

        numIterations = 200;
        System.out.println("\nGet method total execution time (ms):\n" +
                "Number of iterations: " + numIterations);
        System.out.println("ArrayList: " + arrayListTester.testGet(numElements, numIterations) + " ms");
        System.out.println("LinkedList: " + linkedListTester.testGet(numElements, numIterations) + " ms");
    }
}