import java.util.*;
public class segregateEvenOddIntegers {

        public static void main(String[] args) {
            int[] arr = {3,9,2,5,0,1,7,8,11,12,17,2,5};
            int[] res = evenOdd(arr);
            for(int i : res)
                System.out.print(i + " ");
        }
        public static int[] evenOdd(int[] arr){
            int low = 0, high = arr.length - 1;
            while(low <= high){
                if(arr[low] % 2 != 0 ){
                    if(arr[high]%2 == 0){
                        int temp = arr[low];
                        arr[low] = arr[high];
                        arr[high] = temp;
                        low++; high--;
                    }else{
                        high--;
                    }
                }else{
                    low++;
                }
            }
            return arr;
        }
    }
