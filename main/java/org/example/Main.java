package org.example;

import org.example.BinarySearch.BinareySearch;

public class Main {
    private static BinareySearch binarySearch = new BinareySearch();
    static void main()
    {
        int[] arr = {10, 20, 30, 30,30,30,30,40,40,40, 50};
        System.out.println("Last Occurance " + binarySearch.lastOccurrence(arr,30));
        System.out.println("First Occurance " + binarySearch.firstOccurrence(arr,30));
    }
}
