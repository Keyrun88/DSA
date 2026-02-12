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
    //Given a sorted array of integers nums with 0-based indexing, find the index of a specified target integer. If the target is found in the array, return its index. If the target is not found, return -1.
    //Example 1
    //Input: nums = [-1,0,3,5,9,12], target = 9
    //Output: 4
    //Explanation: The target integer 9 exists in nums and its index is 4
    //Example 2
    //Input: nums = [-1,0,3,5,9,12], target = 2
    //Output: -1
    //Explanation: The target integer 2 does not exist in nums so return -1
    public int search(int[] arr, int target)
    {
        int n = arr.length;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) return mid;
            else if (target > arr[mid]) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}
