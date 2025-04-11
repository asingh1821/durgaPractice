package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OverlappingIntervals {
    public static void main(String[] args) {
        int arr[][] = {{1, 3}, {2, 4}, {6, 8}, {9, 10}};
        List<int[]> res = mergeOverlap(arr);
        for (int[] interval : res) {
            System.out.print("("+ interval[0] +","+interval[1]+")");
        }

    }
    public static List<int[]> mergeOverlap(int[][] arr) {
        int[] array = new int[2];
        List<int[]> list = new ArrayList<>();
        Arrays.sort(arr, (a, b)-> a[0]-b[0]);
        int start = arr[0][0];
        int end = arr[0][1];
        for(int i = 1; i < arr.length; i++) {
            if(end > arr[i][0]){
                end = Math.max(end, arr[i][1]);

            }else{
                array[0] = start;
                array[1] = end;
                list.add(array);
                start = arr[i][0];
                //end = arr[i][1];
            }
        }
        return list;
    }
}
