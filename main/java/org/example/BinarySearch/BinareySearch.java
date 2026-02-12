package org.example.BinarySearch;

public class BinareySearch
{
    // Given a sorted array of N integers, write a program to find the index of the
    // last occurrence of the target key. If the target is not found then return -1.
    // Note: Consider 0 based indexing
    public int lastOccurrence(int[] arr, int target)
    {
        int ans = -1;
        int left = 0;
        int right = arr.length - 1;
        while(left <= right)
        {
            int mid = left + (right - left) / 2;

            if(arr[mid] == target)
            {
                ans = mid;
                left = mid + 1;
            }
            else if(arr[mid] < target)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }

        return ans;
    }
    public int firstOccurrence(int[] arr, int target)
    {
        int ans = -1;
        int left = 0;
        int right = arr.length - 1;
        while(left <= right)
        {
            int mid = left + (right - left) / 2;

            if(arr[mid] == target)
            {
                ans = mid;
                right = mid - 1;
            }
            else if(arr[mid] < target)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }

        return ans;
    }

}
