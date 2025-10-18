import java.util.* ;
import java.io.*;

public class Solution 
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        int start = m+1;
        int end = arr.size()-1;

        while (start<end){
            int temp = arr.get(start);

            arr.set(start, arr.get(end));
            arr.set(end, temp);

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Arrays.asList(1, 2, 3, 4, 5, 6);
        reverseArray(null, 3);
    }
}
