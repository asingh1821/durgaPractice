package quickSort;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {4,9,1,2,0,8};
        Arrays.sort(arr);
        int a = 0,b = arr.length-1;
        partiotion(arr,a,b);
    }
    //step 1: partition the array using pivot element
    // take lower bound at arr[0] and ub at arr[arr.length-1]
    public static void partiotion(int[] arr, int lb, int ub) {
        int pivot = arr[lb];
        int start = arr[0];
        int end = arr[arr.length-1];
        while(start <= end) {
            while(arr[start] <= pivot) {
                start++;
            }
            while(arr[end] > pivot) {
                end--;
            }
            if(start < end){
                swap(arr[start],arr[end]);
            }
        }
    }
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
