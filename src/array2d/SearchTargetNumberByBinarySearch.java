package array2d;

public class SearchTargetNumberByBinarySearch {
    public static void main(String[] args) {
        int[][] grid = {{3,4,7,9}, {12,13,16,18}, {20,21,23,29}};
        int targetNumber = 12;
        boolean numberIsPresent = isTargetPresent(grid, targetNumber);
        System.out.println("The target number "+ targetNumber + "is present : "+ numberIsPresent);
    }
    public static boolean isTargetPresent(int[][] grid, int target){
        int n = grid[0].length;
        for(int i = 0; i < n; i++){
           if(grid[i][0] < target && target <= grid[i][n-1]){
              return binarySearch(grid[i], target);
           }else if(target > grid[i][n-1]) {
               return false;
           }
        }
        return false;
    }
    public static boolean binarySearch(int[] grid, int target){
        int low = 0, high = 3;
        while( low <= high){
            int mid = low + (high - low)/2;
            if(grid[mid] == target){
                return true;
            }else if(grid[mid] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return false;
    }


}
