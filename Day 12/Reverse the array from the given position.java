/*
Reverse the array after the given position.
arr=[1,2,3,4,5,6], m=3, output=[1,2,3,4,6,5]
*/
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        int temp;
        int n=arr.size();
        int start=m+1;
        int end=n-1;
        while(start<end)
        {
            Collections.swap(arr, start, end);
            start++;
            end--;
        }
        return arr;
    }
}
