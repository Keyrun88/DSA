package org.example;

import org.example.BinarySearch.BinareySearch;

public class Main {
    private static BinareySearch binarySearch = new BinareySearch();
    static void main()
    {
        int[] firstLastOccoranceArr = {10, 20, 30, 30,30,30,30,40,40,40, 50};
        int[] searchArr = {3, 4, 6, 7, 9, 12, 16, 17};
        System.out.println("Last Occurance " + binarySearch.lastOccurrence(firstLastOccoranceArr,30));
        System.out.println("First Occurance " + binarySearch.firstOccurrence(firstLastOccoranceArr,30));
        int target = 9;
        System.out.println("Serached " + target+" in array using BinarySearch at index  " + binarySearch.search(searchArr,9));
    }
}
